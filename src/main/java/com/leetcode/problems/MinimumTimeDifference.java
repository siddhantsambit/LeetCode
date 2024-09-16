package com.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumTimeDifference {

    /*
    * LeetCode-539 MinimumTimeDifference
    */
    public static void main(String[] args) {
        MinimumTimeDifference minimumTimeDifference = new MinimumTimeDifference();
        List<String> timePoints = new ArrayList<>(Arrays.asList("23:59","00:00"));
        System.out.println(minimumTimeDifference.findMinDifference(timePoints));
        timePoints = Arrays.asList("00:00","23:59","00:00");
        System.out.println(minimumTimeDifference.findMinDifference(timePoints));

        timePoints = new ArrayList<>(Arrays.asList("23:59","00:00"));
        System.out.println(minimumTimeDifference.findMinDifferenceOptimized(timePoints));
        timePoints = Arrays.asList("00:00","23:59","00:00");
        System.out.println(minimumTimeDifference.findMinDifferenceOptimized(timePoints));

    }

    /*
     * Time Complexity : O(nlogn), n is size of input array
     * Space Complexity : O(n)
     */
    public int findMinDifference(List<String> timePoints) {
        List<Integer> timePointsInMins = new ArrayList<>();
        timePoints.forEach(timePoint -> {
            timePointsInMins.add(convertTimePointIntoMinutes(timePoint));
        });
        Collections.sort(timePointsInMins);
        int res = Integer.MAX_VALUE;
        for(int i=1; i < timePointsInMins.size(); i++) {
            res = Math.min(res, timePointsInMins.get(i) - timePointsInMins.get(i-1));
        }
        return Math.min(res, (24 * 60 - timePointsInMins.get(timePointsInMins.size()-1)
                + timePointsInMins.get(0)));
    }

    /*
     * Time Complexity : O(n), n is size of input array
     * Space Complexity : O(1440)
     */
    public int findMinDifferenceOptimized(List<String> timePoints) {
        boolean visited[] = new boolean[24*60];
        for(String timePoint : timePoints) {
            int min = convertTimePointIntoMinutes(timePoint);
            if (visited[min]) return 0;
            visited[min] = true;
        }
        int first = Integer.MAX_VALUE, prev = Integer.MAX_VALUE, res = Integer.MAX_VALUE;
        for(int i=0; i < 24 * 60; i++) {
            if(visited[i]) {
                if (first == Integer.MAX_VALUE) first = i;
                else res = Math.min(res, i - prev);
                prev = i;
            }
        }
        return Math.min(res, 24 * 60 - prev + first);
    }

    private int convertTimePointIntoMinutes(String timePoint) {
        int hour = Integer.parseInt(timePoint.substring(0,2));
        int minutes = Integer.parseInt(timePoint.substring(3));
        return (hour * 60 + minutes);
    }
}
