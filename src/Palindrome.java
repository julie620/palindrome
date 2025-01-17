import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //introduces the program to the user
        System.out.println("Welcome to the Palindrome Checker! A palindrome is a word, phrase, or");
        System.out.println("sequence that can be read the same backwards as forwards.");
        System.out.print("Please enter a word, phrase, or sequence: ");
        String userIn = input.nextLine();
        //removes spaces between words or letters
        userIn = userIn.replaceAll(" ", "");

        System.out.print("Is it a Palindrome: ");
        checkPalindrome(userIn.toLowerCase(), 0, userIn.length() - 1);
    }

    //checks if given user input is a palindrome and prints yes/no
    public static void checkPalindrome(String userIn, int front, int end){
        if (front >= end) {
            System.out.print("Yes");
        }
        else if (userIn.charAt(front) == userIn.charAt(end)){
            checkPalindrome(userIn, front + 1, end - 1);
        }
        else {
            System.out.print("No");
        }
    }
}