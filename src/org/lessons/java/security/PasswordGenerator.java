package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName = input.nextLine();
        String lastName = input.nextLine();
        String favoriteColor = input.nextLine();
        int dayOfBirth = input.nextInt();
        int monthOfBirth = input.nextInt();
        int yearOfBirth = input.nextInt();
        int sumBirthday = dayOfBirth + monthOfBirth + yearOfBirth;

        System.out.println(firstName + "-" + lastName + "-" + favoriteColor + "-" + sumBirthday);

        input.close(); // close scanner
    }
}
