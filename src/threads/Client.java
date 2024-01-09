package threads;

import Multithreaded.HelloWorldPrinter;

public class Client {
    public static void main(String[] args) {
      for(int i = 1; i < 10; i++)
      {
          HelloWorldPrinter helloWorldPrinterObj = new HelloWorldPrinter();
          Thread thread = new Thread(helloWorldPrinterObj);
          System.out.println("**************************************" + Thread.currentThread().getName());
          System.out.println("1 " + Thread.currentThread().getName());
          System.out.println("2 " + Thread.currentThread().getName());

          thread.start();

          System.out.println("3 " + Thread.currentThread().getName());
          System.out.println("4 " + Thread.currentThread().getName());
          System.out.println("**************************************" + Thread.currentThread().getName());
      }


    }
}
