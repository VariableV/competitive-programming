import java.io.*;
import java.util.*;
public class ArmyBuddies{
    public static void main(String[] args)throws IOException{
        BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=key.readLine())!= null){
            String[] asb = str.split("\\s+");
            int s=Integer.parseInt(asb[0]), b=Integer.parseInt(asb[1]);
            if (s==0 && b==0) break;
            Buddy[] army=new Buddy[s+2];
            army[0] = new Buddy(0, 1);
            army[s+1] = new Buddy(s, s+1);
            for (int i = 1; i <= s; i++){
                army[i] = new Buddy(i-1, i+1);
            }
            while(b-->0){
                asb = key.readLine().split("\\s+");
                int x=Integer.parseInt(asb[0]), y=Integer.parseInt(asb[1]);
                //String ret=String.format("%s %s", army[x].left != -1 ? Integer.toString(army[x].left + 1) : "*", army[y].right != s ? Integer.toString(army[y].right + 1) : "*");
                System.out.println(ret);
                //army[
            }
            System.out.println("-");
        }
    }
}
class Buddy{
    public int left,right;
    public Buddy(int l, int r){
        left=l;
        right=r;
    }
}