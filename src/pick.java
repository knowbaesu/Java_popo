package hello;

import java.util.Scanner;

public class convert {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

//		for (int i=97; i< 97 + 26; i++) {
//			System.out.println((char)i);
//		}


//

        Scanner scan = new Scanner(System.in);
        String po = scan.nextLine();




        System.out.println((byte) (po.charAt(0)));

        int bo = po.charAt(0);
        System.out.println(bo + 32);



        for(int i=0; i<po.length();i++) {
            if (((byte) (po.charAt(i))>=65 && ((byte) (po.charAt(i))<=90)))
            {
                System.out.print((char) (po.charAt(i)+32));}
            else {
                System.out.print((char) (po.charAt(i)-32));
            }
        }
    }

}
