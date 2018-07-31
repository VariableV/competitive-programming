import java.util.*;

public class DigitCounting
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        while(n-- > 0)
        {
            int[] arr = new int[10];
            int num = key.nextInt();
            for(int i = 1; i <= num; i++)
            {
                String str = Integer.toString(i);
                char[] charr = str.toCharArray();
                for(char c : charr)
                    arr[(int)c - 48]++;
            }

            String output = "";
            for (int i : arr)
                output += i + " ";
            System.out.println(output.trim());
        }
        key.close();
    }
}