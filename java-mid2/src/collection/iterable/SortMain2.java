package collection.iterable;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {

    public static void main(String[] args) {

        Integer[] arr = {5, 2, 8, 1, 3};
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("comparator 비교");
        Arrays.sort(arr, new AscComparator().reversed());
        System.out.println(Arrays.toString(arr));

    }

    static class AscComparator implements Comparator<Integer> {


        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = " + o1+", o2 = " + o2);
            return o1.compareTo(o2);
        }
    }


}
