package threadpool;

import Multithreaded.NumberPrinter;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService executorService  =  Executors.newFixedThreadPool(10);
        for(int i = 0; i<1000; i++)
        {
            NumberPrinter numberPrinterObj = new NumberPrinter(i);
            if(i==50)
            {
                System.out.println("Wait");
            }
            executorService.submit(numberPrinterObj);
        }
    }
}
