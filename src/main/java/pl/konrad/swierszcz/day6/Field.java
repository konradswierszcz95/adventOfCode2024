package pl.konrad.swierszcz.day6;

public record Field(int xPos, int yPos, Type type) {
    public enum Type {
        EMPTY,
        OBSTACLE,
        OCCUPIED
    }
}