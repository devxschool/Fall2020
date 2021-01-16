package lists;

import java.util.List;

public class MoveToEnd {

    public List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int i = 0;
        int j = array.size() - 1;
        while (i < j) {
            while (array.get(j) == toMove) {
                j--;
            }
            if (array.get(i) == toMove) {
                int temp = array.get(j);
                array.set(j, array.get(i));
                array.set(i, temp);
            }
            i++;
        }
        return array;
    }
}
