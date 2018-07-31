import java.util.*;

public class ThrowCard
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        while(true)
        {
            int n = key.nextInt();
            if (n==0)
                break;
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 1; i <= n; i++)
                arr.add(i);
            
            while(true)
            {
                if (arr.size() == 1)
                {
                    System.out.println(n + " " + arr.get(0));
                    break;
                }
                arr.remove(0);
                int num = arr.remove(0);
                arr.add(num);
            }
        }
        key.close();
    }
}