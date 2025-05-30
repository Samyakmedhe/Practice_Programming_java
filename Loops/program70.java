
import java.util.*;


class Digits
{
    public int DisplayEven(int iNo)
    {
        int iCnt = 0, idigit = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }
       while(iNo !=0)
       {
            idigit= iNo % 10;
            if(idigit % 2 == 0 )
            {
                System.out.println("Even number are : "+idigit);
                iCnt++;
            }
            iNo = iNo /10;
       }
           
       return iCnt;
            
    }
 
}
class program70
{


    public static void main(String A [])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.DisplayEven(iValue);
        System.out.println("Count of even digits :  "+iRet);
    }
}