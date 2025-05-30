

import java.util.*;


class Number
{
    public int  SumFactors(int iNo)
    {   
        int iCnt = 0, iSum = 0;
        System.out.println("factors of "+iNo+" is : ");
        for(iCnt = 1 ; iCnt <= iNo/2 ; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
}
class program61
{

    public static void main(String A [])
    {

        boolean bRet = false;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.SumFactors(iValue);
        System.out.println("Additon of factors is : "+iRet);


        
    }
    
}