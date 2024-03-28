class Solution {
    public int findJudge(int n, int[][] trust) {
        int[][] inmatrix = new int[n][2]; // Assuming each person is represented by an index from 0 to n-1
        int[][] outmatrix = new int[n][2]; // Assuming each person is represented by an index from 0 to n-1

        for (int i = 0; i < trust.length; ++i) {
            int trustingPerson = trust[i][0] - 1; // Adjust index to start from 0
            int trustedPerson = trust[i][1] - 1; // Adjust index to start from 0
            inmatrix[trustedPerson][1]++;
            outmatrix[trustingPerson][0]++;
        }

        for (int i = 0; i < n; ++i) {
            if (inmatrix[i][1] == n - 1 && outmatrix[i][0] == 0) {
                return i + 1; // Adjust index to start from 1
            }
        }

        return -1; // No judge found
    }
}
