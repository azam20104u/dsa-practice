package gs.fourtyQuestions;

import java.util.*;

import java.util.*;

class Interval {
    int start, end, price;

    Interval(int s, int e, int p) {
        start = s;
        end = e;
        price = p;
    }

    @Override
    public String toString() {
        return "[" + start + ", " + end + ", " + price + "]";
    }
}

public class FindLessPrice {

    public static List<Interval> getLowestPrices(List<Interval> input) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        //find the min and max intervals
        for (Interval i : input) {
            min = Math.min(min, i.start);
            max = Math.max(max, i.end);
        }
        int[] prices = new int[max + 1];
        Arrays.fill(prices, Integer.MAX_VALUE);

        // fill lowest price
        for (Interval i : input) {
            for (int t = i.start; t <= i.end; t++) {
                prices[t] = Math.min(prices[t], i.price);
            }
        }
        //build the result
        List<Interval> res = new ArrayList<>();
        int start = min;
        int currPrice = prices[min];

        for (int t = min; t <= max; t++) {
            if (prices[t] != currPrice) {
                res.add(new Interval(start, t, currPrice));
                start = t;
                currPrice = prices[t];
            }
        }
        res.add(new Interval(start, max, currPrice));
        return res;
    }

    public static void main(String[] args) {

        List<Interval> input = Arrays.asList(
                new Interval(1, 5, 20),
                new Interval(3, 8, 15),
                new Interval(7, 10, 8)
        );

        List<Interval> result = getLowestPrices(input);

        System.out.println("Output:");
        result.forEach(System.out::println);

        // Expected:
        // [1, 3, 20]
        // [3, 7, 15]
        // [7, 10, 8]

        // ✅ Test Case 2 (no overlap)
        List<Interval> input2 = Arrays.asList(
                new Interval(1, 3, 10),
                new Interval(4, 6, 5)
        );

        System.out.println("\nTest 2 Output:");
        getLowestPrices(input2).forEach(System.out::println);

        // Expected:
        // [1, 3, 10]
        // [4, 6, 5]

        // ✅ Test Case 3 (same price overlapping)
        List<Interval> input3 = Arrays.asList(
                new Interval(1, 4, 10),
                new Interval(2, 6, 10)
        );

        System.out.println("\nTest 3 Output:");
        getLowestPrices(input3).forEach(System.out::println);

        // Expected:
        // [1, 6, 10]

        // ✅ Test Case 4 (nested intervals)
        List<Interval> input4 = Arrays.asList(
                new Interval(1, 10, 50),
                new Interval(3, 7, 20),
                new Interval(5, 6, 10)
        );

        System.out.println("\nTest 4 Output:");
        getLowestPrices(input4).forEach(System.out::println);

        // Expected:
        // [1, 2, 50]
        // [3, 4, 20]
        // [5, 6, 10]
        // [7, 7, 20]
        // [8, 10, 50]
    }
}
