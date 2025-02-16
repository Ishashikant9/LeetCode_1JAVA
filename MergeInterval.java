import java.util.*;

public class MergeInterval {
    public static void main(String[] args) {
        // Sample input: list of intervals
        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        // Creating an instance of Solution class
        Solution solution = new Solution();
        int[][] mergedIntervals = solution.merge(intervals);

        // Printing the merged intervals
        System.out.println("Merged Intervals:");
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}

// Your existing Solution class with the merge method
class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort intervals by the first value in ascending order
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        List<int[]> result = new ArrayList<>();

        int[] newInterval = intervals[0];
        result.add(newInterval);

        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1]) {
                // Merge overlapping intervals
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                // If no overlap, move to the next interval
                newInterval = interval;
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}

