import java.io.*;
public class Mine_Sweeper{
	static int[][] checks={{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{-1,1},{1,-1},{1,1}};
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(key.readLine()), t=0;
		while(N-->0){
			if (t++>0){
				System.out.println();
			}
			key.readLine();
			int size=Integer.parseInt(key.readLine());
			char[][] rawgrid=new char[size][size], playedgrid=new char[size][size], outputgrid=new char[size][size];
			for(int c = 0; c < size; c++){
				String line=key.readLine();
				rawgrid[c]=line.toCharArray();
			}
			for(int c = 0; c < size; c++){
				String line=key.readLine();
				playedgrid[c]=line.toCharArray();
			}
			for(int i = 0; i < size; i++){
				for(int c = 0; c < size; c++){
					outputgrid[i][c]='.';
				}
			}
			boolean dead=false;
			for(int r = 0; r < size; r++){
				for(int c = 0; c < size; c++){
					if (playedgrid[r][c]!='x') continue;
					if (playedgrid[r][c]=='x'&&rawgrid[r][c]=='*'){
						dead=true;
					}
					outputgrid[r][c]=0;
					for(int[] pos : checks){
						int pr = r+pos[0], pc= c+pos[1];
						if (pr >= size || pc >= size || pr < 0 || pc < 0) continue;
						if (rawgrid[pr][pc]=='*'){
							outputgrid[r][c]++;
						}
					}
					outputgrid[r][c] += 48;
				}
			}
			String output="";
			for(int r = 0; r < size; r++){
				for(int c = 0; c < size; c++){
					output += (dead&&rawgrid[r][c]=='*') ? '*' : outputgrid[r][c];
				}
				output+="\n";
			}
			System.out.print(output);
		}
	}
}