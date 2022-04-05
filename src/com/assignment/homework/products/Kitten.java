package com.assignment.homework.products;

public class Kitten extends Animal {
    public Kitten(String Arm, String body, String head, String Leg, String Tail) {
        super(Arm, body, head, Leg, Tail);
    }

    @Override
    public void eat() {
        System.out.println(
                "Kitten Eating"
        );
    }

    @Override
    public void showMe() {
        System.out.println(
                getArm() + " \n" + getBody() + " \n" + getHead() + " \n" + getBody() + " \n" + getLeg() + " \n" + getTail()
        );
    }
}

