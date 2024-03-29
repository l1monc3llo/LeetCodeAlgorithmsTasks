class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer, Integer> trustDelta = new HashMap<>();

        for (int i = 0; i < trust.length; ++i) {
            int trustee = trust[i][0];
            int trusted = trust[i][1];
            trustDelta.put(trustee, trustDelta.getOrDefault(trustee,0) + 1);
            trustDelta.put(trusted, trustDelta.getOrDefault(trusted,0) - 1);
        }

        for (int i = 1; i < n+1; ++i) {
            if (trustDelta.getOrDefault(i, 0) == -(n - 1)) {
                return i;
            }
        }

        return -1;
    }
}
