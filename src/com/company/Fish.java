package com.company;

public class Fish extends Animal {

    private int gills;
    private int finns;

    public Fish(String type, double weight, int gills, int finns) {
        super(type, "small", weight);
        this.gills = gills;
        this.finns = finns;
    }

    private void moveMuscles() {
        System.out.println("muscles moving");
    }

    private void moveeBackFin() {
        System.out.println("backfin moving");
    }

    public void move(String speed){
        super.move(speed);
        moveMuscles();;
        if (speed == "fast"){
            moveeBackFin();
        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", finns=" + finns +
                '}' + super.toString();
    }
}

