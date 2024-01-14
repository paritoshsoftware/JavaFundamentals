package Multithreaded;
import  java.util.List;
import  java.lang.Integer;
import  java.util.concurrent.Callable;

public class MergeSorter implements Callable<List<Integer>> {

    private  List<Integer> listToSort;
    public  MergeSorter(List<Integer> sortList)
    { this.listToSort = sortList;
    }
    @Override
    public List<Integer> call() throws Exception {


        return null;
    }
}
