package Colecciones;

public class BingoBall {
    private char letters;
    private int number;

    public BingoBall(int number) {
        this.number = number;

        if (number <= 15) {
            letters = 'B';
        } else if (number <= 30) {
            letters = 'I';
        } else if (number <= 45) {
            letters = 'N';
        } else if (number <= 60) {
            letters = 'G';
        } else {
            letters = 'O';
        }
    }

    public String toString() {
        return letters + " - " + number;
    }
}
