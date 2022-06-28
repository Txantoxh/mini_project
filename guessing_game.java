import java.util.*;

public class guessing_game{

    public static void main(String[]args){

        System.out.println("Enter the alphabets");
        // to get the scanner object we need to import scanner and create a new method.

        Scanner scan = new Scanner(System.in);
        char user = scan.next().charAt(0); // this is to take input

        if(user=='a' || user=='e' || user=='i'|| user=='o' || user=='u' || user=='A'|| user=='E'|| user=='I'||user=='O' || user=='U')
        {
            System.out.println("The Character" +" " + user+ " "+"is vowel.");
        }
        else {
            System.out.println("The Character" +" " +user+ " "+"is consonent");
        }
    }

    }
