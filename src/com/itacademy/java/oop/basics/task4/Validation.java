package com.itacademy.java.oop.basics.task4;

public class Validation {
    private int length;
    private boolean onlyLettersAndDigits;
    private int countOfLetters;
    private int countOfDigits;
    private int countOfUpperCases;
    private int countOfLowerCases;

    public Validation(int length, boolean onlyLettersAndDigits, int countOfLetters, int countOfDigits, int countOfUpperCases, int countOfLowerCases) {
        this.length = length;
        this.onlyLettersAndDigits = onlyLettersAndDigits;
        this.countOfLetters = countOfLetters;
        this.countOfDigits = countOfDigits;
        this.countOfUpperCases = countOfUpperCases;
        this.countOfLowerCases = countOfLowerCases;
    }

    public String isValid(String password){
        char[] chars = password.toCharArray();

        if(chars.length < 10){
            return "Password is invalid! A password must have at least"+ length +" characters.";
        }
        if(onlyLettersAndDigits){
            if(!hasOnlyLettersAndDigits(chars)){
                return "Password is invalid! A password consists of only letters and digits.";
            }
        }
        if(!hasLetters(chars, 2)){
            return "Password is invalid! A password must contain at least " + countOfLetters + " letters.";
        }
        if(!hasDigits(chars, 2)){
            return "Password is invalid! A password must contain at least " + countOfDigits + " digits.";
        }
        if(!hasUpperCase(chars, 1)){
            return "Password is invalid! A password must contain at least " + countOfUpperCases + " upper case letters.";
        }
        if(!hasLoweCase(chars, 1)){
            return "Password is invalid! A password must contain at least " + countOfLowerCases + " lower case letters.";
        }

        return "Password is valid: " + password;
    }

    private boolean hasOnlyLettersAndDigits(char[] chars){
        for (char c: chars) {
            if(!Character.isLetterOrDigit(c)){
                return false;
            }
        }
        return true;
    }

    private boolean hasLetters(char[] chars, int quantity){
        int countNumbers = 0;
        for (char c: chars) {
            if(Character.isAlphabetic(c)){
                countNumbers ++;
                if(countNumbers >= quantity){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasDigits(char[] chars, int quantity){
        int countNumbers = 0;
        for (char c: chars) {
            if(Character.isDigit(c)){
                countNumbers ++;
                if(countNumbers >= quantity){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasUpperCase(char[] chars, int quantity){
        int countNumbers = 0;
        for (char c: chars) {
            if(Character.isUpperCase(c)){
                countNumbers ++;
                if(countNumbers >= quantity){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasLoweCase(char[] chars, int quantity){
        int countNumbers = 0;
        for (char c: chars) {
            if(Character.isLowerCase(c)){
                countNumbers ++;
                if(countNumbers >= quantity){
                    return true;
                }
            }
        }
        return false;
    }
}
