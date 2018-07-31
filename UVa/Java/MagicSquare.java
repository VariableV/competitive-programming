import java.util.*;

public class MagicSquare
{
    private static boolean perfectSquare(int n)
    {
        return Math.pow((int)Math.sqrt(n), 2) == n;
    }

    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        key.nextLine();
        for(int t = 1; t <= n; t++)
        {
            String str = key.nextLine();
            str = str.replaceAll("[^a-z]", "");
            String rev = "";
            for (int i = str.length()-1; i >= 0; i--)
                rev+=str.charAt(i);
            System.out.printf("Case #%d:\n",t);
            if(rev.equals(str))
            {
                if (perfectSquare(str.length()))
                    System.out.println((int)Math.sqrt(str.length()));
                else
                    System.out.println("No magic :(");
            }
            else
                System.out.println("No magic :(");
        }
        key.close();
    }
}