class Solution {
    public boolean checkRecord(String s) {
        if (s == null || s.isEmpty()){
            return false;
        }
        int a_count = 0;
        int l_count = 0;
        for (char c : s.toCharArray()){
            if (c == 'A'){
                ++a_count;
                if (a_count == 2){
                    return false;
                }
                l_count = 0;
            }
            else if (c == 'L'){
                if (l_count == 2){
                    return false;
                }
                ++l_count;
            }
            else {
                l_count = 0;
            }

        }
        return true;
    }
}
