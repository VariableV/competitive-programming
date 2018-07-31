import java.io.*;
public class ASpecialBirthdaySong{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(key.readLine());
		String[] bday="Happy birthday to you Happy birthday to you Happy birthday to Rujia Happy birthday to you".split("\\s+");
		String[] people=new String[N];
		for(int i = 0; i < N; i++){
			people[i]=key.readLine();
		}
		key.close();
		int i;
		for(i = 0; i < Math.max(bday.length, people.length); i++){
			System.out.printf("%s: %s\n", people[i%people.length], bday[i%bday.length]);
		}
		while((i-1)%bday.length != bday.length-1){
			System.out.printf("%s: %s\n", people[i%people.length], bday[i%bday.length]);	
			i++;
		}
	}
}