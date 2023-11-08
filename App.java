package Test.Reder;
//Разработать программу, в которой создается массив объектов данного класса.

import java.util.Arrays;

public class App {
    Book[] arayAppReader;

    public App(Book[] arayAppReader) {
        this.arayAppReader = arayAppReader;
    }

    public Book[] getArayAppReader() {
        return arayAppReader;
    }

    @Override
    public String toString() {
        return "App{" +
                "arayAppReader=" + Arrays.toString(arayAppReader) +
                '}';
    }
}