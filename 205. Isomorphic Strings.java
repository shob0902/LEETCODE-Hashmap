class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Character> mst=new HashMap<>();
        HashMap<Character,Character> mts=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char st=s.charAt(i);
            char ts=t.charAt(i);
            if(mst.containsKey(st)){
                if(mst.get(st)!=ts) return false;
            }else{
                mst.put(st,ts);
            }
            if(mts.containsKey(ts)){
                if(mts.get(ts)!=st) return false;
            }else{
                mts.put(ts,st);
            }
        }
        return true;
    }
}
