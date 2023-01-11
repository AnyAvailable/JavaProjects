import java.util.Scanner;
class fifthProg {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        short n1 = s.nextShort();
        short n2 = s.nextShort();
        s.close();
        System.out.printf("%s\n%s", n1*n2, n1*2+n2*2);
    }
}
