import java.text.Format;

import javax.swing.*;


class Coder
{
    static String bytecode = "";
    Coder()
    {
        output(coder(input()));
    }

    private static String input()
    {
        return JOptionPane.showInputDialog(
            null, 
            "Input number:", 
            "input", 
            JOptionPane.QUESTION_MESSAGE
            );
    }
    
    private static String coder(String number) throws NumberFormatException
    {
        if(number == null)
            {
                System.exit(0);
            }
        try
        {
            Integer.parseInt(number);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(
                null, 
                "you fucked up input only numbers if you didn't study at school here are they 1, 2, 3, 4, 5, 6, 7, 8, 9, 0",
                "fuck you",
                JOptionPane.ERROR_MESSAGE
                );
                output(coder(input()));
        };
            int num = Integer.parseInt(number);
                do
                {
                    bytecode = String.valueOf(Math.abs(num % 2) + bytecode);
                    num /= 2;
                }
                while(num != 0);
            return bytecode;
    }

    private static void output(String bytecode)
    {
        JOptionPane.showMessageDialog(
            null, 
            String.format("here's your byte code:\n%s", bytecode)
            );
    }
}



class Main
{
    public static void main(String[] args)
    {
        new Coder();
    }
}