package com.walderman.calculator;

public class Calculator {

    private double workingNumber;
    private StringBuilder displayNumber;
    private StringBuilder displayHistory;

    /**
     * Returns the sum of a + b
     * @param a
     * @param b
     * @return
     */
    private double add(double a, double b){
        return a + b;
    }

    /**
     * Returns the difference of a - b
     * @param a
     * @param b
     * @return
     */
    private double subtract(double a, double b){
        return a - b;
    }

    /**
     * Returns the product of a * b
     * @param a
     * @param b
     * @return
     */
    private double multiply(double a, double b){
        return a * b;
    }

    /**
     * Returns the quotient of a / b
     * @param a
     * @param b
     * @return
     */
    private double divide(double a, double b){
        return a / b;
    }

    /**
     * Returns the modulus of a % b
     * @param a
     * @param b
     * @return
     */
    private double modulus(double a, double b){
        return a % b;
    }


    /**
     * Return the square root of a
     * @param a
     * @return
     */
    private double sqroot(double a){
        return Math.sqrt(a);
    }

    /**
     * Returns a to the power of b
     * @param a
     * @return
     */
    private double powerOf(double a, double b){
        return Math.pow(a, b);
    }

    private void clear(){
        workingNumber = 0;

        //reset the displaynumber variables
        displayNumber.setLength(0);
        displayHistory.setLength(0);
    }

}
