class Solution {
    public int earliestTime(int[][] tasks) {
       int minFinish = Integer.MAX_VALUE;

        for (int i = 0; i < tasks.length; i++) {
            int start = tasks[i][0];
            int duration = tasks[i][1];
            int finish = start + duration;

            if (finish < minFinish) {
                minFinish = finish;
            }
        }

        return minFinish;
    }
}