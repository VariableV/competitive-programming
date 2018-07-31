import java.io.*;
import java.util.*;
public class TheTrip{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int N=Integer.parseInt(key.readLine().trim());
			if(N==0)break;
			double avg=0;
			ArrayList<Double> nums=new ArrayList<>();
			for(int i = 0; i < N; i++){
				double d=Double.parseDouble(key.readLine().trim());
				avg+=d;
				nums.add(d);
			}
			avg/=N;
			double total=0,ntotal=0;
			for(double d : nums){
				double dif =(double)(int)((d-avg) * 100.0) / 100.0;
			      if (dif > 0){
			      	total+=dif;
			      }
			      else{
			      	ntotal+=dif;
			    }
			}
			System.out.printf("$%.2f\n", -ntotal > total ?-ntotal : total);
		}
	}
}