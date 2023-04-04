package com.jamison.upcast;
class Book {
    public String getInfo() {
        return "[book]这是一本书";
    }
}

class MathBook extends Book {
    public String getInfo() {
        return "[MathBook]这是一本书";
    }
}

class ProgramBook extends Book {
    public String getInfo() {
        return "[ProgramBook]这是一本书";
    }
}


/**
 * @author jamison
 */
public class JamisonDemo {
    public static void main(String[] args) {
        fun(new MathBook());
        fun(new ProgramBook());
    }

    public static void fun(Book book) {
        System.out.println(book.getInfo());
    }


}