import java.util.*;
import java.io.*;
public class GuessingGame{
	public static void main(String[ ]args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		mainl: while(true){
			boolean[] vals=new boolean[10];
			Arrays.fill(vals,true);
			while(true){
				int num=Integer.parseInt(key.readLine());
				if (num==0)break mainl;
				String str=key.readLine();
				if (!str.equals("right on")){
					if (str.equals("too high")){
						for(int i = num-1; i <= vals.length-1; i++){
							vals[i]=false;
						}
					}
					else if (str.equals("too low")){
						for(int i = 0; i <= num-1; i++){
							vals[i]=false;
						}
					}
				}
				else{
					if (vals[num-1]){
						System.out.println("Stan may be honest");
					}
					else{
						System.out.println("Stan is dishonest");
					}
					break;
				}
			}
		}
	}
}