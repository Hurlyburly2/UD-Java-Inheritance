package com.dsimon;

public class Fish extends Animal {
    private int gills;
    private int fins;
    private int eyes;

    public Fish(String name, int size, int weight, int gills, int fins, int eyes) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }

    private void rest() {
        
    }

    private void moveMuscles() {
        System.out.println("Fish moved muscles");
    }

    private void moveBackFin() {
        System.out.println("Fish moves back fins");
    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
