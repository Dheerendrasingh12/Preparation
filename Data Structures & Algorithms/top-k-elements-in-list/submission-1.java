class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map=new HashMap();
        for(int num:nums)
        map.put(num, map.getOrDefault(num, 0)+1);

        List<Integer>[] bucket=new ArrayList[nums.length+1];
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            if(bucket[value]==null)
            bucket[value]=new ArrayList();
            bucket[value].add(key);
        }
        int result[]=new int[k];
        int index=0;

        for(int i=nums.length;i>=1&& index<k;i--){
            if(bucket[i]==null)
            continue;
            for(int num:bucket[i]){
                result[index++]=num;
                if(index==k)
                break;
            }
        }
        return result;
        
    }
}
