class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        Map<Integer, Integer> word1Map = new HashMap<>();
        // Map<Integer, Integer> word2Map = new HashMap<>();

        for(int i=0; i<word1.length(); i++) {
            char c = word1.charAt(i);
            arr1[c - 'a']++;
        }

        for(int i=0; i<word2.length(); i++) {
            char c = word2.charAt(i);
            arr2[c - 'a']++;
        }

        int sum = 0;

        for(int i=0; i<26; i++) {
            if(arr1[i] > 0 && arr2[i] > 0) {
                word1Map.put(arr1[i], word1Map.getOrDefault(arr1[i], 0) + 1);
            } else if(arr1[i] != 0 || arr2[i] != 0){
                return false;
            }
        }

        for(int i=0; i<26; i++) {
            if(word1Map.containsKey(arr2[i])) {
                word1Map.put(arr2[i], word1Map.get(arr2[i]) - 1);
                if(word1Map.get(arr2[i]) == 0) {
                    word1Map.remove(arr2[i]);
                }
            }
        }

        return sum == 0 && word1Map.isEmpty();
    }
}