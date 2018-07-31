import java.util.*;

public class Median
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();
        while(key.hasNextInt())
        {
            arrList.add(key.nextInt());
            Collections.sort(arrList);
            int idx = arrList.size()/2;
            int num = arrList.get(idx);
            if ((arrList.size()&1)==0)
                num = (arrList.get(idx) + arrList.get(idx-1))/2;
            System.out.println(num);
        }
        key.close();
    }
}