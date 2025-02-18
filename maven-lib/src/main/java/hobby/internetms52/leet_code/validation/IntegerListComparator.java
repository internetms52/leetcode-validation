package hobby.internetms52.leet_code.validation;

import java.util.Comparator;
import java.util.List;

public class IntegerListComparator {
    public static final Comparator<List<Integer>> listComparator = (list1, list2) -> {
        if (list1.size() != list2.size()) {
            return Integer.compare(list1.size(), list2.size());
        }
        for (int i = 0; i < list1.size(); i++) {
            int compare = list1.get(i).compareTo(list2.get(i));
            if (compare != 0) return compare;
        }
        return 0;
    };
}
