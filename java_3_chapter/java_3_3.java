class SetValuesMethods
{
    byte number;
    char symbol;

    void set(byte n)
    {
        number = n;
    }

    void set(char s)
    {
        symbol = s;
    }

    void set(byte n, char s)
    {
        set(n);
        set(s);
    }

    void set()
    {
        set((byte)0, '0');
    }
    
    void show()
    {
        System.out.printf("Values of fields:\n %d\n %c\n", number, symbol);
    }

    void show(String txt)
    {
        System.out.printf("\n%s\nValues of fields:\n %d\n %c\n", txt, number, symbol);
    }

    void show(String txt1, String txt2)
    {
        System.out.printf("\n%s: %d\n%s: %c\n", txt1, number, txt2, symbol);
    }
}
class CallMethods
{
    public static void main(String[] args)
    {
        SetValuesMethods obj1 = new SetValuesMethods();
        SetValuesMethods obj2 = new SetValuesMethods();
        SetValuesMethods obj3 = new SetValuesMethods();

        obj1.set();
        obj1.show();
        obj2.set((byte)1);
        obj2.set('A');
        obj2.show("Some Values(1)");
        obj3.set((byte)26, 'Z');
        obj3.show("value of number", "value of symbol");

    }
}
