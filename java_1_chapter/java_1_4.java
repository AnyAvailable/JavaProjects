package java_1_chapter;// позиционирование текущего подпакета
import javax.swing.JOptionPane;// импорт класса JOP подбиблиотеки свинг графической библиотеки джаваХ

class Input_Output_Window// начинаем задавать класс
{// начало тела класса
    public static void main(String[] args)// описание метода, имя и переданный текстовый массив аргументов
    {//начало тела метода
        String text;//указывая тип данных задаём имя переменной
        text = JOptionPane.showInputDialog("Input text:");/*
        задавая содержимое метода вызываем метод sID класса 
        JOP который возвращает введённое значение в 
        текстовую переменную */
        JOptionPane.showMessageDialog(
            null, 
            "here inputed text:\n"+text, 
            "text output", 
            JOptionPane.INFORMATION_MESSAGE
            ); /* возвращаем окно с текстом сложенным с текстом в переменной text */
    }
}
