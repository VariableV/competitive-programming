import java.io.*;
public class prob2012{
    public static void main(String[] args)throws IOException{
        BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(key.readLine());
        System.out.printf("%s\n", 12-n <= 4*60/45 ? "YES" : "NO");
    }
}