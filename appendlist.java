import java.util.ArrayList;
import java.util.List;

public class appendlist {

    public static void main(String[] args) {

        List<String> lis1 = new ArrayList<String>();
        lis1.add("a,c,d");

        List<String> lis2 = new ArrayList<String>();
        lis2.add("b,e,f");

        List<String> join = new ArrayList<String>();

        join.addAll(lis1);
        join.addAll(lis2);

        System.out.println("list1: " + lis1);
        System.out.println("list2: " + lis2);
        System.out.println("joined: " + join);

    }
}
