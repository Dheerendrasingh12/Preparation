class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> mapValue=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int value=target-nums[i];
            if(mapValue.containsKey(value)){
                return new int[] {mapValue.get(value),i};
            }        
            mapValue.put(nums[i],i);
            }
            return new int[]{};
    }
}
