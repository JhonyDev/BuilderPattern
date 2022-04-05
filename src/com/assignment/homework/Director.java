package com.assignment.homework;

import com.assignment.homework.builders.AnimalBuilder;

public class Director {
    public void makeKitten(AnimalBuilder builder) {
        builder.buildArm("Kitten Arm");
        builder.buildBody("Kitten Body");
        builder.buildLeg("Kitten Leg");
        builder.buildHead("Kitten Head");
        builder.buildTail("Kitten Tail");
    }

    public void makeMonkey(AnimalBuilder builder) {
        builder.buildArm("Monkey Arm");
        builder.buildBody("Monkey Body");
        builder.buildLeg("Monkey Leg");
        builder.buildHead("Monkey Head");
        builder.buildTail("Monkey Tail");
    }
}
