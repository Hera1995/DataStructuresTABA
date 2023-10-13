
package q3_tag_validator;

public class TagValidatorApp {
    public static void main(String[] args) {
        TagValidatorInterface validator = new Stack();

        String newText = "\n\\begin\n" + "\n\\begin\n" + "\n\\begin\n" + "\n\\begin\n" +
                "Some " + "content " + "in " + "the " + "text" +
                "\n\\end\n" + "\n\\end\n" + "\n\\end\n" + "\n\\end";
        
        //split text into word arrays based on space characters
        String[] words = newText.split("\\s+");
        
        //traverse words array
        boolean enoughBeginTags = true;
        for (String word : words) {
            //push \begin tag when a \begin tag is found
            if (word.equals("\\begin")) {
                validator.push("\\begin");
            } 
            //pop \begin tag when an \end tag is found as long as the stack is not empty
            if (word.equals("\\end")) {
                if (!validator.isEmpty()) {
                    validator.pop();
                }else{
                    enoughBeginTags = false;
                }
            }
        }
        
        
        //if the stack is empty and there's no more \end tag left
        if (validator.isEmpty() && enoughBeginTags) {
            System.out.println("Each open tag has a corresponding closing tag");
        } else {
            System.out.println("Tags fail the validation.");
        }
        
        //Other tests
        validator.push("a");
        validator.push("b");
        validator.push("c");
        validator.push("d");
        
        System.out.println("Stack contents: " + validator.toString());
        
        System.out.println("Element " + validator.pop() + " has been removed");
        
        System.out.println("Stack contents: " + validator.toString());
        
        System.out.println("The element on the top is " + validator.peek());
        
    }
}

