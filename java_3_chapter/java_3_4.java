class VarsContainer
{
    byte number;
    char symbol;
    VarsContainer()
    {
        number = (byte)1;
        symbol = (char)'A';
    }

    VarsContainer(byte n, char s)
    {
        number = n;
        symbol = s;
    }

    void show()
    {
        System.out.printf(
            "Values of fields:\n%s: %d\n%s %c\n", 
            "Number: ", number, "Letter: ", symbol
            );
    }
}

class CreateDiferentContainer
{
    public static void main(String[] args)
    {
        VarsContainer obj1 = new VarsContainer();
        VarsContainer obj2 = new VarsContainer((byte)26, 'Z');
        obj1.show();
        obj2.show();
    }
}
