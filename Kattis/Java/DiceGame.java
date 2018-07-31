import java.io.*;
public class DiceGame{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String[] line0=key.readLine().split(" "),line1=key.readLine().split(" ");
		int gunnar=Integer.parseInt(line0[1])+(Integer.parseInt(line0[0])-1);
		gunnar+=Integer.parseInt(line0[3])+(Integer.parseInt(line0[2])-1);
		int emma=Integer.parseInt(line1[1])+(Integer.parseInt(line1[0])-1);
		emma+=Integer.parseInt(line1[3])+(Integer.parseInt(line1[2])-1);
		System.out.printf("%s\n", gunnar == emma ? "Tie" : (gunnar > emma) ? "Gunnar" : "Emma"); 
	}
}