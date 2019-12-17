package linkedList.list;

import arrayGenerator.generator.IntegerArrayGenerator;
import arrayGenerator.scope.IntegerScope;
import javafx.scene.Node;
import linkedList.node.ListNode;
import linkedList.node.SingleLinkNode;

public class SinglyLinkList<T> extends BasicList<SingleLinkNode<T>, T> implements List<T> {
    ListNode<T> getNode(int index) throws ListAccessError {
        if (index < 0) {
            throw new ListAccessError("The Index is Negative, therefore Invalid");
        }
        ListNode<T> selectedNode = getRoot();  //Set the current node to the start
        while (index != 0 && selectedNode != null) {  //Go along the List
            selectedNode = selectedNode.getNext(); //Get next node in list
            index--;
        }
        return selectedNode;
    }

    ListNode<T> addNode(int index, T value) throws ListAccessError {
        SingleLinkNode<T> new_node = new SingleLinkNode<>(value);
        if (index < 0) {
            throw new ListAccessError("The index is Negative");
        }
        if (index < 1) {
            if (getNode(index).getNext() == null) {
                new_node.setNext(null);
            } else
                new_node.setNext((SingleLinkNode<T>) getNode(index).getNext());

        } else {
            SingleLinkNode<T> previous = (SingleLinkNode<T>) getNode(index - 1);
            // Create a new node with given data
            new_node.setNext(null);
            // If the Linked List is empty,
            // then make the new node as head
            if (isEmpty()) {
                setRoot(new_node);
            } else if (getNode(index).getNext() == null) {
                new_node.setNext(null);
            } else if (getNode(index) == null) {
                new_node.setNext(null);

            } else
                new_node.setNext((SingleLinkNode<T>) getNode(index).getNext());
            previous.setNext((SingleLinkNode<T>) getNode(index));
        }
        return null;
    }
    ListNode<T> removeNode(int index) throws ListAccessError {

        if (index < 0) {
            throw new ListAccessError("The index is negative");
        }
        SingleLinkNode<T> previous = (SingleLinkNode<T>) getNode(index);
        previous.setNext(((SingleLinkNode<T>) getNode(index)).getNext());

        return null;
    }
    public void add(int index, T value) throws ListAccessError {
        addNode(index, value);
    }
    public T remove(int index) throws ListAccessError {
        removeNode(index);
        return null;
    }
    public T get(int index) throws ListAccessError {
        return getNode(index).getValue();
    }
}