package com.assignment.homework.products;

public abstract class Animal {
    String Arm;
    String body;
    String head;
    String Leg;
    String Tail;

    public Animal(String arm, String body, String head, String leg, String tail) {
        Arm = arm;
        this.body = body;
        this.head = head;
        Leg = leg;
        Tail = tail;
    }

    public abstract void eat();

    public abstract void showMe();

    public String getArm() {
        return Arm;
    }

    public void setArm(String arm) {
        Arm = arm;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getLeg() {
        return Leg;
    }

    public void setLeg(String leg) {
        Leg = leg;
    }

    public String getTail() {
        return Tail;
    }

    public void setTail(String tail) {
        Tail = tail;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Arm='" + Arm + '\'' +
                ", body='" + body + '\'' +
                ", head='" + head + '\'' +
                ", Leg='" + Leg + '\'' +
                ", Tail='" + Tail + '\'' +
                '}';
    }
}
