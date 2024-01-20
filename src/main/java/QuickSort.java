import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuickSort {
    public void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Collections.addAll(list, 1,2,3,5,6,7,8,9,10);

        List<Integer> sorted = new ArrayList<>();

        sorted = quicksort(list);

        System.out.println(sorted);

    }

    public List<Integer> quicksort(List<Integer> array) {

        if (array.size() <= 1) {
            return array;
        }

        var pivot = array.get(0);

        var right = new ArrayList<>();
        var left = new ArrayList<>();


        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < pivot) left.add(array.get(i));
            else right.add(array.get(i));
        }

        return array;
    }
}
