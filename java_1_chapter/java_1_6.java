package java_1_chapter;
import java.util.Scanner;

import javax.swing.JOptionPane;
class Console_input_output
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); /* создаём объект(экземпляр) 
        input класса Scanner, испольхуем спец-конструкцию new для создания 
        объекта класса Scaner в который мы передаём 
        объект стандартного потока System.in */
        String day, month;
        System.out.println("какое сегодня число?");
        day = input.nextLine();
        System.out.println("какой месяц");
        month = input.nextLine();
        String output = "сегодня" + day + "-е" + "." + month;
        System.out.println(output);
        String message;
        message = input.nextLine();
        JOptionPane.showMessageDialog(null, "here some txt:" + message, "title", JOptionPane.ERROR_MESSAGE);
    }
}
