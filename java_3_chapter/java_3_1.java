import javax.swing.JOptionPane;
class Variables
{
    byte a, b, c;
    char d, e, f;
}

class UsingObgectFields
{
    public static void main(String[] args)
    {
        char output;
        Variables vars = new Variables();
        vars.a = 2;
        vars.b = 4;
        vars.c = 10;
        vars.d = 'T';
        vars.e = 'F';
        vars.f = 'U';
        output = ((vars.a&vars.b) < vars.c)?vars.d:vars.e; // ternar operior
        JOptionPane.showMessageDialog(null, output);
    }
}
