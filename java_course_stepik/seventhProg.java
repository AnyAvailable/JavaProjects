import java.util.Arrays;
import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        double price = Double.parseDouble(String.format("%d.%d", r, c)) * n;
        String strPrice = Double.toString(price);
        String[] formatedOutputSequence = strPrice.split(",", 10);
        System.out.println(Arrays.toString(formatedOutputSequence)); //formatedOutputSequence[0] + " " + formatedOutputSequence[1]
    }
}
