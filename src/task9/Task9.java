package task9;

import java.util.ArrayList;
import java.util.List;

public class Task9 {
    public static List<Integer> removeDoubleElement(int[] arr) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    list2.add(arr[j]);
                    i += 1;
                }
            }
            list.add(arr[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list.get(i) == list2.get(j)) list.remove(i);
            }
        }
        return list;
    }
    // todo : success

    public static void main(String[] args) {
        int[] ints1 = {1, 2, 3, 4, 5, 3, 76, 3, -9,-9};
        int[] ints3 = {12, 23, 12, 34, 344, -98, 334};
        System.out.println(removeDoubleElement(ints1));
        System.out.println(removeDoubleElement(ints3));
    }
}
