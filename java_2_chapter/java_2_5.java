import java.util.Scanner;
class IO_console_bmi_program
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double mass, height, bmi;
        String output;
        System.out.println("input your weight");
        mass = input.nextDouble();
        System.out.println("input your height");
        height = input.nextDouble()/100;
        bmi = mass/Math.pow(height, 2);
        output = String.valueOf(Math.round(bmi*100)/100.0);
        System.out.println(output);
    }
}