class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(null==strs || strs.length==0)
        return new ArrayList();

        Map<String,List<String>> mapValue=new HashMap<>();
        for(String str:strs){
            int[] count=new int[26];
            for(char c:str.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int val:count){
                sb.append('#');
                sb.append(val);
            }
            String key=sb.toString();
            if(!mapValue.containsKey(key))
            mapValue.put(key, new ArrayList());

            mapValue.get(key).add(str);

        }
       return new ArrayList(mapValue.values());
    }
}
