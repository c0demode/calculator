package com.walderman.calculator;

public class Calculator {

    public double workingNumber;
    public StringBuilder displayNumber;
    public StringBuilder displayHistory;

    /**
     * Returns the sum of a + b
     * @param a
     * @param b
     * @return
     */
    public double add(double a, double b){
        return a + b;
    }

    /**
     * Returns the difference of a - b
     * @param a
     * @param b
     * @return
     */
    public double subtract(double a, double b){
        return a - b;
    }

    /**
     * Returns the product of a * b
     * @param a
     * @param b
     * @return
     */
    public double multiply(double a, double b){
        return a * b;
    }

    /**
     * Returns the quotient of a / b
     * @param a
     * @param b
     * @return
     */
    public double divide(double a, double b){
        return a / b;
    }

    /**
     * Returns the modulus of a % b
     * @param a
     * @param b
     * @return
     */
    public double modulus(double a, double b){
        return a % b;
    }


    /**
     * Return the square root of a
     * @param a
     * @return
     */
    public double sqroot(double a){
        return Math.sqrt(a);
    }

    /**
     * Returns a to the power of b
     * @param a
     * @return
     */
    public double powerOf(double a, double b){
        return Math.pow(a, b);
    }

    public void clear(){
        workingNumber = 0;

        //reset the displaynumber variables
        displayNumber.setLength(0);
        displayHistory.setLength(0);
    }


}
