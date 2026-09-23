class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<arr.length;i++){
                 m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        int max=-1;
        for(int k:m.keySet()){
            if(k==m.get(k)){
            if(m.get(k)> max){
                   max=m.get(k);
            }
            }
        }
        return max;
    }
}