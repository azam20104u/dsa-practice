package gs.fourtyQuestions;

import java.util.*;

class FindLowestPrice {

    static class Event {
        int x;
        int type; // 1 = start, -1 = end
        int val;

        Event(int x, int type, int val) {
            this.x = x;
            this.type = type;
            this.val = val;
        }
    }

    public static void main(String[] args) {

//        int[][] intervals = {
//                {1, 5, 20},
//                {3, 8, 15},
//                {7, 10, 8}
//        };
        // Expected:
        // [1, 3, 20]
        // [3, 7, 15]
        // [7, 10, 8]

//        int[][] intervals = {
//                {1, 3, 10},
//                {4, 6, 5}
//        };
        // Expected:
        // [1, 3, 10]
        // [4, 6, 5]

//        int[][] intervals = {
//                {1, 4, 10},
//                {2, 6, 10}
//        };

        // Expected:
        // [1, 6, 10]

        int[][] intervals = {
                {1, 10, 50},
                {3, 7, 20},
                {5, 6, 10}
        };

        // Expected:
        // [1, 2, 50]
        // [3, 4, 20]
        // [5, 6, 10]
        // [7, 7, 20]
        // [8, 10, 50]
        List<Event> events = new ArrayList<>();

        // Create events
        for (int[] interval : intervals) {
            int l = interval[0];
            int r = interval[1];
            int v = interval[2];

            events.add(new Event(l, 1, v));   // start
            events.add(new Event(r, -1, v));  // end
        }

        // Sort events
        Collections.sort(events, (a, b) -> {
            if (a.x != b.x) return a.x - b.x;
            return b.type - a.type; // start before end
        });

        // TreeMap works like multiset (keeps count + sorted)
        TreeMap<Integer, Integer> active = new TreeMap<>();

        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < events.size(); i++) {
            int x = events.get(i).x;

            // Process all events at same x
            while (i < events.size() && events.get(i).x == x) {
                Event e = events.get(i);

                if (e.type == 1) {
                    active.put(e.val, active.getOrDefault(e.val, 0) + 1);
                } else {
                    active.put(e.val, active.get(e.val) - 1);
                    if (active.get(e.val) == 0) {
                        active.remove(e.val);
                    }
                }
                i++;
            }
            i--;

            int nextX = (i + 1 < events.size()) ? events.get(i + 1).x : -1;

            if (nextX == -1 || active.isEmpty()) continue;

            int minVal = active.firstKey();

            // Merge with previous if same value
            if (!result.isEmpty() &&
                    result.get(result.size() - 1)[2] == minVal &&
                    result.get(result.size() - 1)[1] == x) {

                result.get(result.size() - 1)[1] = nextX;
            } else {
                result.add(new int[]{x, nextX, minVal});
            }
        }

        // Print result
        for (int[] r : result) {
            System.out.println(r[0] + " " + r[1] + " " + r[2]);
        }
    }
}
