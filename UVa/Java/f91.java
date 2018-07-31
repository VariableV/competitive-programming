import java.util.*;
import java.io.*;

public class f91 
{
    public static int f91(int n)
    {
        if (n <= 100)
            return f91(f91(n+11));
        else if (n >= 101)
            return n-10;
        return 0;
    }

    public static void main(String[] args) throws IOException
    {
        Scanner key = new Scanner(System.in);

        while(true)
        {
            int n = key.nextInt();
            if (n == 0)
                break;
            System.out.printf("f91(%d) = %d\n", n, f91(n));
        }
    }
}
