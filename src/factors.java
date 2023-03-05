import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int i = 1; i <= num - 1; i++) {
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
