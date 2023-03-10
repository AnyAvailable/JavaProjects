class StaticCounter
{
    static byte counter = 0;
    byte element_id;

    StaticCounter() // записывая в конструктор действия, они будут выполнятся при каждом создании объекта
    {
        counter++;
        System.out.printf("Object created ID: %d\n", counter);
        element_id = counter;
    }

    static void show()
    {
        System.out.printf("Objects count: %d\n", counter);
    }

    void get_element_id()
    {
        System.out.printf("Element ID: %d", element_id);
    }
}

class UsingCounter
{
    public static void main(String[] args)
    {
        StaticCounter.show();
        StaticCounter obj1 = new StaticCounter();
        StaticCounter obj2 = new StaticCounter();
        StaticCounter obj3 = new StaticCounter();
        StaticCounter obj4 = new StaticCounter();
        StaticCounter obj5 = new StaticCounter();
        StaticCounter obj6 = new StaticCounter();
        StaticCounter obj7 = new StaticCounter();
        StaticCounter obj8 = new StaticCounter();
        StaticCounter obj9 = new StaticCounter();
        StaticCounter obj10 = new StaticCounter();

        StaticCounter.show();
        obj1.show();
        obj2.show();
        obj3.show();
        obj4.show();
        obj5.show();
        obj6.show();
        obj7.show();
        obj8.show();
        obj9.show();
        obj10.show();

        obj3.get_element_id();
    }
}
