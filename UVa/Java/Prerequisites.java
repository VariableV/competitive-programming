import java.util.*;
public class Prerequisites{
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		while(true){
			int k=key.nextInt();
			if (k==0)break;
			int m=key.nextInt();
			HashSet<String> courses=new HashSet<>();
			int first=-1;
			while(true){
				String course=key.next();
				if (course.length()!=4){
					first=Integer.parseInt(course);
					break;
				}
				else{
					courses.add(course);
				}
			}
			boolean follows_minimum=true;
			for(int i = 0; i < m; i++){
				int req=key.nextInt();
				while(first-->0){
					if(courses.contains(key.next())){
						req--;
					}
				}
				if (req>0)follows_minimum=false;
				if (i!=m-1) first=key.nextInt();
			}
			System.out.println((follows_minimum ? "yes" : "no"));
		}	
	}
}