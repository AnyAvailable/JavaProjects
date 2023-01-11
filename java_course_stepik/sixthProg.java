import java.util.Scanner;
class Prog {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(n+2-1*n%2);
    }
}
