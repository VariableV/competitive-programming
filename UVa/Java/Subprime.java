import java.util.*;
public class Subprime{
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		while(true){
			int B=key.nextInt(),N=key.nextInt();
			if(B==0 && N==0)break;
			Hashtable<Integer, Integer> reserves=new Hashtable<>();
			for(int i = 1; i <= B; i++){
				reserves.put(i,key.nextInt());
			}
			while(N-->0){
				int d=key.nextInt(),c=key.nextInt(),v=key.nextInt();
				reserves.put(d,reserves.get(d)-v);
				reserves.put(c,reserves.get(c)+v);
			}
			boolean s=true;
			for(Integer n : reserves.keySet()){
				if (reserves.get(n)<0){
					s=false;
					break;
				}
			}
			System.out.println((s ? 'S' : 'N'));
		}
	}
}