import javax.swing.JOptionPane;


class Graphic_bmi_output
{
    public static void main(String[] args)
    {
        double mass, height, bmi;
        String result;
        String bmioutput = "";
        result = JOptionPane.showInputDialog(null, "input your weight like 98");
        mass = Double.parseDouble(result);
        result = JOptionPane.showInputDialog(null, "input your height like 183");
        height = Double.parseDouble(result)/100;
        bmi = mass/Math.pow(height, 2);
        bmi = Math.round(bmi); // rounding value like 29.12123352124123412345652...etc.

        for (char symbol: String.valueOf(bmi).toCharArray()) // deleting .0
        {
            if (symbol == '.')
            {
                break;
            }
            bmioutput += symbol;
        }

        JOptionPane.showMessageDialog(null, "your bmi " + Integer.parseInt(bmioutput));
    }
}
