import java.io.File;
import javax.swing.*;


class CallPics
{
    private String picName;
    CallPics()
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                picCycle();
            } 
            });
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                input();
            } 
            });
    }
    public static void window(String pics)
    {
        JOptionPane.showMessageDialog(
            null, 
            "".format(
                "here are available pics: %s", 
                pics
                ), 
            "Available pics to call", 
            JOptionPane.INFORMATION_MESSAGE
            );
    }

    private void picCycle()
    {
        File dir1 = new File("C:/Users/egoro/Downloads/java_learning/java_4_chapter/images");
        File[] unit = dir1.listFiles();
        String pics = "\n";
        for(File file : unit)
        {
            if(!file.isDirectory())
            {
                pics += file.getName() + '\n';
            }
        };
        window(pics);
    }

    private void input()
    {
        picName = JOptionPane.showInputDialog(
            null, "Input name of picture to call:");
        ImageIcon pic = new ImageIcon("C:/Users/egoro/Downloads/java_learning/java_4_chapter/images/"+picName);
        System.out.println(pic);
        JOptionPane.showMessageDialog(
            null, pic, 
            "your title", 
            JOptionPane.PLAIN_MESSAGE
            );
    }
}

class getImages
{
    public static void main(String[] args)
    {
        new CallPics();
    }
}