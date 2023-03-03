package kutsandy.problems;
/*Determine whether an integer is a palindrome.
An integer is a palindrome when it reads the same
backwards as forward.

Solve without converting the number to a string
*/

public class Palindrome {
    public static boolean isPalindrome(int x){
       //check if its not a negative
        if (x < 0) return false;
        int reverse = 0, copy =x;
        while (copy > 0){
            int digit = copy % 10;
            reverse =  reverse *10 + digit;
            copy /= 10;
        }
        return reverse ==x;

    }

    public static void main(String[] args){
        int p = 4832;
        System.out.println(isPalindrome(p));

    }
}
