package JAVA_0308;

public class JAVA07 {

    public static void main(String[] args) {
        String text = "Hello, hi";
        System.out.println(text);
        System.out.println(text.length());
        System.out.println(text.charAt(2));

        char[] c = text.toCharArray(); //hello, hi 한글자 한글자 array안에 넣어라.
        System.out.println(c[0]);
        System.out.println(text.replace("H", "h")); //앞에있는걸 뒤에있는걸로 바꿔라.

        String[] t = text.split(",");
        System.out.println(t[0]);
        System.out.println(t[1]);
    }

}
