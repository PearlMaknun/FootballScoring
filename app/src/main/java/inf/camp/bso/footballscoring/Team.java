package inf.camp.bso.footballscoring;

/**
 * Created by Lu'lu' on 02/02/2018.
 */

public class Team {

    private int mId;
    String TeamHome;
    String TeamAway;

    public Team(){
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getTeamHome() {
        return TeamHome;
    }

    public String getTeamAway() {
        return TeamAway;
    }

    public void setTeamHome(String teamAway) {
        this.TeamHome = teamAway;
    }

    public void setTeamAway(String teamAway) {
        this.TeamAway = teamAway;
    }

}
