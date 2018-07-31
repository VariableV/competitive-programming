import java.util.*;
public class LanguageDetection{
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		int T=1;
		while(true){
			String str=key.next();
			if(str.equals("#"))break;
			switch(str){
				case "HELLO":str="ENGLISH";break;
				case "HOLA":str="SPANISH";break;
				case "HALLO":str="GERMAN";break;
				case "BONJOUR":str="FRENCH";break;
				case "CIAO":str="ITALIAN";break;
				case "ZDRAVSTVUJTE":str="RUSSIAN";break;
				default:str="UNKNOWN";break;
			}
			System.out.printf("Case %d: %s\n",T++,str);
		}
	}
}