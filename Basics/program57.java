

import java.util.*;


class Arithematic 
{   
    public int Addition(int iNo1 , int iNo2 )
    {

        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }

}
class program57
{
    public static void main(String A [])
    {

        int iValue1 = 0, iValue2 = 0, iRet = 0;

        Scanner sobj = null;

        sobj = new Scanner(System.in);
        System.out.println("Enter first number : ");
        iValue1 = sobj.nextInt();
        System.out.println("Enter first number : ");
        iValue2 = sobj.nextInt();
        
        Arithematic Aobj  = new Arithematic();

        iRet = Aobj.Addition(iValue1 , iValue2);
        System.out.println("Addition is : "+iRet);
    
        

    }
}