
import java.util.*;


class Digits
{
    public int DisplayEven(int iNo)
    {
        int iCnt = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }
       while(iNo !=0)
       {
            if(((iNo % 10) % 2) == 0 )
            {
                System.out.println("Even number are : "+iNo%10);
                iCnt++;
            }
            iNo = iNo /10;
       }
           
       return iCnt;
            
    }
 
}
class program71
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