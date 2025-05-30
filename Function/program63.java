

import java.util.*;


class Number
{
    public int SumNonFactors(int iNo)
    {   
        int iCnt = 0, iSum = 0 ;
       
        for(iCnt = 1 ; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt != 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
}  
class program63
{

    public static void main(String A [])
    {

        boolean bRet = false;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.SumNonFactors(iValue);
        System.out.println("Non factors Addition is  "+iRet);
    
    }
    
}