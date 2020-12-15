package am.picsart.lessons.bracketschecker;

import java.util.Stack;

public class BracketsChecker {
    public static void check(String data) {

        Stack<Character> brackets = new Stack<>();
        char[] symbols = data.toCharArray();

        for (int i = 0; i < symbols.length; i++) {

            char symbol = symbols[i];

            if (symbol == '[' || symbol == '(' || symbol == '{'){
                brackets.push(symbol);
            }

            switch (symbol) {
                case ']': {
                    //closed but not opened
                    if (brackets.isEmpty()) {
                        printMessageForRequirement('[');
                    } else {
                        //opened but closed with error
                        char current = brackets.pop();
                        if (current != '[') {
                            printMessageForMistake(i + 1,getCloserBracket(current), ']');
                        }
                    }
                    break;
                }
                case '}': {
                    if (brackets.isEmpty()) {
                        printMessageForRequirement('{');
                    } else {
                        char current = brackets.pop();
                        if (current != '{') {
                            printMessageForMistake(i + 1,getCloserBracket(current), '}');
                        }
                    }
                    break;
                }
                case ')': {
                    if (brackets.isEmpty()) {
                        printMessageForRequirement('(');
                    } else {
                        char current = brackets.pop();
                        if (current != '(') {
                            printMessageForMistake(i + 1,getCloserBracket(current), ')');
                        }
                    }
                    break;
                }
            }
        }

        // opened but not closed
        for(char opener : brackets){
            printMessageForRequirement(getCloserBracket(opener));
        }

    }

    private static char getCloserBracket(char opener){
        switch (opener){
            case '{' : return '}';
            case '[' : return ']';
            case '(' : return ')';
        }
        throw new RuntimeException("Invalid symbol " + opener);
    }



    private static void printMessageForMistake(int index, char require, char exists) {
        System.out.println("Error on position : " + index + " ( Required '" + require + "' , exists '" + exists + "' )");
    }

    private static void printMessageForRequirement(char symbol) {
        System.out.println("Error : ( Required '" + symbol + "' )");
    }

    public static void main(String[] args) {
        check("{{{");
    }
}
