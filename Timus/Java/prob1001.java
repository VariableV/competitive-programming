import java.io.*;
import java.util.*;
public class prob1001{
    public static void main(String[ ]args)throws IOException{
        BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lines=new ArrayList<>();
        String str;
        while((str=key.readLine())!=null){
            str=str.trim();if (str.length()>0) lines.add(str);
        }
        for(int i = lines.size()-1; i >=0; i--){
            str=lines.get(i);
            String[] line=str.split("\\s+");
            for(int j=line.length-1; j>=0;j--){
                System.out.printf("%.4f\n",Math.sqrt(Double.parseDouble(line[j])));
            }
        }
    }
}