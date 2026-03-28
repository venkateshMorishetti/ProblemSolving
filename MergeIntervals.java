/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
Example 3:

Input: intervals = [[4,7],[1,4]]
Output: [[1,7]]
Explanation: Intervals [1,4] and [4,7] are considered overlapping.
 */


class Interval implements Comparable<Interval>{
    int start, end; 
    Interval(int s, int e){
        start = s;
        end = e;
    }
    
    @Override
    public int compareTo(Interval that){
        return this.start-that.start;
    }
}

class Solution {
    public int[][] merge(int[][] intervals) {
        Interval[] inter = new Interval[intervals.length];
        for(int i=0; i< intervals.length; i++){
            Interval in = new Interval(intervals[i][0], intervals[i][1]);
            inter[i] = in;
        }

        Arrays.sort(inter);

        ArrayList<Interval> resultList = new ArrayList();
        resultList.add(inter[0]);
        for(int i = 1; i < inter.length; i++){
            Interval lastInterval = resultList.get(resultList.size()-1);
            if(lastInterval.end >= inter[i].start){
                resultList.remove(resultList.size()-1);
                Interval newInterval = new Interval(lastInterval.start, Math.max(lastInterval.end, inter[i].end));
                resultList.add(newInterval);
            } else {
                resultList.add(inter[i]);
            }
        }
        int[][] resultArray = new int[resultList.size()][2];
        for(int k = 0; k < resultList.size(); k++){
            resultArray[k] = new int[]{resultList.get(k).start, resultList.get(k).end};
        }
        return resultArray;
    }
}