import java.util.*;
public class AddAll{
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		while(true){
			int N=key.nextInt();
			if (N==0) break;
			PriorityQueue<Integer> sum=new PriorityQueue<>();
			while(N-->0){
				int num=key.nextInt();
				sum.offer(num);
			}
			int total=0;
			while(sum.size()>1){
				int n1=sum.poll(), n2=sum.poll();
				total += n1 + n2;
				sum.offer(n1+n2);
			}
			System.out.println(total);
		}
	}
}