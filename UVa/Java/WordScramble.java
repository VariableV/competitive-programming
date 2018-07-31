import java.io.*;
import java.util.*;
public class WordScramble{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=key.readLine())!=null){
			String output="";
			ArrayList<String> words=new ArrayList<>();
			for(int i = 0; i < s.length(); i++){
				int start=i; i++;
				while(i < s.length() && s.charAt(i) != ' '){
					i++;
				}
				words.add(s.substring(start,i));
			}
			for(int i = 0; i < words.size(); i++){
				output += (new StringBuffer(words.get(i))).reverse().toString() + (i==words.size()-1 ? "" : " ");
			}
			System.out.println(output);
		}
	}
}