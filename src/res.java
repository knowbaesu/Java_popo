package java10;

public class java_10test {
    public static final int ONETIME = 0;
    public static final int RANDOM = 0;
    public static final int EVENNUMBER =0;
    public static final int ODDNUMBER = 1;



    public static void main(String[] args) {

        System.out.println(getRandomNumber(ONETIME));

        isEvenNumber(7);

    }


    private static int getRandomNumber(int a) {
        int c = 0;
        int sum =0;
        int count = 0;
        int z = 0;

        if (a == ONETIME) {
            c = (int)(Math.random() * 100);
            z = c;
        } else if (a == RANDOM) {
            c = (int)(Math.random() * 100);
            while(sum<100) {
                sum = c+ sum;
                count++;
                z = count;
            }
        }
        return z;
    }
    public static void isEvenNumber(int i) {
        if (i % 2 == EVENNUMBER ) {
            System.out.println("짝수");
        } else if(i % 2 ==ODDNUMBER) {
            System.out.println("홀수");
        }



    }
}
