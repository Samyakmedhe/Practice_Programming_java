// INPUT ; 4 ,4 
/*
    
  
*/
import java.util.*;

class Pattern 
{
    public void Display(int iRow , int iCol)
    {
        int i = 0, j = 0 ;
        char Ch = '\0';

        for(i = 1,Ch = 'A'; i <= iRow ; i++,Ch++ )
        {
            for(j = 1 ; j<= iCol ; j++ )
            {
                System.out.print(Ch+"\t");
                
            }
            System.out.println();
        }
    }
}
class program98
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