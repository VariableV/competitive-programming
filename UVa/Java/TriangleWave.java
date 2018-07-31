import java.util.*;

public class TriangleWave
{
	static String printWave(int amplitude)
	{
		String output = "";

		for(int a = 1; a <= amplitude; a++)
		{
			for(int b = 0; b < a; b++)
				output += (a);
			output += "\n";
		}
    	for(int a = amplitude-1; a >= 1; a--)
    	{
      		for(int b = 0; b < a; b++)
        		output += (a);
      		output += "\n";
    	}

    	return output;
	}
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int N = key.nextInt();
		for(int t = 0; t < N; t++)
		{
			if(t > 0) System.out.println();
			int a = key.nextInt(), f = key.nextInt();

			String output = "";
			for(int i = 0; i < f; i++)
			{
				if (i > 0) output += "\n";
				output += printWave(a);
			}

			System.out.print(output);
		}
	}
}