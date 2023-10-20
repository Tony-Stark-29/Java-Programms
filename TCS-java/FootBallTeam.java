import java.util.Scanner;
class teamScore
{
    char t1,t2;
    String score;

    public  teamScore(char t1,char t2,String score)
    {
        this.t1=t1;
        this.t2=t2;
        this.score=score;
    }
}
public class FootBallTeam
{

    public static void main(String[] args)
    {

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        int teams=n*(n-1)/2;

        teamScore[] scores=new teamScore[teams];

        for(int i=0;i<teams;i++)
        {
            char t1=scan.next().charAt(0);
            char t2=scan.next().charAt(0);
            String score= scan.nextLine();
            scores[i]=new teamScore(t1,t2,score);
        }

        


    }
}
