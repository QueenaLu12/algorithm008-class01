/* Qing Lu, CS 210, Spring 2020
   This program is about practicing how to use class, method to solve problems.*/
import java.util.*;
public class Assignment2 {
    class Solution {
        public boolean isValid(String s) {
            if (s.length() % 2 == 1) {
                return false;
            }
            Map<Character,Character> map = new HashMap<Character,Character> () {{
                put('}','{'); put(']','['); put(')','(');
            }};
            Stack<Character> stack = new Stack<> ();
            for (int i = 0; i < s.length(); i++) {
                char theChar = s.charAt(i);
                if (theChar == '(' || theChar == '{' || theChar == '[') {
                    stack.push(theChar);
                }
                else {
                    if (stack.empty()) {
                        return false;
                    }

                    if (stack.peek() != map.get(theChar)) {
                        return false;
                    }
                    else {
                        stack.pop();
                    }
                }
            }
            return stack.empty();
        }

    }
}







