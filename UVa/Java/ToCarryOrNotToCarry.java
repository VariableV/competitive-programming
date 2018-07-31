import java.io.*;
public class ToCarryOrNotToCarry{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=key.readLine())!=null){
			String[] line=s.split("\\s+");
			int a=Integer.parseInt(line[0]),b=Integer.parseInt(line[1]);
			char[] bina=String.format("%32s",Integer.toString(a,2)).replace(" ", "0").toCharArray(),binb=String.format("%32s",Integer.toString(b,2)).replace(" ","0").toCharArray();
			String result="";
			for(int i = 31; i >= 0; i--){
				int x=bina[i]-'0',y=binb[i]-'0';
				result = (x+y)%2 + result;
			}
			System.out.println(Integer.parseInt(result,2));
		}
	}
}