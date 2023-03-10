import java.text.Format;

import javax.swing.JOptionPane;

class DefineSetValueShowOt
{
    byte number;
    char letter;

    void set_vars_value(byte a, char b)
    {
        number = a;
        letter = b;
    }
    String getInfo()
    {
        String text = String.format("Number: %d\nSymbol: %c", number, letter);
        return text;
    }
}



class UsingObjectsAndMethods
{
    public static void main(String[] args)
    {
        DefineSetValueShowOt f_output = new DefineSetValueShowOt();
        DefineSetValueShowOt s_output = new DefineSetValueShowOt();

        f_output.set_vars_value((byte) 1, 'A');
        s_output.set_vars_value((byte)26, 'Z');

        JOptionPane.showMessageDialog(null, f_output.getInfo());
        JOptionPane.showMessageDialog(null, s_output.getInfo());
    }
}

