import java.io.*;
public class Trik{
	static void move(char m, boolean[] b){
		boolean tmp;
		switch(m){
			case 'A':tmp=b[1];b[1]=b[0];b[0]=tmp;break;
			case 'B':tmp=b[1];b[1]=b[2];b[2]=tmp;break;
			case 'C':tmp=b[0];b[0]=b[2];b[2]=tmp;break;
		}
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		boolean[] gamearr={true,false,false};
		char[] moves=key.readLine().toCharArray();
		for(char c : moves){
			move(c,gamearr);
		}
		System.out.printf("%d", gamearr[0] ? 1 : gamearr[1] ? 2 : 3);
	}
}