class Solution {
    public int minAddToMakeValid(String s) {
        int ans = 0;
        Stack<Character> st = new Stack<>();

        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch);
                count++;
            }
            else{
                if(count > 0){
                    st.pop();
                    count--;
                }
                else ans++;
            }
        }
        return ans + count;
    }
}