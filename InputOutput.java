package IntroTopics;

import com.sun.nio.sctp.SctpSocketOption;

import java.util.Scanner;

public class InputOutput {
     public static void main(String[] args) {
         System.out.println("hello");

         int val =10;

         System.out.println(val);
         System.out.println(5);

         System.out.println("I am " + "awesome at coding");
         System.out.println("number =" +val);

         //create  an object of Scanner class
         Scanner input = new Scanner(System.in);

         System.out.print("Enter an integer Value :");
         //take input from user
         int number = input.nextInt();

         System.out.println("you entered :" + number);
    }
}
