package Multithreaded;

public class NumberPrinter implements  Runnable {

    private int numberToPrint;

    public NumberPrinter(int printNumber)
    {
        this.numberToPrint = printNumber;
    }
    @Override
    public void run() {
        System.out.println("Printing Number: "+ numberToPrint +" From "+ Thread.currentThread().getName());

    }
}
