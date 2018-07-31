import java.util.*;
public class SkewBinary{
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		while(true){
			String bin= (new StringBuffer(key.nextLine())).reverse().toString();
			if (bin.equals("0")) break;
			int result=0;
			for(int i = 0; i < bin.length(); i++)
				result += (Character.digit(bin.charAt(i), 10) * (Math.pow(2,i+1)-1));
			System.out.println(result);
		}
		key.close();
	}
}