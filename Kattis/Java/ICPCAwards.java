import java.io.*;
import java.util.*;
public class ICPCAwards{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(key.readLine());
		LinkedHashSet<Team> tset=new LinkedHashSet<>();
		while(n-->0){
			if (tset.size()==12)break;
			String[] str=key.readLine().split(" ");
			tset.add(new Team(str[0], str[1]));
		}
		for (Team setmem : tset){
			System.out.println(setmem.uni + " " + setmem.name);
		}
	}
}
class Team{
	public String uni, name;
	public Team(String u, String n){
		uni=u; name=n;
	}
	@Override
	public int hashCode(){
		return uni.hashCode();
	}
	public boolean equals(Object t){
		return uni.equals(((Team)t).uni);
	}
}