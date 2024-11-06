package com.hackerrank;

public class SumDigits {


    /* Todo : The digit sum of an integer is the sum of its digits in decimal notation.
              For example, the digit sum of 1234 is 1+2+3+4=10, and the digit sum of 3443 is 3+4+4+3=14. */

    public static int sumDigits1(int num) {
        String string = String.valueOf(num);
        int sum = 0;
        for (char c : string.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }

    public static int sumDigits2(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }


}
