package hobby.internetms52.leetcode.validation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MutualContainmentTest {
    @Test
    public void test1() {
        List<List<Integer>> a = List.of(List.of(1, 0, -1, 0));
        List<List<Integer>> b = List.of(List.of(0, -1, 0, 1));
        Assertions.assertTrue(ListOfIntegerLists.isMutualContainment(a, b));
    }

    @Test
    public void test2() {
        List<List<Integer>> a = List.of(List.of(1, 0, -1));
        List<List<Integer>> b = List.of(List.of(0, -1, 0, 1));
        Assertions.assertFalse(ListOfIntegerLists.isMutualContainment(a, b));
    }

}
