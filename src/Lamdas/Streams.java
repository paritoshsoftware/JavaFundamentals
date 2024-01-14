package Lamdas;

import threadpool.Client;

import java.util.List;

public class Streams {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1,2,3,4,5,6,7,9,10);

        integers.stream().filter(Streams::isEven).forEach(System.out::println);
    }

    private static boolean isEven(int a)
    {
        return a % 2==0;
    }

}
