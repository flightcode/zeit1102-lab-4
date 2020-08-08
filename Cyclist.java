public class Cyclist {
    String name;
    String team;
    double time;
    int StageWins;

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
        this.time = time;
        if (winStage) {
            this.StageWins++;
        }
    }

    public void resetRace() {

    }

    public String toString() {
        return "Name: " + this.name + "; Team: " + this.team + "; Time: " + this.time + "; Stage Wins: "
                + this.StageWins + ";";
    }
}