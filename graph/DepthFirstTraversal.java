package graph;

import javafx.scene.Node;

import java.util.*;

public class DepthFirstTraversal<T> extends AdjacencyGraph<T> implements Traversal<T> {
    private Queue<T> toDo = new ArrayDeque<T>();
    private List<T> traversal = new ArrayList<T>();
    private Queue<T> backtrack = new ArrayDeque<T>();
    private Stack<T> stack = new Stack<T>();



    public List<T> traverse() throws GraphError {
        T node = getUnvisitedNode();

        while(node != null){
            visitNode(node);
            visitNode(getNeighbours(node));


        }

    }
    private boolean visited(T node){
        return traversal.contains(node) || toDo.contains(node);

    }
    private T getUnvisitedNode() {
        for (T node: getNodes()) {
            if (!visited(node)) {
                return node;
            }
        }
        return null;
    }
  
    }
    private void visitNode(T node) throws GraphError{
        if(visited(node)){
            backtrack.add(node);
        };
        traversal.add(node);
        for (T neighbour: getNeighbours(node)){
            if (!visited(neighbour))
                toDo.add(neighbour);
        }

    }


}
