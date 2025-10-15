import java.util.Scanner;

class SelectionDemo2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in); //We connet it with keyboard that is standard input device
        int iStd = 0;

        System.out.println("Enter your Standard:");
        iStd = sobj.nextInt();//Used to accept the integer from the user which gets stored in the variable

        if(iStd == 1)
        {
            System.out.println("Exam at 9 AM");
        }
        else if(iStd == 2)
        {
            System.out.println("Exam at 10 AM");
        }
         else if(iStd == 3)
        {
            System.out.println("Exam at 11 AM");
        }
         else if(iStd == 4)
        {
            System.out.println("Exam at 12 NOON");
        }
        else
        {
            System.out.println("Invalid standard");
        }
    }
}