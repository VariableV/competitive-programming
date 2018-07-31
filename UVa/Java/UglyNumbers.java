//import java.util.*;
public class UglyNumbers{
	public static void main(String[] args){
		// commented out for constant run-time since there's only one possible answer
		/*PriorityQueue<Long> pq=new PriorityQueue<>();
		List<Long> set=new ArrayList<>();
		pq.offer(1l);
		while(set.size()!=1500){
			long x=pq.poll();
			if(!set.contains(x)){
				set.add(x);
				pq.offer(x*2l); pq.offer(x*3l); pq.offer(x*5l);
			}
		}
		System.out.println(set.get(set.size()-1));
		*/
		System.out.printf("The 1500'th ugly number is 859963392.\n");
	}
}