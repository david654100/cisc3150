
import java.util.*;


public class Calcv2 {
    public static void main(String[] args) {

        /*
        This checks the number of command-line args if args has 0 arguments it throws whereyourargsat
         */
        try {
            if (args.length == 0) {
                throw new WhereYourArgsAt("dude you need arguments");
            }
        }
        catch (WhereYourArgsAt e ){}
        /*
        converts args to string
         */

        try{
            System.out.println(Arrays.toString(args));

            String evaluee="";

            for (int i=0;i<args.length;i++){
                evaluee+=args[i];
            }

            postFix eval = new postFix(evaluee);

            if(eval.outputString.contains(" ")){
                System.out.println(evaluateExpression(eval.outputString));
            }
            else
                throw new QuitMashingOnYourKeyboardException();
        }
        catch (UserIsADumbassException ex){

        }
        catch (QuitMashingOnYourKeyboardException ex){}
        catch (NumberFail ex){
            System.err.println("dude be careful with your zeroes");
        }
        catch (Throwable ex){}



    }

    public static double evaluateExpression(
            String expression) throws Exception {
        Stack<Double> operandStack = new Stack<>();
        expression = insertBlanks(expression);
        String[] tokens = expression.split(" ");
        for (String token: tokens) {
            if(token.charAt(0) == '(')
                System.out.println(token);
        }
        for (String token: tokens) {
            if (token.length() == 0) // Blank space
                continue; // Back to the while loop to extract the next token
            else if (token.charAt(0) == '+' ||
                    token.charAt(0) == '-' ||
                    token.charAt(0) == '/' ||
                    token.charAt(0) == '*' ||
                    token.charAt(0) == '%') {
                // Process all operands in the top of the stack
                processAnOperator(operandStack, token.charAt(0));
            }
            else if (Character.isDigit(token.charAt(0))){
                operandStack.push(Double.parseDouble(token));
            }
            else if (!Character.isLetter(token.charAt(0)))
                throw new AlebraicFailException();

        }

        return operandStack.pop();
    }


    /** Inserts blanks around +, -, /, and * */
    public static String insertBlanks(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' ||
                    s.charAt(i) == '-' ||
                    s.charAt(i) == '/' ||
                    s.charAt(i) == '%' ||
                    s.charAt(i) == '*')
                result += " " + s.charAt(i) + " ";
            else
                result += s.charAt(i);
        }
        return result;
    }
    public static void processAnOperator(
            Stack<Double> operandStack, char operator) throws Exception{
        double op1=0,op2=0;
        try{
            op1 = operandStack.pop();
            op2 = operandStack.pop();
        }catch(Exception e){
            throw new UserIsADumbassException();
        }
        switch (operator) {
            case '+': operandStack.push(op2 + op1); break;
            case '-': operandStack.push(op2 - op1); break;
            case '/': operandStack.push(op2 / op1); break;
            case '*': operandStack.push(op2 * op1); break;
            case '%': operandStack.push(op2 % op1);
        }
    }
}
/*
https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html#parseDouble-java.lang.String
https://www.geeksforgeeks.org/stack-set-2-infix-to-postfix/
https://gist.github.com/JakeWharton/237462
https://stackoverflow.com/questions/8944199/how-to-deal-with-command-line-arguments-in-java
https://docs.oracle.com/javase/tutorial/essential/environment/cmdLineArgs.html
 */
