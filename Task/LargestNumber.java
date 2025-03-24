package Task;

import java.util.*;

public class LargestNumber {

        static boolean comp (String s1, String s2){
            return((s1 + s2).compareTo(s2 + s1) > 0);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // List<String> str = Arrays.asList("5","9", "3", "30", "34");

            List<String> str = new ArrayList<>();

            System.out.println("Enter Number : ");
            String n = sc.next();
            while(!n.equals("-1")){
                str.add(n);
                System.out.println("Enter Number : ");
                n = sc.next();
            }

//            Iterator<String> iterator = str.iterator();
//
//            while(iterator.hasNext()){
//                String value = iterator.next();
//                System.out.println(value);
//            }

            Collections.sort(str, (s1, s2) -> comp(s1,s2) ? -1 : 1);

            str.forEach(s -> System.out.print(s));
        }
    }
