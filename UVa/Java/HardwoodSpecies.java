import java.util.*;

public class HardwoodSpecies
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        key.nextLine(); key.nextLine();
        for(int i = 0; i < n; i++)
        {
            TreeMap<String, Integer> treeDict = new TreeMap<>();
            double count = 0;
            while(true)
            {
                if (!key.hasNextLine()) break;
                String str = key.nextLine();
                if (str.isEmpty()) break;

                if (treeDict.containsKey(str))
                    treeDict.put(str,treeDict.get(str)+1);
                else
                    treeDict.put(str, 1);
                count++;
            }

            Set<String> keys = treeDict.keySet();
            for(String tKey : keys)
                System.out.printf("%s %.4f\n", tKey, treeDict.get(tKey)/count*100);

            if(i != n-1) System.out.println();
        }
        key.close();
    }
}