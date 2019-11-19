package arraySorter;

import java.util.Comparator;

public class SelectionSort<T extends Comparable<? super T>> implements ArraySort<T> {

    public T[] sort(T[] array) {
        int n = array.length;
        for (int currentPlace = 0; currentPlace< n - 1; currentPlace++) {
            int smallestAt = currentPlace;
            for (int check = currentPlace+1; check < n; check++) {
                if (array[check].compareTo(array[smallestAt]) < 0)
                    smallestAt = check;
            }
            // String is changed to T
            T temp = array[currentPlace];
            array[currentPlace] = array[smallestAt];
            array[smallestAt] = temp;

        }

        return array;
    }
}

