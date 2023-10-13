
package q4_health_eating;

public class BTNode<T> {
    T data;
    BTNode<T> left;
    BTNode<T> right;

    //constructors
    public BTNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
    public BTNode() {
    }    
   
}
