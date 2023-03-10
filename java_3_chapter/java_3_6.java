class StaticCounter1
{
    private static byte counter;
    private byte element_id;
    private String name;
    private String last_name; 

    StaticCounter1(String n)
    {
        counter++;
        element_id = counter;
        name = n;

        System.out.printf("Object %s Created it's ID %d\n", name, element_id);
    }

    public void show()
    {
        System.out.printf("ID of entrie: %d\n", element_id);
        System.out.printf("Name of entrie: %s\n", name);
        System.out.printf("Total count of entries: %d\n", counter);
    }

    public void setName(String n)
    {
        last_name = name;
        name = n;
        System.out.printf("Name %s changed to %s\n", last_name, name);
    }
}

class DB_session
{
    public static void main(String[] args)
    {
        StaticCounter1 obj1 = new StaticCounter1("alpha");
        StaticCounter1 obj2 = new StaticCounter1("bra");
        StaticCounter1 obj3 = new StaticCounter1("delta");

        obj1.show();
        obj2.show();
        obj3.show();

        obj2.setName("bravo");
        obj2.show();
        obj2.setName("pepega");
        obj2.show();
    }
}
