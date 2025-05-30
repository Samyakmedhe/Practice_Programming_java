import java.util.*;


class Digits
{
    public int CountDigit(int iNo)
    {
        int iCnt = 0, idigit = 0;
        while(iNo != 0)
        {
            idigit = iNo % 10;
            iCnt ++;
            iNo = iNo/10;
            
        }
        return iCnt;
    }
}
class program65
{


    public static void main(String A [])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.CountDigit(iValue);
        System.out.println("Number of Digits are :  "+iRet);
    }
}