package LongestCommonPrefix;

import java.util.Scanner;

public class CommonApp {
    public static void main(String[] args) {

        String[] arr = {"telephone", "television", "telecommute"};
        Prefix object1 = new Prefix(arr);
        String result = object1.test();

        System.out.println("Prefix: " + result);
    }
}

