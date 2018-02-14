
import java.util.*;

public class questionThree {
    public static void main(String[] args) {
        int wordLength=0;
        int flag=0;
        Scanner input = new Scanner(System.in);
        String palindrome= new String();
        System.out.println("Please enter the word to be checked if it is a palindrome ");
        Stack<Character> myStack=new Stack();

        palindrome=input.next();

        wordLength = palindrome.length();

        for(int x =0;x<wordLength;x++){
            myStack.push(palindrome.charAt(x));


        }

       for (int x=0;x<wordLength;x++){
            if (palindrome.charAt(x)!=myStack.pop()){
                flag++;
            }
       }

       if (flag>0){
           System.out.println("the word "+palindrome+" is not a palindrome");
       }
       else{
           System.out.println("the word "+palindrome+" is a palindrome");
       }

    }
}
//https://www.tutorialspoint.com/java/java_strings.htm
//https://stackoverflow.com/questions/11229986/get-string-character-by-index-java
//https://introcs.cs.princeton.edu/java/43stack/