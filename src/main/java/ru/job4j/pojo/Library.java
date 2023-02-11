package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        book1.setName("Clean Code");
        book2.setName("War and piece");
        book3.setName("Rain man");
        book4.setName("Rules for mind");
        book1.setPages(232);
        book2.setPages(333);
        book3.setPages(415);
        book4.setPages(764);
        Book[] bookArray = {
                book1,book2,book3,book4
        };
        for (int i = 0; i < bookArray.length; i++) {
            System.out.println(bookArray[i].getName() + " " + bookArray[i].getPages());

        }
        Book temp = bookArray[0];
        bookArray[0] = bookArray[3];
        bookArray[3] = temp;
        for (int i = 0; i < bookArray.length; i++) {
            System.out.println(bookArray[i].getName() + " " + bookArray[i].getPages());

        }
        for (int i = 0; i < bookArray.length; i++) {
            if("Clean Code".equals(bookArray[i].getName())){
                System.out.println(bookArray[i].getName());
            }

        }
    }
}
