package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.print("Введите текст для шифровки либо расшифровки: ");
        String s = c.nextLine();

        if(s.length() > 0) {
            reverseString(s,s.length() - 1);
        }
    }

    public static void reverseString(String s, int index) {
        if(index == 0) {
            System.out.println(s.charAt(index));

            return;
        }

        System.out.print(s.charAt(index));

        reverseString(s,index - 1);
    }

}