import java.util.*;
public class LoansomeCarBuyer{
    public static void main(String[] args){
        Scanner key=new Scanner(System.in);
        while(true){
            int months=key.nextInt();
            if (months<0) break;
            double down=key.nextDouble(),loan=key.nextDouble(), monthly=loan/months;
            int recs=key.nextInt();
            double[] depreciation = new double[months+1];
            int lastidx=0;
            while(recs-->0){
                int month=key.nextInt();
                double percentage=key.nextDouble();
                for(int i=month; i<=months; i++){
                    depreciation[i]=percentage;
                }
            }
            double original=down+loan;
            original-=depreciation[0]*original;
            if (original>loan){
                System.out.println("0 months");
            }
            else{
                for(int i = 1; i <= months; i++){
                    loan-=monthly;
                    original -= depreciation[i] * original;
                    if (original>loan){             
                        System.out.printf("%d month%s\n", i, (i!=1) ? "s": "");
                        break;   
                    }
                }   
            }
        }
    }
}