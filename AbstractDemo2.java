abstract class Base
{
    public:
        int i,j;

        public int Addition(int a, int b)
        {
            return a+b;
        }
        abstract public int Substraction(int a,int b) = 0;
}
class Derived extends Base
{

}
class AbstractDemo2
{
    public static void main(String A[])
    {
        Base bp = new Derived(); //Error
        
    }
} 