import java.util.*;

public class MotherBear
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        while(true)
        {
            String str = key.nextLine();
            if (str.equals("DONE"))
                break;

            str = str.replace(".","");
            str = str.replace(",","");
            str = str.replace("!","");
            str = str.replace("?","");
            str = str.replace(" ","");
            str = str.toUpperCase();

            String reversed = "";
            for(int i = str.length()-1; i >= 0; i--)
                reversed += str.charAt(i);

            System.out.println((reversed.equals(str)) ? "You won't be eaten!" : "Uh oh..");
        }
        key.close();
    }
}