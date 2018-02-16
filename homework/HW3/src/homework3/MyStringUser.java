package homework3;

import java.util.Scanner;

public class MyStringUser {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        Character[] chars = {'H','e','l','L','O','W','o','r','L','d'};
        MyString strObj = new MyString(chars);
        //uses the charAt
        System.out.println("the char at index 5");
        System.out.println(strObj.charAt(5));
        System.out.println();
        //uses  length ()

        System.out.println("the length is ");
        System.out.println(strObj.length());
        System.out.println();


        //makes a substring
        System.out.println("the substring is ");
        System.out.println(strObj.substring(3,6));
        System.out.println();




        //makes lowercase
        System.out.println("makes the string lowercase");
        System.out.println(strObj.toLowerCase());
        System.out.println();
        //makes it uppercase
        System.out.println("makes the string uppercase");
        System.out.println(strObj.toUpperCase());
        System.out.println();
        //test to see if equal

        System.out.println("please enter a string to test");
        String testStr=new String();

        testStr= input.next();

        System.out.println("is the two strings equal: ");
        System.out.println(strObj.equals(testStr));
        System.out.println();

        //getstring
        System.out.println("get string:");
        System.out.println(strObj.getMyString());
        System.out.println();
        //tostring
        System.out.println("to string");
        System.out.println(strObj.toString());
        System.out.println();

        //value of
        System.out.println("value of: ");
        System.out.println(strObj.valueOf(20));
        System.out.println();




    }
}
