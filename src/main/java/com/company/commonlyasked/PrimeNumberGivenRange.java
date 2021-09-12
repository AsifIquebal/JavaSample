package com.company.commonlyasked;

import java.util.Scanner;

/**
 * Created by user on 30-May-17.
 */
public class PrimeNumberGivenRange {

    public static void main(String[] args) {
        int lowerLimit, upperLimit;
        System.out.println("Enter the Lower Limit: ");
        Scanner scanner = new Scanner(System.in);
        lowerLimit = scanner.nextInt();

        System.out.println("Enter the Upper Limit: ");
        upperLimit = scanner.nextInt();

        if(upperLimit > lowerLimit && lowerLimit!=0){
            for (int i = lowerLimit; i <= upperLimit ; i++) {
                int status = 0;
                for(int j = 2; j<i; j++){
                    if (i % j == 0) {
                        status = 1;
                        break;
                    }
                }
                if (status == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        else if(lowerLimit==1 || lowerLimit==0){
            System.out.println("0 and 1 are not considered as Prime Number. LowerLimit must be greater than or equals to 2");
        }
    }
}
/*

    One is neither a prime nor a composite number. A prime number is one
    with exactly two positive divisors, itself and one. One has only one
    positive divisor. It cannot be written as a product of two factors,
    neither of which is itself, so one is also not composite. It falls
    in a class of numbers called units. These are the numbers whose
    reciprocals are also whole numbers.

    Zero is not a prime or a composite number either. Zero has an infinite
    number of divisors (any nonzero whole number divides zero). It cannot
    be written as a product of two factors, neither of which is itself, so
    zero is also not composite. It falls in a class of numbers called
    zero-divisors. These are numbers such that, when multiplied by some
    nonzero number, the product is zero.
*/
