package hobby.internetms52.leetcode.validation;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A utility class that provides method for check mutual containment between sets.
 *
 * @author Eugene Lu.
 * @version 1.0
 */
public class ListOfIntegerLists {
    private static final Comparator<List<Integer>> listComparator = (list1, list2) -> {
        if (list1.size() != list2.size()) {
            return Integer.compare(list1.size(), list2.size());
        }
        for (int i = 0; i < list1.size(); i++) {
            int compare = list1.get(i).compareTo(list2.get(i));
            if (compare != 0) return compare;
        }
        return 0;
    };

    private static boolean check(List<Integer> aList, List<Integer> bList) {
        if (aList.size() != bList.size()) {
            return false;
        }
        HashSet<Integer> aSet = new HashSet<>(aList);
        HashSet<Integer> bSet = new HashSet<>(bList);
        return aSet.equals(bSet);
    }

    public static boolean isMutualContainment(List<List<Integer>> resultList, List<List<Integer>> targetList) {
        if (resultList.size() != targetList.size()) {
            return false;
        } else {
            List<List<Integer>> sortedResultList = resultList.stream().map(list -> {
                return list.stream().sorted().collect(Collectors.toList());
            }).sorted(listComparator).toList();
            List<List<Integer>> sortedTargetList = targetList.stream().map(list -> {
                return list.stream().sorted().collect(Collectors.toList());
            }).sorted(listComparator).toList();
            for (int i = 0; i < resultList.size(); i++) {
                if (!check(sortedTargetList.get(i), sortedResultList.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
