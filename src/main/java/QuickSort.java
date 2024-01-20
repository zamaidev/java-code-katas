import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(17);
        list.add(14);
        list.add(23);
        list.add(2);
        list.add(4);
        list.add(9);
        list.add(15);
        list.add(1);
        list.add(0);
        list.add(3);
        list.add(5);

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
