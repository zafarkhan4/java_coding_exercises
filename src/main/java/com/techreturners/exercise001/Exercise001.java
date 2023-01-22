package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.List;

public class Exercise001 {

    public String capitalizeWord(String sentence) {

        char firstCharacter = sentence.charAt(0);
        String remainingCharacters = sentence.substring(1);

        return getUpperCase(firstCharacter) + remainingCharacters;
    }

    private char getUpperCase(char character) {
        return Character.toUpperCase(character);
    }

    public String generateInitials(String firstName, String lastName) {
        char firstNameInitial = getUpperCase(firstName.charAt(0));
        char secondNameInitial = getUpperCase(lastName.charAt(0));
        return firstNameInitial + "." + secondNameInitial;
    }

    public double addVat(double originalPrice, double vatRate) {

        double priceWithVat = originalPrice + (originalPrice * (vatRate / 100));
        String roundedPrice = roundValue(priceWithVat);

        return Double.valueOf(roundedPrice);
    }

    private String roundValue(double input) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(input);
    }

    public String reverse(String sentence) {
        char[] characters = sentence.toCharArray();
        StringBuffer reverseSentence = new StringBuffer();

        for (int i = characters.length - 1; i >= 0; i--) {
            reverseSentence.append(characters[i]);
        }

        return reverseSentence.toString();
    }

    public int countLinuxUsers(List<User> users) {
        int linuxUsers = 0;

        for (User user : users) {
            if (user.getType().equalsIgnoreCase("linux")) {
                linuxUsers++;
            }
        }

        return linuxUsers;
    }
}
