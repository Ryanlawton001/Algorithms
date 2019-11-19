package arraySorter;

import arrayGenerator.ArrayGenerator;
import arrayGenerator.CharacterArrayGenerator;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterSelectionSortTest extends SelectionSortTest<Character> {
    @Override
    ArrayGenerator<Character> getGenerator(){return new CharacterArrayGenerator();}

}