import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("III"));
        System.out.println(solution.romanToInt("LVIII"));
        System.out.println(solution.romanToInt("MCMXCIV"));
        System.out.println(solution.romanToInt("CMXCIX"));
    }

    public static class Solution {

        private int romanToInt(String romanNumbers) {
            HashMap<Character, Integer> numerals = new HashMap<>() {
                {
                    put('I', 1);
                    put('V', 5);
                    put('X', 10);
                    put('L', 50);
                    put('C', 100);
                    put('D', 500);
                    put('M', 1000);
                }
            };
            int decimal = 0;
            for (int i = 0; i < romanNumbers.length(); i++) {
                char currChar = romanNumbers.charAt(i);

                if (i + 1 == romanNumbers.length()) {
                    decimal += numerals.get(currChar);
                    continue;
                } else {
                    char nextChar = romanNumbers.charAt(i + 1);

                    switch (romanNumbers.charAt(i)) {
                        case 'I': {
                            if (nextChar == 'V') {
                                decimal += 4;
                                i++;
                            } else if (nextChar == 'X') {
                                decimal += 9;
                                i++;
                            } else
                                decimal += 1;
                            break;
                        }
                        case 'X': {
                            if (nextChar == 'L') {
                                decimal += 40;
                                i++;
                            } else if (nextChar == 'C') {
                                decimal += 90;
                                i++;
                            } else
                                decimal += 10;
                            break;

                        }
                        case 'C': {
                            if (nextChar == 'D') {
                                decimal += 400;
                                i++;
                            } else if (nextChar == 'M') {
                                decimal += 900;
                                i++;
                            } else
                                decimal += 100;
                            break;

                        }
                        default: {
                            decimal += numerals.get(currChar);
                        }
                    }
                }
            }
            return decimal;
        }
    }
}
/*
 * Desired outputs:
 * 3
 * 58
 * 1994
 */

/*
 * Considerations:
 * -Figuring out subtractions is key.
 * -Will have t look
 */