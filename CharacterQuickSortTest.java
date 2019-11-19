package arraySorter;

import arrayGenerator.ArrayGenerator;
import arrayGenerator.CharacterArrayGenerator;
import arraySorter.QuickSort;
import arraySorter.QuickSortTest;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterQuickSortTest extends QuickSortTest<Character> {
    @Override
    ArrayGenerator<Character> getGenerator(){return new CharacterArrayGenerator(); }

}