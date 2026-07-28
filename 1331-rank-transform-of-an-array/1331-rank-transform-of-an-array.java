class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        HashMap<Integer, Integer> rank = new HashMap<>();
        int cRank = 1;
        for (int num:sorted) {
            if(!rank.containsKey(num)) {
                rank.put(num, cRank++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rank.get(arr[i]);
        }

        return arr;
    }
}