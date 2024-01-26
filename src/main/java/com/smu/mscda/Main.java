package com.smu.mscda;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will capitalize the input string and Generate MD5 hex");
        System.out.println("\nEnter the input string: ");
        String userInput = scanner.nextLine();

        String capitalizedUserInput = capitalizeUserInput(userInput);
        String hashedUserString = hashUserInput(userInput);

        System.out.println("\nCapitalized string is : " + capitalizedUserInput);
        System.out.println("\nMD5 hex is: " + hashedUserString);
    }

    public static String hashUserInput(String userInput) {
        return DigestUtils.md5Hex(userInput);
    }

    public static String capitalizeUserInput(String userInput) {
        return StringUtils.capitalize(userInput);
    }
}