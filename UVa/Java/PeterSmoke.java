import java.util.*;

public class PeterSmoke
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        while(key.hasNextInt())
        {
            int n = key.nextInt();
            System.out.println(n + (n-1)/(key.nextInt()-1));
        }
        key.close();
    }
}