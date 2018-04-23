
//If the user enters an operation which isn't supported this error gets
public class UserIsADumbassException extends IllegalArgumentException {
    private String ErrorMessage = "UserIsADumbassException";

    UserIsADumbassException() {
        System.err.println("hey Dumbass you forgot to write a number " + ErrorMessage);
        System.err.println("Error: please enter a number");

    }
}

class QuitMashingOnYourKeyboardException extends IllegalArgumentException{

    private String errorMessage ="QuitMashingOnYourKeyboardException ";

    public QuitMashingOnYourKeyboardException(){
        System.err.println(errorMessage);
    }

    public QuitMashingOnYourKeyboardException(String str){
        System.err.println(errorMessage+" "+str);
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

class WhereYourArgsAt extends Throwable{
    private String errorMessage = "WhereYourArgsAt";
    WhereYourArgsAt(){
        System.err.println(errorMessage);
    }

    WhereYourArgsAt(String str){
        System.err.println(errorMessage+" "+str);
    }

}