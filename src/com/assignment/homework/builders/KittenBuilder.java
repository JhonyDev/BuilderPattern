package com.assignment.homework.builders;

import com.assignment.homework.products.Kitten;

public class KittenBuilder implements AnimalBuilder {
    String Arm;
    String body;
    String head;
    String Leg;
    String Tail;

    public Kitten getResult() {
        return new Kitten(Arm, body, head, Leg, Tail);
    }

    @Override
    public void buildArm(String arm) {
        Arm = arm;
    }

    @Override
    public void buildBody(String body) {
        this.body = body;
    }

    @Override
    public void buildHead(String head) {
        this.head = head;
    }

    @Override
    public void buildLeg(String leg) {
        Leg = leg;
    }

    @Override
    public void buildTail(String tail) {
        Tail = tail;
    }
}
