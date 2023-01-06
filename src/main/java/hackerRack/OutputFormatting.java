package hackerRack;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-14s %03d %n", s1, x);
            // %-14s  fifteen characters left-justified o to 14
            // %03d padded with leading zero
            //ready to feel the company
        }
    }
}