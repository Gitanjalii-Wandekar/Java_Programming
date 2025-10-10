class Demo
{
    public int i; //We can initialised the variable here
    final public int j;

    public Demo(int a, int b)  //(int a=10, int b=21)  NOT ALLOWED
    {
        this.i=a;
        this.j=b;
    }
    

}

class FinalData4
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(11,21);
        System.out.println(dobj.i);
        System.out.println(dobj.j);

        dobj.i++;
        //dobj.j++; //ERROR

    }
}