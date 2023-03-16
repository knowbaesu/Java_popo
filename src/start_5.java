package prac;

import java.util.Scanner;

public class Java_star_A3 {

    public static void main(String[] args) {
        System.out.println("몇줄까지 별을 찍을까요? 숫자를 적어주세요.");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();


        for(int i = 1; i<=num;i++) {
            scan.close();

        }
    }

}
