import java.io.*;
import java.util.*;
public class Palinagram{
    public static void main(String[] args)throws IOException{
        BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
        String str;
        while(!(str=key.readLine()).equals("#")){
            int[] freq=new int[128];
            for(char c : str.toCharArray())
                freq[c]++;
            ArrayList<Character> arr=new ArrayList<>();
            for(int i = 0; i < freq.length; i++){
                if(freq[i]%2!=0){
                    arr.add((char)i);
                }
            }
            Collections.sort(arr);
            String ret="";
            for(char c : arr){
                ret += c;
            }
            System.out.println(ret.substring(0, ret.length()-1));
        }
    }
}