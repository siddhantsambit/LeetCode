package com.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumTimeDifference {

    /*
    * LeetCode-539 MinimumTimeDifference
    * Time Complexity : O(nlogn), n is size of input array
    * Space Complexity : O(n)
    * Later will look for optimize solution
    */
    public static void main(String[] args) {
        MinimumTimeDifference minimumTimeDifference = new MinimumTimeDifference();
        List<String> timePoints = new ArrayList<>(Arrays.asList("23:59","00:00"));
        System.out.println(minimumTimeDifference.findMinDifference(timePoints));
        timePoints = Arrays.asList("00:00","23:59","00:00");
        System.out.println(minimumTimeDifference.findMinDifference(timePoints));

    }

    public int findMinDifference(List<String> timePoints) {
        List<Integer> timePointsInMins = new ArrayList<>();
        timePoints.forEach(timePoint -> {
            int hour = Integer.parseInt(timePoint.substring(0,2));
            int minutes = Integer.parseInt(timePoint.substring(3));
            timePointsInMins.add(hour * 60 + minutes);
        });
        Collections.sort(timePointsInMins);
        int res = Integer.MAX_VALUE;
        for(int i=1; i < timePointsInMins.size(); i++) {
            res = Math.min(res, timePointsInMins.get(i) - timePointsInMins.get(i-1));
        }
        return Math.min(res, (24 * 60 - timePointsInMins.get(timePointsInMins.size()-1)
                + timePointsInMins.get(0)));
    }
}
