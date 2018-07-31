import java.util.*;
public class Anagrams{
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		int T=key.nextInt(); key.nextLine();key.nextLine();
		for(int t = 0; t < T; t++){
			if (t>0) System.out.println();
			Map<String, ArrayList<String>> grams=new LinkedHashMap<>();
			while(key.hasNextLine()){
				String str=key.nextLine();
				if (str.equals("")) break;
				char[] nst=str.replaceAll("\\s+","").toCharArray();
				Arrays.sort(nst);
				String nstr=new String(nst);
				if (!grams.containsKey(nstr)){
					grams.put(nstr, new ArrayList<>());
				}
				grams.get(nstr).add(str);
			}
			ArrayList<String> result=new ArrayList<>();
			for(String tkey : grams.keySet()){
				ArrayList<String> list=grams.get(tkey);
				Collections.sort(list);
				HashSet<String> pairs=new HashSet<>();
				for(int i = 0; i < list.size(); i++){
					for(int c=0; c < list.size(); c++){
						if (i==c) continue;
						if (pairs.contains(Math.min(i,c)+""+Math.max(i,c))) continue;
						result.add(String.format("%s = %s", list.get(i), list.get(c)));
						pairs.add(Math.min(i,c)+""+Math.max(i,c));
					}
				}
			}
			Collections.sort(result);
			for(String res : result){
				System.out.println(res);
			}
		}
	}
}