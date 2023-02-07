package ru.job4j.oop;

public class JukeBox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2){
            System.out.println("Спокойной ночи");
        } else{
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        JukeBox petya = new JukeBox();
        petya.music(1);
        petya.music(2);
        petya.music(3);
    }
}