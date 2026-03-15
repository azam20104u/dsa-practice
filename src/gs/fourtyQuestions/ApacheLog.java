package gs.fourtyQuestions;

import java.util.HashMap;
import java.util.Map;

public class ApacheLog {
    /**
     * Given a log file, return IP address(es) which accesses the site most often.
     */

    public static String findTopIpaddress(String[] lines) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String st : lines) {
            String[] split = st.split("-");
            map.put(split[0], map.getOrDefault(split[0], 0) + 1);
        }
        String ip = "";
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                ip = entry.getKey();
            }
        }
        return ip.trim();
    }

    public static void main(String[] args) {

        String lines[] = new String[]{
                "10.0.0.1 - log entry 1 11",
                "10.0.0.1 - log entry 2 213",
                "10.0.0.2 - log entry 133132"};
        String result = findTopIpaddress(lines);
        System.out.println(result);
        if (result.equals("10.0.0.1")) {
            System.out.println("Test passed");

        } else {
            System.out.println("Test failed");

        }

    }
}
