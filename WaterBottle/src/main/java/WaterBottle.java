public class WaterBottle {

    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int drink() {
        this.volume = this.volume - 10;
        return this.volume;
    }

    public int empty() {
        this.volume = 0;
        return this.volume;
    }

    public int fill() {
        this.volume = 100;
        return this.volume;
    }
}

