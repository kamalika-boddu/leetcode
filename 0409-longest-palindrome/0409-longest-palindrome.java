class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map=new HashMap<>();
        int res=0;
        for(char ch:s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0)+1);

        
       
        if((map.get(ch) % 2)==0)
        {
            res +=2;
        }
    }
    return (s.length()==res) ? res : res +1;
}
}