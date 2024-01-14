package Generics;
import java.util.ArrayList;
import  java.util.List;
import  java.lang.System;
import java.util.Objects;

public class Pair<FIRST, SECOND> {

    private FIRST first;
    private SECOND second;

    public  Pair(FIRST first, SECOND second)
    {
        this.first = first;
        this.second = second;

        Animal dog = new Dog();
    }

    public FIRST getFirst()
    {
        return  first;
    }

    public SECOND getSecond()
    {
        return  second;
    }

    public  void show()
    {
        Pair p1 = new Pair("1","2");
        Pair<String,Integer> p = new Pair<>("Heelo",50);

    }
}
