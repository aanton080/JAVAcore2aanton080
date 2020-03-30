package lesson1;

public class TestLesson1 {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик",99,1);
        Cat cat2 = new Cat("Борис",88,6);
        Human human  = new Human("Вася",10000,5);
        Robot robot = new Robot("MMP2000",1000,1000);
        Robot robot2 = new Robot("MMP1",12,1000);
        Treadmill treadmill = new Treadmill(100);
        Wall wall = new Wall(5);
        Competition competition = new Competition("Испытание");
        competition.setParticipants(human, cat,cat2,robot2, robot);
        competition.setObstacles( wall, treadmill);

        competition.startCompetition();




    }
}
