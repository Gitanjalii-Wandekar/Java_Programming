interface A
{
    int no =11;
    void fun();
    private void Display()     //In 8 above version
    {
        System.out.println("Inside private Display");

    }

    default void gun()
    {
        System.out.println("Inside gun");
        Display();
    }
 
}

class Demo implements A   //Multiple inheritance
{
    public void fun()
    {
        System.out.println("Inside fun" );              
    }

}

class InterfaceDemo9
{
    public static void main(String Arg[])
    {
        Demo dobj = new Demo();
        dobj.fun();
        dobj.gun();
       // dobj.Display();  //ERROR
       
    }

}
