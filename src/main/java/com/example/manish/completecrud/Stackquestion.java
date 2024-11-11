package com.example.manish.completecrud;

import java.util.Stack;

public class Stackquestion {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char openBracket = stack.pop();
                if ((ch == ')' && openBracket != '(') ||
                        (ch == ']' && openBracket != '[') ||
                        (ch == '}' && openBracket != '{')) {
                    return false; // Brackets don't match

                }
            }


        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([{(})]))";
         boolean isValid = isValid(s);
        System.out.println("is valid is " + isValid);
    }
}
