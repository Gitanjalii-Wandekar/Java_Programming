class Demo
{
    public int i;
    public static int j ;

    static
    {
        j = 21;
    }
    public Demo()       //Polymorphism is present as we use Constructor 
    {
        this.i = 11;        //First use
        System.out.println("Inside Default Constructor");
    }
    public Demo(int a)
    {
        this();             //Second use         //This will call the default constructor      
        System.out.println("Inside Parametrised Constructor");
        //this(); //ERROR this() should be on the first line of the constructor
    }
    public void Display()
    {
        System.out.println("Inside Dispaly"+this.i);    //Third use
    }
}

class ThisDemo
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(51);
        dobj.Display();

    }
}

//the need of the this keyword is if  display contains i variable in it , if both of them have the same variable then this.i will ckass class i
//i is local inside the display  , and this.i will give class variable and only i will give display variable
//super.i will give the parent variable