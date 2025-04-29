package problems;

public class PalindromeNumber {

    private int x;

    public PalindromeNumber(int x) {
        this.x = x;
    }

    public boolean solve() {
        //If x is negative or if x is not 0 and the last digit is 0, it fails automatically
        if(this.x < 0 || (this.x != 0 && this.x % 10 == 0)) return false;

        //Reverse the current integer
        int reverse = reverseInt(this.x);

        //If the reverse is equal to the given then it's a palindrome
        return this.x == reverse;
    }

    private int reverseInt(int num) {
        int result = 0;

        while(num > 0) {
            result = (result * 10) + num % 10;
            num /= 10;
        }

        return result;
    }

    @Override
    public String toString() {
        return "PalindromeNumber{" +
                "x=" + x +
                '}';
    }
}
