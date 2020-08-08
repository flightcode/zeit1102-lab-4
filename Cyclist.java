public class Cyclist {
    String name;
    String team;
    double time;
    int StageWins;

    public static void main(String[] args) {
        Cyclist cyclst1 = new Cyclist("Thomas", "Team Ineos");
        cyclst1.setName("Geraint " + cyclst1.getName());
        System.out.println(cyclst1.getName());
        System.out.println(cyclst1.getTeam());
        cyclst1.recordStage(209.6, true);
        cyclst1.recordStage(318.62, true);
        System.out.println(cyclst1.getStageWins());
        System.out.println(cyclst1.toString());
        cyclst1.resetRace();
    }

    public Cyclist(String name, String team) {
        this.name = name;
        this.team = team;
        this.time = 0;
        this.StageWins = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getTeam() {
        return this.team;
    }

    public int getStageWins() {
        return this.StageWins;
    }

    public void recordStage(double time, boolean winStage) {
        this.time += time;
        if (winStage) {
            this.StageWins++;
        }
    }

    public void resetRace() {
        this.time = 0;
        this.StageWins = 0;
    }

    public String toString() {
        return "Name: " + this.name + "; Team: " + this.team + "; Time: " + this.time + "; Stage Wins: "
                + this.StageWins + ";";
    }
}