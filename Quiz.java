import java.util.Scanner;
import java.util.ArrayList;

public class Quiz {
    public static void main(String args[])
    {
        String stop = "s";
        String next = "n";
        Scanner myScan = new Scanner(System.in);
        boolean boo = true;

        ArrayList<Questions> quiz = new ArrayList<Questions>();
        Questions question1 = new Questions("Will you choose A?", "a. yes", " ", " ", " ", " ", "a");
        quiz.add(question1);
        
        while(boo == true)
        {
            
            System.out.println("Press 'n' answer a quiz question. Press 's' to stop.");
            String opt = myScan.nextLine();

            if(opt.equals(stop))
            {
                boo = false;
            }
            
            else if(opt.equals(next) && quiz.size() > 0)
            {
                System.out.println();
                int size = quiz.size();
                int random = (int)(Math.random() * size);
                System.out.println(quiz.get(random));
                System.out.println();
                String answer = quiz.get(random).getCorrect();
                String ans = myScan.nextLine();
                System.out.println();
                if(answer.equals(ans))
                {
                    System.out.println("Correct! Nicely done.");
                    System.out.println();
                    quiz.remove(random);
                }
                else
                {
                    System.out.println("Sorry, the answer is " + answer);
                    System.out.println();
                }
            }
            else
            {
                System.out.println();
                System.out.println("Invalid input. Try again.");
                System.out.println();
            }
            
            if(quiz.size() == 0)
            {
                System.out.println("Game over!");
                boo = false;
            }
        }
    }
}

