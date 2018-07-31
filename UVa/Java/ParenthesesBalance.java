import java.io.*;
import java.util.*;
public class ParenthesesBalance{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(key.readLine());
		while(N-->0){
			String line=key.readLine();
			Stack<Character> open=new Stack<>();
			boolean trig=false;
			for(int i = 0; i < line.length(); i++){
				char c = line.charAt(i);
				if (c=='(' || c=='['){
					open.add(c);
				}
				else{
					if (open.size()==0){
						trig=true;
						break;
					}
					else{
						char top=open.pop();
						if (top=='(' && c != ')'){
							trig=true;
							break;
						}
						else if (top=='[' && c != ']'){
							trig=true;
							break;
						}
					}
				}
			}
			System.out.println((open.size()>0 || trig ? "No" : "Yes"));
		}
	}
}