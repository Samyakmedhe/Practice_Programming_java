
import java.util.*;


class Digits
{
    public int  Reverse(int iNo)
    {
        int iCnt = 0, idigit = 0 , iRev = 0 ;
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0)
       {
            idigit = iNo % 10;
            iRev = iRev * 10 + idigit;
            iNo = iNo /10;
       }
           
       return iRev;
            
    }
 
}
class program73
{

    public static void main(String A [])
    {
        int iRet = 0;
        Scanner sobj= new Scanner(System.in);
 
        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();

        iRet = dobj.Reverse(iValue);
        System.out.println("Reverse number is : "+iRet);
        
    }
}