
/**
 * Write a description of class Team here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Team
{
    // instance variables - replace the example below with your own
    String name;
    private Player p1;
    private Player p2;
    private Player p3;
    private double teamAvg;
    private int teamAtBats;
    private int teamHits;
    private static int teamNum;

    /**
     * Constructor for objects of class Team
     */
    public Team(String InName, Player player1, Player player2, Player player3)
    {
        // initialise instance variables
        name = InName;
        p1 = player1;
        p2 = player2;
        p3 = player3;
        teamAtBats = (p1.getAtBats() + p2.getAtBats() + p3.getAtBats());
        teamHits = (p1.getHits() + p2.getHits() + p3.getHits());
        teamAvg = (double) teamHits / teamAtBats;
        teamNum++;
    }
    
    //Returns the number of teams in the league
    public static int getTeamNum()
    {
        return teamNum;
    }
    
    //Prints out the Stats for the team
    public void printStats()
    {
        System.out.println(name + ":");
        System.out.println("    At bats: " + teamAtBats);
        System.out.println("    Hits: " + teamHits);
        System.out.println("    Batting Avg: " + teamAvg);
        System.out.println("    Players:");
        System.out.println("        " + p1.getName() + "---> At Bats: " + p1.getAtBats() + ", Hits: " + p1.getHits() + ", Batting Avg: " + p1.calcBatAvg());
        System.out.println("        " + p2.getName() + "---> At Bats: " + p2.getAtBats() + ", Hits: " + p2.getHits() + ", Batting Avg: " + p2.calcBatAvg());
        System.out.println("        " + p3.getName() + "---> At Bats: " + p3.getAtBats() + ", Hits: " + p3.getHits() + ", Batting Avg: " + p3.calcBatAvg());
    }
   
}
