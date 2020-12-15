package am.picsart.lessons.bracketschecker;

import java.util.Stack;

public class BracketsChecker {

    private static final String RED_COLOR_CODE = "\u001B[31m";
    private static final String YELLOW_COLOR_CODE = "\u001B[32m";
    private static final String RESET_COLOR_CODE = "\u001B[0m";

    /**
     * Print data and check the correctness of brackets signature
     * if everything is ok , data will be printed
     * otherwise if bracket closed incorrectly it will be printed red
     * if bracket opened but not closed ,
     * than required bracket will be printed yellow
     * if bracket closed without being opened ,
     * than closer bracket will be printed red
     *
     * @param data checked data
     */

    public static void check(String data) {

        Stack<Character> brackets = new Stack<>();
        char[] symbols = data.toCharArray();

        for (char symbol : symbols) {

            if (symbol == '[' || symbol == '(' || symbol == '{') {
                brackets.push(symbol);
            }

            switch (symbol) {
                case ']': {
                    //closed but not opened
                    if (brackets.isEmpty()) {
                        printMessageForMistake(symbol);
                    } else {
                        //opened but closed with error
                        char current = brackets.pop();
                        if (current != '[') {
                            printMessageForMistake(symbol);
                        } else {
                            System.out.print(symbol);
                        }
                    }
                    break;
                }
                case '}': {
                    if (brackets.isEmpty()) {
                        printMessageForMistake(symbol);
                    } else {
                        char current = brackets.pop();
                        if (current != '{') {
                            printMessageForMistake(symbol);
                        } else {
                            System.out.print(symbol);
                        }
                    }
                    break;
                }
                case ')': {
                    if (brackets.isEmpty()) {
                        printMessageForMistake(symbol);
                    } else {
                        char current = brackets.pop();
                        if (current != '(') {
                            printMessageForMistake(symbol);
                        } else {
                            System.out.print(symbol);
                        }
                    }
                    break;
                }
                default:
                    System.out.print(symbol);
            }

        }

        // opened but not closed
        for (char opener : brackets) {
            printMessageForRequirement(getCloserBracket(opener));
        }

    }


    /**
     * Return corresponding closer bracket
     *
     * @param opener opener bracket
     */
    private static char getCloserBracket(char opener) {
        switch (opener) {
            case '{':
                return '}';
            case '[':
                return ']';
            case '(':
                return ')';
        }
        throw new RuntimeException("Invalid symbol " + opener);
    }


    /**
     * printing red incorrect symbol
     *
     * @param incorrectSymbol incorrect symbol
     */
    private static void printMessageForMistake(char incorrectSymbol) {
        System.out.print(RED_COLOR_CODE);
        System.out.print(incorrectSymbol);
        System.out.print(RESET_COLOR_CODE);
    }


    /**
     * printing green required symbol
     *
     * @param requiredSymbol required symbol
     */
    private static void printMessageForRequirement(char requiredSymbol) {
        System.out.print(YELLOW_COLOR_CODE);
        System.out.print(requiredSymbol);
        System.out.print(RESET_COLOR_CODE);
    }

    public static void main(String[] args) {
        check("{fwef)");
    }
}
