// uva325
import java.io.*;
public class LegalPascalConstants{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String str=key.readLine();
			if (str.equals("*"))break;
			str=str.trim();
			System.out.printf("%s is %s.\n", str, str.matches("[+-]?\\d+(\\.\\d+([eE][+-]?\\d+)?|[eE][+-]?\\d+)") ? "legal" : "illegal");
		}
	}
}