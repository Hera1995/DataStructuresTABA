
package q3_tag_validator;

public class Stack implements TagValidatorInterface {

    private Node top;

    //constructor
    public Stack() {
        this.top = null;
    }

    @Override
    //add a new element on the top (the head of linked list)
    public void push(String tag) {
        //create a new node
        Node newNode = new Node(tag);
        //add a new element to the head of the list
        newNode.next = top;
        //set new node to top
        top = newNode;
    }

    @Override
    public String pop() {
        //if the list is not empty
        if (top != null) {

            String value = top.value;
            //remove the head of the list
            top = top.next;
            return value;
        } else {//if the list is empty return null
            return null;
        }
    }

    @Override
    public String peek() {
        //if the list is not empty
        if (top != null) {
            return top.value;
        } else {//if the list is empty
            return null;
        }
    }
    
    @Override
    public boolean isEmpty() {
        return top == null;
    }
    
    @Override
    public String toString() {
        
        //create a new String builder
        StringBuilder sb = new StringBuilder();
        Node current = top;
        //traverse the list
        while (current != null) {
            sb.append(current.value).append(" ");
            current = current.next;
        }
        return sb.toString();
    }
}
