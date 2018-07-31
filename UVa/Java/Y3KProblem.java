import java.io.*;
import java.util.*;
public class Y3KProblem{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] line=key.readLine().split("\\s+");
			int add=Integer.parseInt(line[0]), day=Integer.parseInt(line[1]), month=Integer.parseInt(line[2]), year=Integer.parseInt(line[3]);
			if (add==0&&day==0&&month==0&&year==0) break;
			GregorianCalendar gc=new GregorianCalendar(year,month-1,day);
			gc.add(Calendar.DATE, add);
			System.out.printf("%d %d %d\n", gc.get(Calendar.DATE), gc.get(Calendar.MONTH)+1, gc.get(Calendar.YEAR));
		}
	}
}