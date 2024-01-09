package threads;

import Multithreaded.NumberPrinter;

import java.util.Timer;

public class Client1 {

    public static void main(String[] args) {
       
        for(int i = 0; i<1000; i++)
        {
            NumberPrinter numberPrinterObj = new NumberPrinter(i);

            Thread thread = new Thread(numberPrinterObj);

            thread.start();
        }

    }
}
