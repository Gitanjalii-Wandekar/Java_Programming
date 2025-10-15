class Demo
{
    public int iNO1;
    public int iNo2;

    public Demo()
    {
        System.out.println("Inside Default Constructor...");
    }
    public Demo(int i,int j)
    {
         System.out.println("Inside Parametrised Constructor...");
    }
    protected void finalize()     //~Demo()
    {
        System.out.println("Inside Finalize");

    }
}

class ConstructorDestructor
{
    public static void main(String Arg[])
    {
        Demo dobj1 = new Demo();     //C++ = Demo obj1();

        Demo dobj2 = new Demo(11,21);   //C++ = Demo obj2(11,21);

        dobj1 = null;
        dobj2 = null;

        System.gc();

        System.out.println("End of Main"); // System=class, out=object, println=method();

    }
}
 
