package arraySorter;

import static org.junit.jupiter.api.Assertions.*;

public abstract class QuickSortTest<T extends Comparable<? super T>> extends ArraySortTest<T> {
    @Override
    ArraySort<T> getSorter(){return new QuickSort<T>(); }


}