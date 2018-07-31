import java.io.*;
import java.util.*;
public class DaVinciCode{
    static void fib(ArrayList<Integer> arr){
        arr.add(1);
        arr.add(2);
        int idx=2;
        while(true){
            int result = arr.get(idx-1) + arr.get(idx-2);
            if (result <= 0) break;
            arr.add(result);
            idx++;
        }
    }
    public static void main(String[] args)throws IOException{
        ArrayList<Integer> fibList = new ArrayList<>();
        fib(fibList);
        BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(key.readLine());
        while(t-->0){
            int fibNum = Integer.parseInt(key.readLine());
            String[] fibArr = key.readLine().split(" ");
            char[] resArr = new char[101];
            Arrays.fill(resArr, ' ');
            String str = key.readLine().replaceAll("[^A-Z]", "");
            for(int i = 0; i < fibNum; i++){
                resArr[Collections.binarySearch(fibList, Integer.parseInt(fibArr[i]))] = str.charAt(i);
            }
            int eidx=100;
            while(true){
                if (resArr[eidx] != ' '){
                    break;
                }
                eidx--;
            }
            System.out.println(new String(resArr).substring(0,eidx+1));
        }
    }
}