package arraySorter;

public class QuickSort<T extends Comparable<? super T>> implements ArraySort<T> {


    public T[] Quicksort(T[] array, int low, int high) {

        if (low < high) {
            int pi = partition(array, low, high);
            Quicksort(array, low, pi-1);
            Quicksort(array, pi + 1, high);

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
    public T[] sort(T[] array){

        return Quicksort(array, 0, array.length-1);


    }
    }
