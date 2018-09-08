/*
ID: student27
LANG: JAVA
TASK: friday
*/
import java.io.*;
public class friday{
	static boolean leapYear(int year){
		boolean pleap = year%4==0;
		if (pleap && year % 100 != 0){
			return true;
		}
		return pleap && year % 100 == 0 && year%400 == 0;
	}
	public static void main(String[] args)throws IOException{
		/*
		solution:
		iterate through each day on the gregorian calendar
		if date is the 13th, then store it in a frequency table
		*/
		BufferedReader key=new BufferedReader(new FileReader("friday.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
		int n=Integer.parseInt(key.readLine());
		boolean[] thirty = new boolean[13];
		thirty[9] = true; thirty[4] = true; thirty[6] = true; thirty[11] = true;
		int[] frequency = new int[7];

		int month=1, date=1, year=1900, day = 2, currentYear =year;
		do{
			if (date == 13){
				frequency[day]++;
			}
			// increment day accordingly
			if (thirty[month] && date == 30){
				month++; date = 0;
			}
			else if (month == 2){
				boolean leap = leapYear(currentYear);
				if(leap && date == 29){
					date = 0;
					month++;
				}
				else if (!leap && date == 28){
					date = 0;
					month++;
				}
			}
			else if (date == 31){
				date = 0;
				month++;
			}

			if (month == 13){
				month = 1;
				currentYear++;
			}
			// very bottom
			day = (day+1)%7;
			date++;
		}while(currentYear != year+n);
		String str="";
		for (int i =0; i<7; i++){
			str += frequency[i] + " ";
		}
		out.println(str.substring(0,str.length()-1));
		out.close();
	}
}