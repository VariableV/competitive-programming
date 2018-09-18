import java.io.*;
public class square{
	public static void main(String[] args)throws IOException{
		BufferedReader key=new BufferedReader(new FileReader("square.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("square.out")));
		int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;

		for(int i = 0; i < 2; i++){
			String[] line=key.readLine().split(" ");
			int x1=Integer.parseInt(line[0]), y1=Integer.parseInt(line[1]);
			int x2=Integer.parseInt(line[2]), y2=Integer.parseInt(line[3]);
			minX = Math.min(minX, Math.min(x1, x2));
			minY = Math.min(minY, Math.min(y1, y2));
			maxX = Math.max(maxX, Math.max(x1, x2));
			maxY = Math.max(maxY, Math.max(y1, y2));
		}

		int deltaX = maxX - minX, deltaY = maxY - minY;

		out.println(Math.max(deltaX*deltaX, deltaY*deltaY));
		out.close();
	}
}