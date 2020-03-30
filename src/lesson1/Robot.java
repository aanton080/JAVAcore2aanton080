package lesson1;

public class Robot implements Participant {
    private String name;
    private int CanRun;
    private int CanJump;

    public Robot(String name,int CanRun, int CanJump){
        this.name = name;
        this.CanRun = CanRun;
        this.CanJump = CanJump;
    }



    public int jump(){
        System.out.printf("Робот %s делает прыжок %d%n", name, CanJump);
        return CanJump;
    }

    public int run(){
        System.out.printf("Робот %s пробегает %d%n", name, CanRun);
        return CanRun;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", CanRun=" + CanRun +
                ", CanJump=" + CanJump +
                '}';
    }

    public int getCanJump() {
        return CanJump;
    }

    public void setCanJump(int canJump) {
        CanJump = canJump;
    }

    public int getCanRun() {
        return CanRun;
    }

    public void setCanRun(int canRun) {
        CanRun = canRun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
