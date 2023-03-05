import java.util.Scanner;
public class star_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1; j<i;j=(2*j)-1){
                System.out.print(j);
            }
            System.out.println();}
    }
}
