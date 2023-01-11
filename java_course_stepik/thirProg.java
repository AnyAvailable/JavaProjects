import java.util.Scanner;

class ThirProg {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        short s1 = obj.nextShort();
        short s2 = obj.nextShort();
        short s3 = obj.nextShort();
        obj.close();
        System.out.println(s1*s2*s3);
    }
}
