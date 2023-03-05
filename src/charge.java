import java.util.Scanner;

public class charge {
    public static void main(String[] args){
        System.out.println("자판기 메뉴의 숫자를 입력해주세요.");
        Scanner scan = new Scanner(System.in);
        int pay = scan.nextInt();
        int pay_1 = 0;

            if(pay==1){
                pay_1=340;
            } else if (pay==2){
                pay_1=500;
            } else if (pay==3){
                pay_1=650;
            } else if (pay==4) {
                pay_1=290;
            } else if (pay==5) {
                pay_1=170;
            }

            if(pay<=6) {
                int change = (1000 - pay_1);
                int hundred = change / 100;
                int fifth = (change % 100) / 50;
                int ten = (change % 50) / 10;
                System.out.println("the change is "+change+"("+"100 X "+hundred+","+"50 X "+fifth+","+"10 X "+ten+")");
            } else {
                System.out.println("자판기에 없는 메뉴입니다. 다시 확인하시고 숫자를 입력해주세요");
            }

    }
}
