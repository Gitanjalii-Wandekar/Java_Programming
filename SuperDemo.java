class Hello
{
    public int i;
    public Hello(int no)
    {
        System.out.println("Inside Hello constructor");
        this.i = no +1;
    }
    public void Display()
    {
        System.out.println("Inside Hello Display");
    }

}
class Demo extends Hello
{
    public int i;
  
    public Demo(int a)      
    {
        super(a);  //First use
        System.out.println("Inside Demo Constructor");
        this.i = a;       
        
    }
    
    public void Display()
    {
        int i =0;
        System.out.println("Inside Display "+i);        //0
        System.out.println("Inside Dispaly "+this.i);    //51
        System.out.println("Inside Dispaly "+super.i);   //52       //Second use
        super.Display();        //Third use
    }
}

class SuperDemo
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(51); //No casting  same class,same reference
        dobj.Display();

    }
}

//Constructor calling sequence


