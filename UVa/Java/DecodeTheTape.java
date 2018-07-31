import java.io.*;
public class DecodeTheTape{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		key.readLine();
		String s;
		while(!(s=key.readLine()).equals("___________")){
			s=s.replaceAll("[|\\.]", "").substring(1);
			
			char[] bstring=s.toCharArray();
			String binarystring="";
			for (char c : bstring){
				if(c=='o') binarystring+="1";
				else binarystring+="0";
			}
			int ch = Integer.parseInt(binarystring,2);
			if (ch==13){
				out.println();
			}else {
				out.print((char)ch);
			}
		}
		out.flush();
		out.close();
	}
}