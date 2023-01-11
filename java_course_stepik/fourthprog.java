import java.util.Scanner;
class Any
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        short n = s.nextShort();
        System.out.printf("The next number for the number %s is %s.\nThe previous number for the number %s is %s.", n, n+1, n, n-1);    
    }
}