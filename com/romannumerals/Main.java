package com.romannumerals;

public class Main {

    public static void main(String[] args) {
        Convertible converter;
        try {
            if (args[0].equals("-d") || args[0].equals("-D")) {
                converter = new DecToRom(Long.parseLong(args[1]));
            } else if (args[0].equals("-r") || args[0].equals("-R")) {
                converter = new RomToDec(args[1]);
            } else {
                throw new RuntimeException("Invalid");
            }
            converter.convert();
            System.out.println(converter);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input!");
        } catch (Exception e) {
            help();
        }
    }

    public static void help() {
        String instructions = """
        -r or -R [Roman Numeral]    -   Supply this argument to convert roman numeral to a decimal digit
        -d or -D [digit]    -    Supply this argument to convert decimal digit to a roman numeral
        -h  - Help""";
        System.out.println(instructions);
    }

}
