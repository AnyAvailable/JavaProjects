package java_1_chapter;

// позиционирование текущего подпакета
import javax.swing.JOptionPane;// импорт класса JOP подбиблиотеки свинг графической библиотеки джаваХ

class ShowWindow // начинаем задавать класс
{ // начало тела класса
    public static void main(String[] args) // описание метода, имя и переданный текстовый массив аргументов
    {//начало тела метода
        String title = "какое-то окно, не знаю как оно появилось"; //указывая тип данных задаём имя переменной и содержимое
        String text = "продолжаем зубрить яву"; //указывая тип данных задаём имя переменной и содержимое
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.QUESTION_MESSAGE);/*
        вызываем метод showMessageDialog класса JOptionPane с последующей 
        передачей вышезаданных переменных в качестве аргумента метода sMP,
        задаём тип выпадающего окна встроенной в класс JOP константой
        QUESTIO_MESSAGE */
    }// конец тела метода
}// конец тела класса