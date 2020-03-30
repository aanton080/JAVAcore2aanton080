package lesson1;

public class Treadmill implements Obstacle {
    private int lenght = 5;

    Treadmill(int lenght) {
        this.lenght = lenght;
    }



    public boolean isCanDo(Participant object) {
        int runlenght = object.run();
        return runlenght >= lenght;
    }





    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
}
