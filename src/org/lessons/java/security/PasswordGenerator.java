package org.lessons.java.security;

public class PasswordGenerator {
    public static void main(String[] args) {
        String firstName = "Pinco";
        String lastName = "Pallo";
        String favoriteColor = "magenta";
        byte dayOfBirth = 12;
        byte monthOfBirth = 5;
        short yearOfBirth = 1994;
        int sumBirthday = dayOfBirth + monthOfBirth + yearOfBirth;

        System.out.println(firstName + "-" + lastName + "-" + favoriteColor + "-" + sumBirthday);
    }
}
