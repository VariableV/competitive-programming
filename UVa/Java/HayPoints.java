import java.util.*;
public class HayPoints{
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		Hashtable<String, Integer> dict=new Hashtable<>();
		int words=key.nextInt(), N=key.nextInt();
		while(words-->0)
			dict.put(key.next(),key.nextInt());
		while(N-->0){
			int total=0;
			while(true){
				String word=key.next();
				if (word.equals(".")) break;
				if (dict.containsKey(word)){
					total+=dict.get(word);
				}
			}
			System.out.println(total);
		}
		key.close();
	}
}