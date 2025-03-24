package Practice;

import java.util.HashMap;
import java.util.Map;

public class HashCode {

    public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<>();

        map.put("Paras", "Ronit");
        map.put("Ronit", "Hema");
        try{
            int hash1 = map.get("Paras").hashCode();
            int hash2 = map.get("Rohit").hashCode();
            System.out.println(hash1 + " " + hash2);
        }
        catch(Exception e) {
//            e.printStackTrace();
//            System.out.println("Something Went wrong");
              throw e;
        }

        if(map.get("Paras").equals(map.get("Rohit"))){
            System.out.println("Same");
        }
        else {
            System.out.println("Not Same");
        }

    }
}
