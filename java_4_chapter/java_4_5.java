import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("input start value");
        long start = input.nextInt();
        System.out.println("input end value");
        int stop = input.nextInt();
        System.out.println("\n\n_____________________________________________________________");
        for(long i = Long.valueOf(start); i < stop + 1; i++)
        {
            start = i * i;
            System.out.println(start);
        }
    }
}