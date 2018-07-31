import java.io.*;
public class prob1877{
    public static void main(String[] args)throws IOException{
        BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(key.readLine()),b=Integer.parseInt(key.readLine());
        System.out.printf("%s\n", a%2==0 || b%2!=0 ? "yes" : "no");
    }
}