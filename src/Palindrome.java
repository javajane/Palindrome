/**
 * Created by pinaki on 9/25/2016.
 */
public class Palindrome {

    public static void main (String args[]){

        //a basic program to check whether a string is a palindrome
        //Assumptions are:
        // -case sensitivity (for eg: Amma is not a palindrome)
        // -spaces will be regarded as characters
        // -spaces and punctuation will be regarded as characters and get evaluated.
        // --eg: madam, I'm adam - this will not be regarded as a palindrome
        // --eg: madamImadam - this will get evaluated as a palindrome


        String myString= "amma";
        int myStringLen=myString.length();
        boolean isPalindrome=false;

        System.out.println("this is my string: " + myString);

        //is it even or odd string
        if ((myStringLen%2) == 1){ //its an odd string
            int firstHalf= ( ((myStringLen-1)/2) - 1);
            int secHalf = ( ((myStringLen-1)/2) + 1);
            isPalindrome=isPalindrome(firstHalf, secHalf, myString);

        }
        else{ //its an even string
            int firstHalf = ( (myStringLen/2) - 1);
            int secHalf = (myStringLen/2);
            isPalindrome=isPalindrome(firstHalf, secHalf, myString);

        }

        if (isPalindrome) {
            System.out.println("\nYes! it is a Palindrome!");
        }
        else {
            System.out.println("\nSorry! not a Palindrome!");
        }

    }

    private static boolean isPalindrome (int firstHalf, int secHalf, String myString){
        for(int i=firstHalf; i>=0;i--){
            if (myString.charAt(i)!= myString.charAt(secHalf)){
              return false;
            }
            secHalf++;
        }
        return true;
    }
}
