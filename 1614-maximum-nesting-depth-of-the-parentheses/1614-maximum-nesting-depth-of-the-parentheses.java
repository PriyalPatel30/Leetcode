class Solution {
    public int maxDepth(String s) {
        int depth = 0, max = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                depth++;
                max = Math.max(max, depth);
            }
            else if(ch == ')'){
                depth--;
            }
        }
        return max;
    }
}