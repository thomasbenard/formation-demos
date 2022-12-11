package fr.arolla.formationdemos.unittest1.pourquoitester;

public class FizzBuzz {

    public static String computeOld(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        return "" + number;
    }

    public static String computeNew(int number) {
        String result = "";
        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        return result;
    }
}
