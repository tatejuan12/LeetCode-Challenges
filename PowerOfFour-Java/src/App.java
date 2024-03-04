/*
Assess if input is a power of 4, if yes return true, if no return false
Contraints:
-231 <= n <= 231-1
Example 1:

Input: n = 16
Output: true

Input: n=5
Output : false
 */

/* If number is negative it can't be power of 4
   things to consider. consider the power number. what can we do with the power number. should we do log
   
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(isPowerOfFour(16.0));
        System.out.println(isPowerOfFour(5.0));
        System.out.println(isPowerOfFour(1.0));

    }

    public static boolean isPowerOfFour(double input) {
        if (input == 1)
            return true;
        if (input <= 0)
            return false;
        if (input % 4 != 0)
            return false;

        return isPowerOfFour(input / 4);
    }
    // This is calling function recursively. You can see the function calls itelf.
}
