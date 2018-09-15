import java.io.*;
import java.util.*;
public class NoDuplicates{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String[] str=key.readLine().toUpperCase().split("\\s+");
		Set<String> set=new HashSet<>();
		for (int i = 0; i< str.length;i++){
			if (!set.add(str[i])){
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");
	}
}