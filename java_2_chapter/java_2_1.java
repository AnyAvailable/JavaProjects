package java_2_chapter;
import javax.swing.JOptionPane;


class Varaibles_and_its_types
{
    public static void main(String[] args)
    {
        int number = 123;
        double x = 22.2;
        char letter = 'A';
        boolean state = true;
        String text = "we are using these types:\n";
        text += "int(class Integer): " + number + "\n";
        text += "double(class Double): " + x + "\n";
        text += "char(class character): " + letter + "\n";
        text += "boolean(class Boolean): " + state + "\n";
        JOptionPane.showMessageDialog(
            null, 
            text, 
            "AnyAvailable is speaking\u2122", 
            JOptionPane.INFORMATION_MESSAGE);
        System.out.println("keep studing java, 2nd chapter in process");
    }
}