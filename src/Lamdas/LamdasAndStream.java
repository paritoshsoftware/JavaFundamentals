package Lamdas;

import java.net.SocketOption;
import java.util.function.Function;

public class LamdasAndStream {
    public static void main(String[] args) {

        String value = "Hellow";
        String command =  "";

        switch (command){
            case "lower":
                execute(value, String::toUpperCase);
            break;
            case "upper":
                execute(value, String::toLowerCase);
                break;
            case "normal":
                execute(value,s->s.toLowerCase());
                break;
        }


    }


    public static String execute(String s, Function<String,String> func)
    {
       String val =  func.apply(s);
       System.out.println(val);
       return  val;
    }



}
