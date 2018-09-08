/*
ID: student27
LANG: JAVA
TASK: beads
*/
import java.io.*;
public class beads{
	static String str;
	static int bruteforce(int idx, String currentStr){
		if (idx == str.length()) return currentStr.length();
		char currentChar = str.charAt(idx);
		if (currentChar == 'w')
			return Math.max(bruteforce(idx+1, currentStr + "b"), bruteforce(idx+1, currentStr + "r"));
		if (currentStr.length() == 0)
			return bruteforce(idx+1, currentStr + currentChar);
		if (currentChar == currentStr.charAt(currentStr.length()-1))
			return bruteforce(idx+1, currentStr + currentChar);
		else{
		
		System.out.println(currentStr);
			// reached a wrong character, reset the counter to 0, start over currentStr
			return bruteforce(idx+1, "" + currentChar);
		}
	}
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new FileReader("beads.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
		int len = Integer.parseInt(key.readLine());
		str = key.readLine();
		//str += str;
		//System.out.println(str);
		System.out.println(bruteforce(0, ""));
	}
}