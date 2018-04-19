import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        String oprand1="";
        String oprand2="";
        String operator = "";
        double op1=0;
        double op2=0;

        //creates the Scanners objects NumberImput imputs the oprands
        //and OperatorImput  imputs the operator
        Scanner numberImput = new Scanner(System.in);
        Scanner operatorImput =  new Scanner(System.in);

        System.out.println("please enter a number");
        
        oprand1=operatorImput.next();

        if(typeChecker(oprand1)){
            throw new AlebraicFailException("please enter a number");
        }

        try {
            op1 = Double.valueOf(oprand1);
        }
        catch (AlebraicFailException e) {
            throw new AlebraicFailException("please enter a number");
        }



        System.out.println("please enter the next number");

        oprand2=operatorImput.next();

        if(typeChecker(oprand2)){
            throw new AlebraicFailException("please enter a number");
        }
        try {
            op2 = Double.valueOf(oprand2);
        }
        catch (AlebraicFailException e) {
            throw new AlebraicFailException("please enter a number");
        }


        System.out.println("please enter the operator");
        
        operator=operatorImput.next();
        

        try
        {
            switch(operator)
            {
                //add
                case "+":
                    System.out.println("result: " + (op1 + op2));
                    break;
                //subtract
                case "-":
                    System.out.println("result: " + (op1 - op2));
                    break;
                //multiply
                case "*":
                    System.out.println("result: " + (op1 * op2));
                    break;
                //divide
                case "/":
                    if (op2!=0){
                    System.out.println("result: " + (op1 / op2));
                    break;
                    }
                    else {
                        throw new ArithmeticException("dividing by zero is not allowed");
                    }
                //modulo
                case "%":
                    System.out.println("result: " + (op1 % op2));
                    break;

                default:
                    throw new QuitMashingOnYourKeyboardException("please enter a operator");
            }

        }

        catch(UserIsADumbassException e){}
        catch(QuitMashingOnYourKeyboardException e){}
        catch(IllegalArgumentException e){}

    }



//this checks the type of the char in the string
   static boolean typeChecker (String num){
       try
       {
           double d = Double.parseDouble(num);
       }
       catch(NumberFormatException e)
       {
           return true;
       }
       return false;
   }
}

//If the user enters anything other than a number where a number belongs this error gets thrown
class  AlebraicFailException extends IllegalArgumentException{
    private String erroreMessage ="AlebraicFailException";

    public AlebraicFailException(){
        System.err.println(erroreMessage);

    }

 public AlebraicFailException(String str){
        System.err.println(erroreMessage+" "+str);
    }



}


//If the user enters an operation which isn't supported this error gets thrown
class QuitMashingOnYourKeyboardException extends IllegalArgumentException{

    private String errorMessage ="QuitMashingOnYourKeyboardException ";

    public QuitMashingOnYourKeyboardException(){
        System.err.println(errorMessage);
    }

    public QuitMashingOnYourKeyboardException(String str){
        System.err.println(errorMessage+" "+str);
    }
}


//If the user forgets to enter a number this error is thrown
class UserIsADumbassException extends IllegalArgumentException{
    private String ErrorMessage ="UserIsADumbassException";
    UserIsADumbassException(){
        System.err.println("hey Dumbass you forgot to write a number "+ErrorMessage);
        System.err.println("Error: please enter a number");

    }


    UserIsADumbassException(String str){
        System.err.println("Error: please enter a number"+" "+str);
    }
}


class NumberFail extends NumberFormatException{
    private String erorMessage ="NumberFail";
    public NumberFail(){
        System.err.println(erorMessage);
    }

    public NumberFail(String str){
        System.err.println(erorMessage+" "+str);
    }
}













//https://stackoverflow.com/questions/5333110/checking-input-type-how
//https://stackoverflow.com/questions/5769669/convert-string-to-double-in-java