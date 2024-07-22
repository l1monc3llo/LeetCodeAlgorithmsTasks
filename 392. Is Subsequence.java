class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s == null || s.isEmpty()){
            return true;
        }
        else if (t == null || t.isEmpty() || s.length() > t.length()){
            return false;
        }
        else if (s.length() == 1 && t.length() == 1){
            return s.equals(t);
        }
        int sPointer = 0;
        int tPointer = 0;
        while (tPointer < t.length()){
            if (t.charAt(tPointer) == s.charAt(sPointer)){
                ++sPointer;
                if (sPointer == s.length()){
                    return true;
                }
            }
            ++tPointer;

        }
        return false;
    }
}
