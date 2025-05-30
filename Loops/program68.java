
import java.util.*;


class Digits
{
    public int CountFrequcence(int iNo)
    {
        int iCnt = 0, idigit = 5;
        if(iNo < 0)
        {
            iNo = -iNo;
        }
       while(iNo > 0)
       {
            idigit= iNo%10;
            if(5 == idigit)
            {
                iCnt ++;
                
            }
            iNo = iNo /10;
       }
           
       return iCnt;
            
    }
 
}
class program68
{


    public static void main(String A [])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.CountFrequcence(iValue);
        System.out.println("number :  "+iRet);
    }
}