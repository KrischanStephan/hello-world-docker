package org.example;
import static java.lang.String.format;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Jetzt gehts wirklich los");
        int count =0;
        while (true) {
            Thread.sleep(2*1000);

            System.out.println(format("App running ... %d", count++));
        }
    }
}
