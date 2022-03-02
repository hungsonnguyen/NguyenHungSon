package ss1_Introduction_to_Java.Bai_tap;

import java.util.Scanner;

public class SpeakNumber {
    public static void main(String[] args) {
        SpeakNumber numObj = new SpeakNumber();
    Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số để đếm: ");
     int number = scanner.nextInt();
     String string = " ";
        System.out.println(numObj.lessthan10(number,string));
    }
    public String lessthan10( int num, String string){
        switch (num){
            case 0:
                string+= "zero";
                break;
            case 1:
                string+= "one";
                break;
            case 2:
                string+= "two";
                break;
            case 3:
                string+= "three";
                break;
            case 4:
                string+= "four";
                break;
            case 5:
                string+= "five";
                break;
            case 6:
                string+= "six";
                break;
            case 7:
                string+= "seven";
                break;
            case 8:
                string+= "eight";
                break;
            case 9:
                string+= "nine";
                break;
            case 10:
                string+= "ten";
                break;
        }
        return string;
    }
    public String lessthan20(int num, String string){
        switch (num){
            case 11:
                string += "eleven";
                break;
            case 12:
                string += "twelve";
                break;
            case 13:
                string += "thirteen";
                break;
            case 14:
                string += "fourteen";
                break;
            case 15:
                string += "fifteen";
                break;
            case 16:
                string += "sixteen";
                break;
            case 17:
                string += "seventeen";
                break;
            case 18:
                string += "eighteen";
                break;
            case 19:
                string += "nineteen";
                break;
        }return string;
    }
}

