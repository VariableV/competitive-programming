import java.util.*;

public class HangmanJudge
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        while(true)
        {
            int round = key.nextInt();
            if (round == -1)
                break;
            key.nextLine();

            String answer = key.nextLine(), userInput = key.nextLine();
            int wrong = 0;
            HashSet<Character> duped = new HashSet<>(), guessed = new HashSet<>();

            for(int i = 0; i < userInput.length(); i++)
            {
                char c = userInput.charAt(i);
                if (duped.contains(c) || guessed.contains(c))
                    continue;
                
                if (answer.indexOf(c) > -1)
                {
                    answer = answer.replace(""+c, "");
                    duped.add(c);
                }
                else
                {
                    if(++wrong==7)
                        break;
                }
                guessed.add(c);
            }

            System.out.printf("Round %d\n", round);
            if (answer.length() == 0)
                System.out.println("You win.");
            else if (answer.length() > 0 && wrong < 7)
                System.out.println("You chickened out.");
            else
                System.out.println("You lose.");
        }
        key.close();
    }
}