package lesson1;

public class Human implements Participant {
    private String name;
    private int CanRun;
    private int CanJump;



    public Human(String name,int CanRun, int CanJump){
        this.name = name;
        this.CanRun = CanRun;
        this.CanJump = CanJump;
    }
    public int run(){
        System.out.printf("Человек %s пробегает %d%n", name, CanRun);
        return CanRun;
    }




    public int jump(){
        System.out.printf("Человек %s делает прыжок %d%n", name, CanJump);

    return CanJump;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", CanRun=" + CanRun +
                ", CanJump=" + CanJump +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCanRun() {
        return CanRun;
    }

    public void setCanRun(int canRun) {
        CanRun = canRun;
    }

    public int getCanJump() {
        return CanJump;
    }

    public void setCanJump(int canJump) {
        CanJump = canJump;
    }
}
