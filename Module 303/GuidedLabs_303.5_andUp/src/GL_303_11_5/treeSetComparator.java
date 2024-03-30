package GL_303_11_5;

import java.util.Comparator;
import java.util.TreeSet;

public class treeSetComparator implements Comparator<String> {


    @Override
    public int compare(String cities1, String cities2){
        int value = cities1.compareTo(cities2);
        //sort in reverse
        if (value > 0) {
            return -1;
        } else if(value < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        TreeSet<String> cities = new TreeSet<>(new treeSetComparator());
        cities.add("UAE");
        cities.add("Mumbai");
        cities.add("NewYork");
        cities.add("Hyderabad");
        cities.add("Karachi");
        cities.add("Xanadu");
        cities.add("Lahore");
        cities.add("Zagazig");
        cities.add("Yingkou");

        //print the contents of TreeSet
        System.out.println("TreeSet: " + cities);

    }
}
