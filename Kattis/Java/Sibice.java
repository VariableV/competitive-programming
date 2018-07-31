import java.util.*;

public class Sibice
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        double max = Math.sqrt(Math.pow(key.nextInt(),2) + Math.pow(key.nextInt(),2)); // max measure can be of the hypotenuse
        while(n-- > 0)
        {
            if (key.nextInt() > max)
                System.out.println("NE");
            else
                System.out.println("DA");
        }
        key.close();
    }
}