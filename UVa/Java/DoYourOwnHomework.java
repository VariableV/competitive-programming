import java.util.*;
public class DoYourOwnHomework{
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		int N=key.nextInt();
		for(int i=1; i<=N; i++){
			System.out.printf("Case %d: ", i);
			Hashtable<String, Integer> subjects=new Hashtable<>();
			int s=key.nextInt();
			while(s-->0){
				subjects.put(key.next(),key.nextInt());
			}
			int D=key.nextInt();
			String subject=key.next();
			if (subjects.containsKey(subject)){
				int comp=subjects.get(subject);
				if (comp<=D){
					System.out.println("Yesss");
				}
				else if(comp<=D+5){
					System.out.println("Late");
				}
				else{
					System.out.println("Do your own homework!");
				}
			}
			else{
				System.out.println("Do your own homework!");
			}
		}
	}
}