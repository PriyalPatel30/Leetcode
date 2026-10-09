class Solution {
    public int minInsertions(String s) {
        int ans = 0;
        int open = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                open++;
            }
            else{
                if(i < s.length() - 1 && s.charAt(i + 1) == ')'){
                    i++;
                }
                else{
                    ans++;
                }
                if(open == 0){
                    ans++;
                }
                else{
                    open--;
                }
            }
        }
        ans += 2 * open;
        return ans;
    }
}