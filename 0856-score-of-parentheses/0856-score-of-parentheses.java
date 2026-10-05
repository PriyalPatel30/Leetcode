class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int res = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(res);
                res = 0;
            }
            else{
                if(res == 0){
                    res = 1;
                }
                else res = res * 2;

                res = st.pop() + res;
            }
        }
        return res;
    }
}