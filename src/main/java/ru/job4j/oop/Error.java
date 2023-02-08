package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;
    public Error(){

    }
    public Error(boolean active, int status, String message){
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void info(){
        System.out.println("active = " + active);
        System.out.println("status = " + status);
        System.out.println("message - " + message);
    }

    public static void main(String[] args) {
        Error phone = new Error();
        Error comp = new Error();
        Error playstation = new Error(true, 1, "I dont give a fuck");
        Error frost = new Error(false, 2, "I dont give a fuck too!");
        phone.info();
        comp.info();
        playstation.info();
        frost.info();
    }
}
