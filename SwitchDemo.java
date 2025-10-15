import java.util.Scanner;

class SwitchDemo
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in); //We connet it with keyboard that is standard input device
        int iStd = 0;

        System.out.println("Enter your Standard:");
        iStd = sobj.nextInt();//Used to accept the integer from the user which gets stored in the variable

        switch(iStd)
        {
            case 1:
                System.out.println("Exam at 9 AM");
                break;
            case 2:
                System.out.println("Exam at 10 AM");
                break;
            case 3:
                System.out.println("Exam at 11 AM");
                break;
            case 4:
                System.out.println("Exam at 12 NOON");
                break;
            default:
                System.out.println("Invaild Standard");
        }
    }
}