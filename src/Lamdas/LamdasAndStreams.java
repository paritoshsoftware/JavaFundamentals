package Lamdas;

public class LamdasAndStreams {


    public static  void main(String[] args)
    {
        new Thread(() ->  System.out.println("Hello World"+ Thread.currentThread().getName()));

        IMathOperation add = (a,b) ->  a + b;
        IMathOperation sub = (a,b) ->  a-b;
        IMathOperation mul = (a,b) ->  a*b;
        IMathOperation div = (a,b) ->  a/b;

        System.out.println(add.operate(8,2));
        System.out.println(sub.operate(8,2));
        System.out.println(mul.operate(8,2));
        System.out.println(div.operate(8,2));
    }

}
