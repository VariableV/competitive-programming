import java.io.*;
public class prob1293{
    public static void main(String[] args)throws  IOException{
        BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
        String[] line=key.readLine().split(" ");
        int a=Integer.parseInt(line[0]), b=Integer.parseInt(line[1]), c=Integer.parseInt(line[2]);
        System.out.println(2*a*b*c);
    }
}