import java.util.*;

public class CD
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        while(true)
        {
            int m = key.nextInt(), n = key.nextInt();
            if (m == 0 && n == 0) break;

            Set<Integer> jack = new HashSet<>(); int count = 0;
            while(m-- > 0)
                jack.add(key.nextInt());
            while(n-- > 0)
                if (jack.contains(key.nextInt())) count++;
            System.out.println(count);
        }
        key.close();
    }
}