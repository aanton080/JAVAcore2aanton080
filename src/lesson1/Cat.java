package lesson1;

public class Cat implements Participant {
    private String name;
    private int CanRun;
    private int CanJump;

    public Cat(String name,int CanRun, int CanJump){
        this.name = name;
        this.CanRun = CanRun;
        this.CanJump = CanJump;
    }



    public int jump(){
        System.out.printf("Кот %s делает прыжок %d%n", name, CanJump);
        return CanJump;
    }

    public int run(){
        System.out.printf("Кот %s пробегает %d%n", name, CanRun);
        return CanRun;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", CanRun=" + CanRun +
                ", CanJump=" + CanJump +
                '}';
    }
}
