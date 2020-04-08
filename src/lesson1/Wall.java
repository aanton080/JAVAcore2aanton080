package lesson1;

public class Wall implements Obstacle {
    private int height = 5;

    Wall(int height) {
        this.height = height;
    }
    public boolean isCanDo(Participant object) {
        int jumpheight = object.jump();
        return jumpheight >= height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}




