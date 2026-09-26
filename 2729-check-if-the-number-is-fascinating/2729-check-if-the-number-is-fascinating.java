class Solution {
    public boolean isFascinating(int n) {
        String s = "" + n + (n * 2) + (n * 3);
        if (s.length() != 9) {
            return false; 
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (c == '0') {
                return false; 
            }
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) > 1) {
                return false;
            } 
        }
        for (char c = '1'; c <= '9'; c++) {
            if (!map.containsKey(c)) {
                return false;
            }
        }
        return true;
    }
}