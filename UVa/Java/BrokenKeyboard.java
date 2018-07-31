import java.util.*;

public class BrokenKeyboard
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        while(key.hasNextLine())
        {
            String str = key.nextLine();
            int idxPtr = 0;
            LinkedList<Character> linkedList = new LinkedList<>();
            char[] charr = str.toCharArray();
            for (int i = 0; i < charr.length; i++)
            {
                if (charr[i] == '[')
                    idxPtr = 0;   
                else if (charr[i] == ']')
                    idxPtr = linkedList.size();
                else
                    linkedList.add(idxPtr++, charr[i]);
            }
            String out = "";
            for(char c : linkedList)
                out+=c;
            System.out.println(out);
        }
        key.close();
    }
}