import java.util.*;

public class RobotInstructions
{
    private static void procInstr(String instr, ArrayList<String> arr, int[] robvalue)
    {
        if (instr.contains("SAME"))
        {
            procInstr(arr.get(Integer.parseInt(instr.substring(instr.lastIndexOf(" ")+1))), arr, robvalue);
        }
        else
        {
            if (instr.equals("LEFT")) 
                robvalue[0]--;
            else 
                robvalue[0]++;
        }
    }

    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        while(n-- > 0)
        {
            int instrCount = key.nextInt();
            key.nextLine();
            int[] a = {0};
            ArrayList<String> instrs = new ArrayList<>();
            instrs.add("FILLER");

            for(int pc = 1; pc <= instrCount; pc++)
            {
                String instr = key.nextLine();
                instrs.add(instr);
                procInstr(instr, instrs, a);
            }
            System.out.println(a[0]);
        }
        key.close();
    }
}