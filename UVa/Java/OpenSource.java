//https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=2180
import java.util.*;
import java.io.*;
public class OpenSource{
	static boolean islowercase(String a){
		return a.equals(a.toLowerCase());
	}
	public static void main(String[] args)throws IOException{
		Scanner key=new Scanner(new File("infile.txt"));
		ArrayList<String> input=new ArrayList<>();
		while(key.hasNextLine())
			input.add(key.nextLine());
		key.close(); input.remove(new String("0")); input.remove(new String("1"));
		ArrayList<Project> projects=new ArrayList<>();
		for(int i = 0; i < input.size(); i++){
			String proj=input.get(i);
			Set<String> lol=new HashSet<>();
			while(i+1<input.size()&&islowercase(input.get(i+1))){
				i++;
				lol.add(input.get(i));
			}
			projects.add(new Project(proj, lol));
		}
		Hashtable<String, String> universal=new Hashtable<>();
		Set<String> blacklist=new HashSet<>();
		for(int i = 0; i<projects.size(); i++){
			Project p = projects.get(i);
			Iterator<String> it=p.getset().iterator();
			while(it.hasNext()){
				String id=it.next();
				if (blacklist.contains(id)){
					it.remove();
				}
				else{
					if(!universal.containsKey(id)){
						universal.put(id, p.getname());
					}
					else{
						if (universal.get(id).equals(p.getname())) continue;
						else{
							universal.remove(id);
							blacklist.add(id);
							i=0;
							break;
						}
					}
				}
			}
		}
		Collections.sort(projects);
		for(int i=projects.size()-1; i>=0; i--){
			System.out.println(projects.get(i));
		}
	}
}
class Project implements Comparable<Project>{
	String name;
	Set<String> sigs;
	public Project(String n, Set<String> s){
		this.name=n;this.sigs=s;
	}
	public Set<String> getset(){
		return sigs;
	}
	public String getname(){
		return name;
	}
	public int compareTo(Project p){
		if (p.getset().size()==sigs.size())
			return p.getname().compareTo(name);
		else
			return sigs.size()-p.getset().size();
	}
	public String toString(){
		return String.format("%s %d", name, sigs.size());
	}
}