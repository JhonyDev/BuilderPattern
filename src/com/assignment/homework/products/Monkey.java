package com.assignment.homework.products;

public class Monkey extends Animal {
    public Monkey(String Arm, String body, String head, String Leg, String Tail) {
        super(Arm, body, head, Leg, Tail);
    }

    @Override
    public void eat() {
        System.out.println(
                "Monkey Eating"
        );
    }

    @Override
    public void showMe() {
        System.out.println(
                getArm() + " \n" + getBody() + " \n" + getHead() + " \n" + getBody() + " \n" + getLeg() + " \n" + getTail()
        );
    }
}
