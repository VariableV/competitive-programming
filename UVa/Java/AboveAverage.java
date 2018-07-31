import java.util.*;
import java.io.*;

public class AboveAverage 
{
    public static void main(String[] args) throws IOException
    {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        while(n-- > 0)
        {
            int students = key.nextInt();
            int[] grades = new int[students];
            double classAverage = 0;

            for (int i = 0; i < students; i++)
            {
                grades[i] = key.nextInt();
                classAverage += grades[i];
            }

            classAverage /= students;

            int count = 0;
            for (int i = 0; i < students; i++)
                if (grades[i] > classAverage)
                    count++;

            System.out.printf("%.3f%%\n", (double)count/students*100);
        }
        key.close();
    }
}
