import javax.swing.*;



class GetNumFromBools
{
    private static String boolean_num_value;
    private static long long_num_value;
    
    GetNumFromBools()
    {
        input();
        output(boolean_num_value, calcul());
    }


    private static void input() throws NumberFormatException
    {
        boolean_num_value = JOptionPane.showInputDialog(
            null, 
            "first character is sign character\ninput byte-code:", 
            "bytecode-number calc", 
            JOptionPane.PLAIN_MESSAGE
            );
        if(boolean_num_value == null)
        {
            System.exit(0);
        }
        if(boolean_num_value.isEmpty())
        {
            plainErrorWindow();
        }
        for(char symbol : boolean_num_value.toCharArray())
        {
            checkForBinNum(symbol);
        };
        for(char symbol : boolean_num_value.toCharArray())
        {
            try
            {
                short check = Short.parseShort(String.valueOf(symbol));
            }
            catch(NumberFormatException e)
            {
                dataErrorWindow();
            };
        };
        
    };


    private static long calcul()
    {
        byte count = 0;
        char[] symbols = boolean_num_value.toCharArray();
        while(count < symbols.length)
        {
            if(symbols[0] == '0')
            {
                if((symbols[count] == '1') & count != 0)
                {
                    long_num_value += Math.pow(2, (symbols.length - count - 1));
                }
            }
            else
            {
                if((symbols[count] == '1') & count != 0)
                {
                    long_num_value -= Math.pow(2, (symbols.length - count - 1));
                }
            }

            count++;
        };
        return long_num_value;
    };


    private static void output(String input, long output)
    {
        JOptionPane.showMessageDialog(
            null, 
            String.format(
                "here is your bin number: %s\nhere is your dec number %d", 
                input, output
                ), 
            "bytecode-number calc", 
            JOptionPane.PLAIN_MESSAGE
            );
    };
    

    private static void checkForBinNum(char num)
    {
        char[] checklist = "23456789".toCharArray();
        for (char symbol : checklist)
        {
            if(num == symbol)
            {
                dataErrorWindow();
            }
        };
    };


    private static void plainErrorWindow()
    {
        JOptionPane.showMessageDialog(
            null, 
            "Plain text isn't calculable", 
            "plainError", 
            JOptionPane.ERROR_MESSAGE
            );
        input();        
    };


    private static void dataErrorWindow()
    {
        JOptionPane.showMessageDialog(
            null, 
            "Only 0 and 1 allowed", 
            "dataError", 
            JOptionPane.ERROR_MESSAGE
            );
        input();
    };
}

class Main
{
    public static void main(String[] args)
    {
        new GetNumFromBools();
    }
}
