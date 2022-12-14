package com.company;

public class Animal {

    protected String type;
    //use of protected here for the overrided 'makeNoise' method from the animal class for 'if' type condition
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public Animal() {

    }

    @Override   // just used command N "to String" to auto generate this
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move (String speed){
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise () {
        System.out.println(type + " makes some kind of noise");
    }



}
