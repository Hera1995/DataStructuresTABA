
package q4_health_eating;

public interface BinaryTreeInterface<T extends Comparable<T>> {
    public boolean isEmpty();
    public void addNode(T data);
    public int countNodes();
    public T findBest();
    public T findWorst();
}

