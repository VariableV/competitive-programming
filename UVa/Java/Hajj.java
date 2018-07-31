import java.util.*;

public class Hajj 
{
    public static void main(String[] args)   
    {
        Scanner key = new Scanner(System.in);
        String word = key.next();
        int casen= 1;
        while(!word.equals("*"))
        {
            System.out.printf("Case %d: Hajj-e-%s\n", casen++, (word.equals("Hajj")? "Akbar" : "Asghar"));
            word = key.next();
        }
        key.close();
    }
}