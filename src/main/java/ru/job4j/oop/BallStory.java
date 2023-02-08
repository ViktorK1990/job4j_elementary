package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball colobok = new Ball();
        Fox lisa = new Fox();
        Wolf volk = new Wolf();
        Hare zayac = new Hare();
        volk.tryEat(colobok);
        zayac.tryEat(colobok);
        lisa.tryEat(colobok);
    }
}
