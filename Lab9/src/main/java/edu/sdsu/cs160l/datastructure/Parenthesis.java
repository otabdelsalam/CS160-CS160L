package edu.sdsu.cs160l.datastructure;

import java.util.Stack;

// TODO implement the below function (2 points)
//  use Test Class to test your implementation
@SuppressWarnings("ALL")
public class Parenthesis {
    /**
     * @param brackets contains a sequence of Characters '(' or ')'
     *                 eg : '((()))' is valid
     *                 '())' is invalid
     *                 ')(' is invalid
     *                 Check the test class for more examples
     * @return true is the brackets are balanced else false
     */
    public boolean isBalanced(String brackets) {

        Stack bracketsStack = new Stack();
        for(int i = 0; i < brackets.length(); i++) {
            char c = brackets.charAt(i);
            if(c == '(') {
                bracketsStack.push(c);
            }
            else
            {
                if(bracketsStack.empty()) {
                    return false;
                }
                bracketsStack.pop();
            }
        }
        return bracketsStack.empty();
    }
}
