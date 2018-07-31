import java.util.*;

public class KeyToCrypto
{
    public static char rotate(char c, int amnt)
    {
        int ic = (int)c;
        int newchar = ic + amnt;
        if (newchar > 90)
            return (char)((int)'Z' - newchar + (int)'B');
        else if (newchar < 65)
            return (char)((int)'['-Math.abs(amnt));
        else
            return (char)newchar;
    }

    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        String cipher = key.nextLine();
        String secretword = key.nextLine() + cipher.substring(0, cipher.length()-3);
        String str = "";
        for (int i = 0; i < cipher.length(); i++)
            str += rotate(cipher.charAt(i), -((int)secretword.charAt(i) - (int)'A'));
        System.out.println(str);
        key.close();
    }
}