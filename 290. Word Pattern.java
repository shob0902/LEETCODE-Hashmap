class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] w=s.split(" ");
        if(pattern.length()!=w.length){
            return false;
        }
        Map<Character, String> ch=new HashMap<>();
        Map<String, Character> st=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String wd=w[i];
            if(ch.containsKey(c)){
                if(!ch.get(c).equals(wd)){
                    return false;
                }
            }
            else{
                if(st.containsKey(wd)){
                    return false;
                }
                ch.put(c,wd);
                st.put(wd,c);
            }
        }
        return true;
    }
}
