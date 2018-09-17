import java.io.*;
import java.util.*;
public class Kornislav{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String[] str=key.readLine().split(" ");
		Arrays.sort(str);
		System.out.println(Integer.parseInt(str[0]) * Integer.parseInt(str[2]));
	}
}