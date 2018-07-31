import java.io.*;
public class prob2001{
    public static void main(String[] args)throws IOException{
        BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
        String[] line=key.readLine().split(" ");
        int a1=Integer.parseInt(line[0]), b1=Integer.parseInt(line[1]);
        line=key.readLine().split(" ");
        int b2=Integer.parseInt(line[1]);
        line=key.readLine().split(" ");
        int a3=Integer.parseInt(line[0]);

        System.out.printf("%d %d\n", a1-a3, b1-b2);
    }
}