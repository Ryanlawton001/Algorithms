package LinkedListTest;

import arrayGenerator.generator.IntegerArrayGenerator;
import arrayGenerator.scope.IntegerScope;
import linkedList.list.ListAccessError;
import linkedList.list.SinglyLinkList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkListTest {

private void testSingly() throws ListAccessError {
    SinglyLinkList<Integer> singlyLinkList = new SinglyLinkList<>();
    IntegerArrayGenerator integerArrayGenerator = new IntegerArrayGenerator(new IntegerScope(1,100));
    Integer [] myArray = integerArrayGenerator.getArray(100);
    for(int i = 0; i < myArray.length; i++){
        singlyLinkList.add(i, myArray[i]);
    }
    assertEquals(myArray[4], singlyLinkList.get(4));

}
    @Test
     void TestsSinglyAdd() throws ListAccessError {testSingly();}
}
