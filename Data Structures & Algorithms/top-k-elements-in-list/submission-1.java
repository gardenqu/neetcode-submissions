class Solution {

    /*
    understand: I am given an integer array and am expected to find the K highest element(s) 
    in the array

    match: HashMap which keep track of frequency
    */
    public int[] topKFrequent(int[] nums, int k) {

        // find frequency of each element 
        Map<Integer,Integer> hold= new HashMap<>(); 

        for(int i: nums){
            hold.put(i, hold.getOrDefault(i, 0) + 1);
        }

        // an array with the frequencies in sorted order 
       ArrayList<Integer> freq = new ArrayList<>(hold.values());
       freq.sort(Comparator.reverseOrder());

       //  Find the target frequency threshold
        int targetFreq = freq.get(k - 1);

        // Collect the keys that meet or exceed this threshold
        int[] results = new int[k];
        int index = 0;

        for (Map.Entry<Integer, Integer> e : hold.entrySet()) {
            if (e.getValue() >= targetFreq) {
                results[index++] = e.getKey();
            }
            
            if (index == k) {
                break;
            }
        }

        return results; 


        
    }
}
