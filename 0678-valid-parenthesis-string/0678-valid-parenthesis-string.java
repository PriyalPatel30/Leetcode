class Solution {
    public boolean checkValidString(String s) {
        int opened = 0;
        int stars = 0;
        
        //problematic )
        for(char ch : s.toCharArray()){
            if(ch == ')'){
                if(opened == 0){
                    if(stars == 0){
                        return false;
                    }
                    stars--;
                }
                else opened--;
            }

            else if(ch == '('){
                opened++;
            } 

            else if(ch == '*'){
                stars++;
            }
        }

        //problematic (
        int closed = 0;
        stars = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            char ch = s.charAt(i);

            if(ch == '('){
                if(closed == 0){
                    if(stars == 0){
                        return false;
                    }
                    stars--;
                } 
                else closed--;
            }

            else if(ch == ')'){
                closed++;
            }

            else if(ch == '*'){
                stars++;
            }
        }
        return true;
    }
}