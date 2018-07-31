import java.util.*;
public class Containers{
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		int T=1;
		while(true){
			String str=key.nextLine();
			if (str.equals("end"))break;
			ArrayList<Character> stack=new ArrayList<>();
			stack.add(str.charAt(0));
			if (str.length()>1){
				for(char c : str.toCharArray()){
					boolean trig=false;
					for(int i = 0; i < stack.size(); i++){
						if (c <= stack.get(i)){
							stack.set(i, c);
							trig=true;
							break;
						}
					}
					if(!trig){
						stack.add(c);
					}
				}
			}
			System.out.printf("Case %d: %d\n", T++, stack.size());
		}
	}
}