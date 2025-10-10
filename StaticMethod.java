class Demo
{
    public int i;
    static public int j=21;

    public Demo()
    {
       
    }
    
    public void fun()  //Instance Method
    {
        System.out.println("fun i:", +this.i);  
        System.out.println("fun i:", +Demo.j);
    }
    
    public static void gun()  //Class Method
    {
       // System.out.println("gun i:", +this.i);     NOT ALLOWED
        System.out.println("gun i:", +Demo.j);
    }
    

}

class StaticMethod
{
    public static void main(String A[])
    {
        Demo.gun();
        System.out.println(Demo.j);
        Demo dobj = new Demo();
        System.out.println(dobj.i);
        dobj.fun();

    }
}