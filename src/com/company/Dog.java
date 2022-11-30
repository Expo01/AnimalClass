package com.company;

public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog() {
        super("mutt", "big", 50);
        //to call an empty constructor from the super class, you need to have made an empty constructor in the super class...
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15? "small": (weight < 35? "medium" : "large"), weight);
            //nested ternary for the 'size' field in the constructor which calls the super constructor
          //super has to be first to call the constructor. then 'this.' used to complete new fields in the constructor
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog (String type, double weight){
        this(type,weight,"Perky","curled");
        // constructor chaining present where hard coded ear and tail shape.
        // 'this' calls the Dog constructor with 5 parameters which then calls the super class constructor
    }

    @Override
    public void makeNoise() {
        super.makeNoise(); //if I want the output from the super class as well as specific output from the
        //overrided method just keep the super statement
        if (type == "wolf"){
            System.out.println("owwwooooooo");
        } else {
            bark();
        }
    }

    public void move(String speed){
       if (speed == "slow"){
           walk();
           wagTail();
       }else {
           run();
       }
        //if i only want the output from the overrided method then delete the super statement
        //here i used if condition calling private Dog methods as the overrided 'move' method function
    }

    private void bark() {
        System.out.println("barkbarkbarkbarkbarkbark");
    }

    private void run(){
        System.out.println("dog running");
    }

    private void walk(){
        System.out.println("dog walking");
    }

    private void wagTail(){
        System.out.println("dog wagging tail");
    }
}

