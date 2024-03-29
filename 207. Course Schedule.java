class Solution {
    Boolean ans=true;
    List<List<Integer>> g = new ArrayList<>();
    List<String> visited;
    public void dfs(int v){
        visited.set(v, "grey");
        for (Integer neighbor : g.get(v)) {
            if (visited.get(neighbor)=="grey") {
                ans = false;
            }
            if (visited.get(neighbor)=="white") {
                dfs(neighbor);
            }
        }
        visited.set(v,"black");
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for (int i = 0; i < numCourses; ++i) {
            g.add(new ArrayList<>());
        }
        visited = new ArrayList<>(Collections.nCopies(numCourses, "white"));
        for (int i=0; i<prerequisites.length; ++i){
            g.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        for (int i=0; i<numCourses; ++i){
            if (visited.get(i)=="white") {
            dfs(i);
            }
        }
        return ans;
    }
}
