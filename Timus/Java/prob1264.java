import java.io.*;
public class prob1264{
    public static void main(String[] args)throws IOException{
        BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
        String[] line=key.readLine().split(" ");
        int n=Integer.parseInt(line[0]), m=Integer.parseInt(line[1]);
        System.out.printf("%d\n", n*(m+1));
    }
}