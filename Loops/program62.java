

import java.util.*;


class Number
{
    public void SumFactors(int iNo)
    {   
        int iCnt = 0;
        System.out.print("Non factors of "+iNo+" is : ");
        for(iCnt = 1 ; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt != 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}  
class program62
{

    public static void main(String A [])
    {

        boolean bRet = false;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.SumFactors(iValue);
    
    }
    
}