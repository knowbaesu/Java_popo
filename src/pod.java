package hello;

import java.util.Scanner;

public class A2_08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Result: 1"+"-"+"Mean "+ num + " Max " + num + " Min "+ num);
        int num_2 = scan.nextInt();
        int max =  Math.max(num, num_2);
        int min =  Math.min(num, num_2);
        System.out.println("Result: 1"+"-"+"Mean "+ (num+num_2)/2 + " Max " + max + " Min "+ min);
        int num_3 = scan.nextInt();
        System.out.println("Result: 1"+"-"+"Mean "+ (num+num_2+num_3)/3 + " Max " + Math.max(max, num_3) + " Min "+ Math.min(max, num_3));

    }

}
