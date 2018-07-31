import java.util.*;
public class Parity{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		while(true){
			int n=key.nextInt();
			if(n==0) break;
			String binary=Integer.toString(n, 2);
			int parity=0;
			char[] ca=binary.toCharArray();
			for(char c : ca){
				if (c=='1'){
					parity++;
				}
			}
			System.out.printf("The parity of %s is %d (mod 2).\n", binary, parity);
		}
	}
}