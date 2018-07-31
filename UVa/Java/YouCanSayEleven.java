import java.math.BigInteger;
import java.util.*;

public class YouCanSayEleven
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        while(true)
        {
            String str = key.nextLine().replaceAll("\\D","");
            if(str.equals("0"))
                break;
            System.out.printf("%s is", str);
            BigInteger n = new BigInteger(str);
            if (!n.mod(new BigInteger("11")).equals(BigInteger.ZERO))
                System.out.print(" not");
            System.out.println(" a multiple of 11.");
        }
        key.close();
    }
}