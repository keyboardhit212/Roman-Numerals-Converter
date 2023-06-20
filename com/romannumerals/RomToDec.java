package com.romannumerals;

public class RomToDec implements Convertible {

    private String romanNumeral;
    private long digit;

    public RomToDec(String romanNumeral) {
        this.romanNumeral = romanNumeral;
        this.digit = 0;
    }

    @Override
    public void convert() {
        int tempDigit = 0;
        for (int i = 0; i < this.romanNumeral.length(); i++) {
            try {
                if (match(String.valueOf(this.romanNumeral.charAt(i))) >= match(String.valueOf(this.romanNumeral.charAt(i + 1)))) {
                    tempDigit += match(String.valueOf(this.romanNumeral.charAt(i)));
                } else {
                    tempDigit -= match(String.valueOf(this.romanNumeral.charAt(i)));
                }
            } catch (StringIndexOutOfBoundsException e) {
                tempDigit += match(String.valueOf(this.romanNumeral.charAt(i)));
            }
        }
        this.digit = tempDigit;
    }

    private int match(String substr) {
        if (substr.equals("I")) {
            return 1;
        } else if (substr.equals("V")) {
            return 5;
        } else if (substr.equals("X")) {
            return 10;
        } else if (substr.equals("L")) {
            return 50;
        } else if (substr.equals("C")) {
            return 100;
        } else if (substr.equals("D")) {
            return 500;
        } else if (substr.equals("M")) {
            return 1000;
        } else {
            return 0;
        }
     }

    @Override
    public String toString() {
        return String.valueOf(this.digit);
    }
}
