// INPUT ; 4 ,4 
/*
    1   2   3   4   
    5   6   7   8   
    9   10  11  12
*/
import java.util.*;

class Pattern 
{
    public void Display(int iRow , int iCol)
    {
        int i = 0, j = 1;

        for(i = 1; i <= iRow ; i++)
        {
            for(j = 1 ; j<= iCol ; j++)
            {
                if((j == 1 ) || (j == iCol ) || ( i == 1) || (i == iRow))
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print(" \t");
                }
                
            }
            System.out.println();
        }
    }
}
class program106
{
    public static void main(String A [])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0 , iValue2 = 0;

        System.out.println("Enter Number of Rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Number of Coloumns  : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);
    }
}