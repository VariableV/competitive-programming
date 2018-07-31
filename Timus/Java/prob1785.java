import java.io.*;
public class prob1785{
    public static void main(String[] args)throws IOException{
        BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
        String[] id=new String[2001];
        for(int i=1; i<=4; i++){id[i]="few";}
        for(int i=5; i<=9; i++){id[i]="several";}
        for(int i=10; i<=19; i++){id[i]="pack";}
        
        for(int i=20; i<=49; i++){id[i]="lots";}
        for(int i=50; i<=99; i++){id[i]="horde";}
        for(int i=100; i<=249; i++){id[i]="throng";}
        
        for(int i=250; i<=499; i++){id[i]="swarm";}
        for(int i=500; i<=999; i++){id[i]="zounds";}
        for(int i=1000; i<=2000; i++){id[i]="legion";}
        System.out.println(id[Integer.parseInt(key.readLine())]);
    }
}