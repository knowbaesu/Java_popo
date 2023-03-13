package java09;

import java.util.Scanner;

public class a2_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Positive = 0;
        int Even =0;
        int Negative=0;
        int Odd=0;




        int num = scan.nextInt();
        if (num>0) {
            Positive++;
        }else {
            Negative++;
        }
        if ( num % 2 == 0 ) {
            Even++;
        } else {
            Odd++;
        }

        System.out.println("P - "+Positive +"  N - " + Negative +" O - " + Odd+" E - "+ Even);



        int num_2 = scan.nextInt();
        if (num_2>0) {
            Positive++;
        }else {
            Negative++;
        }
        if ( num_2 % 2 == 0 ) {
            Even++;
        } else {
            Odd++;
        }

        System.out.println("P - "+Positive +"  N - " + Negative +" O - " + Odd+" E - "+ Even);

        int num_3 = scan.nextInt();
        if (num_3>0) {
            Positive++;
        }else {
            Negative++;
        }
        if ( num_3 % 2 == 0 ) {
            Even++;
        } else {
            Odd++;
        }


        System.out.println("P - "+Positive +"  N - " + Negative +" O - " + Odd+" E - "+ Even);



    }




}