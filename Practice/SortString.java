package Practice;

import java.util.*;



public class SortString {
    public static void main(String[] args) {

        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()){
                    return 1;
                }
                return -1;
            }
        };

        List<String> st = new ArrayList<String>();

        st.add("Paras");
        st.add("Harikesh S");
        st.add("Pragya");
        st.add("Ayushman");
        st.add("AKA");

        Collections.sort(st, com);

        System.out.println(st);
    }
}
