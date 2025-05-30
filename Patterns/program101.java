// INPUT ; 4 ,4 
/*
    a   a   a   a
    b   b   b   b 
    c   c   c   c
*/
import java.util.*;

class Pattern 
{
    public void Display(int iRow , int iCol)
    {
        int i = 0, j = 0 ;
        char Ch1 = '\0';
        char Ch2 = '\0';

        for(i = 1,Ch1 = 'a',Ch2 = 'A'; i <= iRow ; i++,Ch1++,Ch2++)
        {
            for(j = 1 ; j<= iCol ; j++ )
            {
                if(i % 2 == 0 )
                {
                    System.out.print(Ch2+"\t");
                }
                else
                {
                    System.out.print(Ch1+"\t");
                }
                
                
            }
            System.out.println();
        }
    }
}
class program101
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