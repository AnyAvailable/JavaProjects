package java_1_chapter;
import javax.swing.JOptionPane;

class Window_settings_and_output
{
    public static void main(String[] args)
    {
        String title;
        String message;
        title = JOptionPane.showInputDialog(
            null, 
            "input title of window:", 
            JOptionPane.QUESTION_MESSAGE
            );
        message = JOptionPane.showInputDialog(
            null, 
            "input message to output:", 
            "Window containment", 
            JOptionPane.QUESTION_MESSAGE
            );
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
