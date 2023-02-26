package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle[] vehicles = {bus, plane, train};
        for (Vehicle i: vehicles) {
            i.move();
        }
    }
}
