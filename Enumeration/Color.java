package Enumeration;

public enum Color {
    RED("red"), BLUE("blue"), GREEN("green");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
