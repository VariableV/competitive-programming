import java.io.*;
public class SplittingNumbers{
    public static void main(String[] args)throws IOException{
        BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int n= Integer.parseInt(key.readLine());
            if (n==0) break;
            int a=0, b=0; boolean toggle=true;
            for(int i =0;i< 31; i++){
                if ((n&(1 << i)) != 0){
                    if (!toggle){
                        b |= 1 << i;
                    }
                    else{
                        a |= 1 << i;
                    }
                    toggle = !toggle;
                }
            }
            System.out.printf("%d %d\n", a,b);
        }
    }
}