package ru.itsjava.homeWork.hwBirds;

public class Birds {
    private final String beakShapes;
    private final String plumageColor;

    public Birds(String beakShapes, String plumageColor) {
        this.beakShapes = beakShapes;
        this.plumageColor = plumageColor;
    }

    public String toString() {
        return "BeakShapes:" + beakShapes + " PlumageColor:" + plumageColor;
    }
}
