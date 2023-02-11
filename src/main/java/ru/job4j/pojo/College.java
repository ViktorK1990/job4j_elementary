package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setEnterDate("01.09.2010");
        student.setName("Petya");
        student.setGroup("IT-119");
        System.out.println(student.getName());
        System.out.println(student.getGroup());
        System.out.println(student.getEnterDate());
    }
}
