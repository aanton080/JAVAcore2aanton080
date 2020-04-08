package lesson1;



public class Competition {
    private Obstacle[] obstacles;
    private Participant[] participants;
    private  String competitionTitle;

    public Competition(String competitionTitle) {
        this.competitionTitle = competitionTitle;
    }

    public void setObstacles(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void setParticipants(Participant... participants) {
        this.participants = participants;
    }

    public void startCompetition() {

        for (Participant participant : participants) {
            boolean action = passAllObstacles(participant);
            if (!action) {
                System.out.println("Участник " + participant + " покинул испытание");
            } else {
                System.out.println("Участник " + participant + " прошёл все испытания успешно");
            }
        }
    }


    private boolean passAllObstacles(Participant participant) {
        for (Obstacle obstacle : obstacles) {
            if ( !obstacle.isCanDo(participant) ) {
                return false;
            }

        }
        return true;
    }


}
