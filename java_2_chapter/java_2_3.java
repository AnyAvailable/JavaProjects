
import javax.swing.JOptionPane;
import java.time.LocalDate;

class Gui_program_accounting_date_birth
{
    public static void main(String[] args)
    {
        int age, year;
        String result;
        result = JOptionPane.showInputDialog(null, "input your age");
        age = Integer.parseInt(result);
        result = JOptionPane.showInputDialog(null, "input current year");
        year = Integer.parseInt(result);
        JOptionPane.showMessageDialog(null, year - age);
    }
}
