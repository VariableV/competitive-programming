import java.util.*;

public class Palindromes
{
    public static class PalindromeHelper
    {
        public static String reverseStr(String str)
        {
            String ret = "";
            for (int i = str.length()-1; i >= 0; i--)
                ret += str.charAt(i);
            return ret;
        }

        private static char getMirroredChar(char c)
        {
            switch(c)
            {
                case 'A': case 'H': case 'I': case 'M': 
                case 'O': case 'T': case 'U': case 'V': 
                case 'W': case 'X': case 'Y': case '1': case '8':
                return c;
                case 'E': return '3';
                case 'J': return 'L';
                case 'L': return 'J';
                case 'S': return '2';
                case 'Z': return '5';
                case '2': return 'S';
                case '3': return 'E';
                case '5': return 'Z';
                default: return ' ';
            }
        }

        public static String mirrorString(String str)
        {
            str = reverseStr(str);
            String ret = "";
            for(int i = 0; i < str.length(); i++)
                ret += getMirroredChar(str.charAt(i));
            return ret;
        }

        public static boolean checkPalindrome(String str)
        {
            return str.equals(reverseStr(str));
        }

        public static boolean checkMirrored(String str)
        {
            return str.equals(mirrorString(str));
        }
    }

    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        while(key.hasNext())
        {
            String str = key.next();
            System.out.print(str + " -- is ");
            if (PalindromeHelper.checkMirrored(str) && PalindromeHelper.checkPalindrome(str))
                System.out.println("a mirrored palindrome.\n");
            else if (!PalindromeHelper.checkMirrored(str) && PalindromeHelper.checkPalindrome(str))
                System.out.println("a regular palindrome.\n");
            else if (PalindromeHelper.checkMirrored(str) && !PalindromeHelper.checkPalindrome(str))
                System.out.println("a mirrored string.\n");
            else
                System.out.println("not a palindrome.\n");

        }
        key.close();
    }
}