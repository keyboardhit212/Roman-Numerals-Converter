package com.romannumerals;

public class DecToRom implements Convertible {

    private long digit;
    private String result;

    public DecToRom(long digit) {
        this.digit = digit;
        this.result = new String();
    }

    @Override
    public void convert() {
        StringBuilder romanNumerals = new StringBuilder();
        long digit = this.digit;
        while (digit > 0) {
            if (digit >= 1000) {
                romanNumerals.append("M");
                digit -= 1000;
            } else if (digit >= 900) {
                romanNumerals.append("CM");
                digit -= 900;
            } else if (digit >= 500) {
                romanNumerals.append("D");
                digit -= 500;
            } else if (digit >= 400) {
                romanNumerals.append("CD");
                digit -= 400;
            } else if (digit >= 100) {
                romanNumerals.append("C");
                digit -= 100;
            } else if (digit >= 90) {
                romanNumerals.append("XC");
                digit -= 90;
            } else if (digit >= 50) {
                romanNumerals.append("L");
                digit -= 50;
            } else if (digit >= 40) {
                romanNumerals.append("XL");
                digit -= 40;
            } else if (digit >= 10) {
                romanNumerals.append("X");
                digit -= 10;
            } else if (digit >= 9) {
                romanNumerals.append("IX");
                digit -= 9;
            } else if (digit >= 5) {
                romanNumerals.append("V");
                digit -= 5;
            } else if (digit >= 4) {
                romanNumerals.append("IV");
                digit -= 4;
            } else if (digit >= 1) {
                romanNumerals.append("I");
                digit -= 1;
            }
        }
        this.result = romanNumerals.toString();
    }

    @Override
    public String toString() {
        return this.result;
    }
}
