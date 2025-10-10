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
}

class Constructor
{
    public static void main(String Arg[])
    {
        Demo dobj1 = new Demo();     //C++ = Demo obj1();

        Demo dobj2 = new Demo(11,21);  

    }
}
 
