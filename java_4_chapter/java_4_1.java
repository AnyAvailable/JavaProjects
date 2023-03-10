import javax.swing.*;

class ConditionUsing
{
    String input, txt, title;
    short number;
    ImageIcon img;

    ConditionUsing()
    {
        input();
        emptyCheck();
        checkNum();
    }

    private static void errorOut()
    {
        JOptionPane.showMessageDialog(null, 
            "INCORRECT INPUT", 
            "ERROR", 
            JOptionPane.ERROR_MESSAGE
            );
            System.exit(0);
    }

    private static void isDoubleSep()
    {
        JOptionPane.showMessageDialog(null, 
            "Due to Condition it separetes by 2 with out ending it's even", 
            "Separation", 
            JOptionPane.INFORMATION_MESSAGE
            );
            System.exit(0);
    }
    
    private static void isNotDoubleSep()
    {
        JOptionPane.showMessageDialog(null, 
            "Due to Condition it does not separetes by 2 with out ending it's odd", 
            "Separation", 
            JOptionPane.INFORMATION_MESSAGE
            );
            System.exit(0);
    }

    private void input()
    {
        input = JOptionPane.showInputDialog(
            null, 
            "Input natural number [-32768...32767]", 
            "Number check",
            JOptionPane.QUESTION_MESSAGE
            );
    }

    private void emptyCheck()
    {
        if((input != null) & (String.valueOf(input).isEmpty()))
        {
            ConditionUsing.errorOut();
        }
        else if(input == null)
        {
            System.exit(0);
        }
    }

    private void checkNum() throws NumberFormatException
    {
        try
        {
            number = Short.parseShort(input);
        }
        catch(NumberFormatException e)
        {
            ConditionUsing.errorOut();
        }
        if(number % (short)2 == 0)
        {
            isDoubleSep();
        }
        else
        {
            isNotDoubleSep();
        }
    }
    public static void main(String[] args)
    {
        new ConditionUsing();
    }
}
