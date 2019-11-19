package arraySorter;

public class QuickSort<T extends Comparable<? super T>> implements ArraySort<T> {


    public T[] sort(T[] array, int low, int high) {

        if (low < high) {
            int index = partition(array, low, high);
            sort(array, low, high);
            sort(array, index + 1, high);
        }

        return array;
    }

    int partition(T[] array, int low, int high){
        T pivot = array[high];
        int i = (low-1);
        for (int j=low; j<high; j++){
            if (array[j].compareTo(pivot) < 0){
                i++;
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        T temp = array[i + 1];
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;
    }
    }
