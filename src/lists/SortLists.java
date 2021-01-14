package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortLists {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(123);
        nums.add(5);
        nums.add(45);
        nums.add(335);
        nums.add(845);

        System.out.println(nums);
        //Arrays.sort(arr);
        //sort in ascending order
        Collections.sort(nums);

        System.out.println(nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println(nums);

        //another way of sorting lists.
        nums.sort(Comparator.naturalOrder());
        System.out.println(nums);

        //reverse sort
        nums.sort(Comparator.reverseOrder());

        //never use == to compare values of objects.
        //.equals() in Lists -> used for comparing two lists' content(values)
        //.equals() in array -> same as ==;
    }
}
