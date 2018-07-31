import java.io.*;
import java.math.*;
public class prob1104{
    public static void main(String[] args)throws IOException{
        BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
        String num=key.readLine().replaceAll("[^a-zA-Z0-9]","");
        boolean sol=false;
        for(int i=2; i<=36; i++){
            BigInteger base10;
            try{
                base10=new BigInteger(num, i);
            }catch(Exception e){
                continue;
            }
            if (base10.mod(BigInteger.valueOf(i).subtract(BigInteger.ONE)).equals(BigInteger.ZERO)){
                System.out.println(i);
                sol=true;
                break;
            }
        }
        if(!sol){
            System.out.println("No solution.");
        }
    }
}