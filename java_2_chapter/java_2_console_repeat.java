package java_2_chapter;
import java.util.Scanner;


class IO_string
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("input first number:");
        Integer x = input.nextInt();
        System.out.println("input second number:");
        Integer y = input.nextInt();
        Integer output = x + y;
        System.out.println("answer is: " + output);
        System.out.println("keep studing java, now repeating last topics");
    }
}
