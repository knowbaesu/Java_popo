import java.util.Scanner;

public class show {

    public static void main(String[] args) {
        // 환율계산기
        System.out.println("1. South Korean won -> United States Dollar");
        System.out.println("2. United States Dollar -> South Korean won");
        Scanner scan = new Scanner(System.in);
        int country = scan.nextInt();
        int num = scan.nextInt();
        int i = country;
        int j = num;
        double d =  1322;

        if(country==1) {
            System.out.print( Math.ceil(j/d) + "달러 입니다");
        }
        else {
            System.out.println(j * d + "원 입니다");
        }

    }


}
