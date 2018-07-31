import java.util.*;

class Proposal implements Comparable<Proposal>
{
    String name;
    int entry;
    double compliance, price;

    public Proposal(String name, int entry, double compliance, double price)
    {
        this.name = name;
        this.entry = entry;
        this.compliance = compliance*100; this.price = price;
    }

    @Override
    public int compareTo(Proposal p)
    {
        if (compliance!=p.compliance) // if compliances are equal then check price
            return (int)Math.round(compliance-p.compliance);
        else if (price!=p.price) // if price is the same then check entry no.
            return (int)Math.round(p.price-price);
        else
            return p.entry-entry;
    }
}

public class RequestForProposal
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        int case_id = 1;
        while(true)
        {
            int n = key.nextInt(), p = key.nextInt();
            if (n == 0 && p == 0)
                break;
            key.nextLine();
            for(int i = 0; i < n; i++)
                key.nextLine();

            ArrayList<Proposal> arr = new ArrayList<>();
            
            for(int i = 0; i < p; i++)
            {
                String name = key.nextLine();
                double price = key.nextDouble();
                double met = key.nextInt();
                key.nextLine();
                arr.add(new Proposal(name, i, met/p, price));
                while(met-- > 0)
                    key.nextLine();
            }
            Collections.sort(arr);
            if (case_id > 1)
                System.out.println();
            System.out.printf("RFP #%d\n%s\n", case_id++, arr.get(arr.size()-1).name);
        }
        key.close();
    }
}