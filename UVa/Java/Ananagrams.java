import java.util.*;
public class Ananagrams{
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		HashMap<String, ArrayList<String>> anagrams=new HashMap<>();
		while(true){
			String str=key.next();
			if(str.equals("#"))break;
			char[] nstr=str.toLowerCase().toCharArray();
			Arrays.sort(nstr);
			String newstr=new String(nstr);
			if (!anagrams.containsKey(newstr)){
				anagrams.put(newstr, new ArrayList<>());
			}
			anagrams.get(newstr).add(str);
		}
		ArrayList<String> relative=new ArrayList<>();
		for(String str : anagrams.keySet()){
			if (anagrams.get(str).size()==1){
				relative.add(anagrams.get(str).get(0));
			}
		}
		Collections.sort(relative);
		for(String an : relative){
			System.out.println(an);
		}
	}
}