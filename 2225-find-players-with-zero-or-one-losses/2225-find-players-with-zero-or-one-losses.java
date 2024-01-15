class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> matchCount = new HashMap<>();
        Map<Integer, Integer> winCount = new HashMap<>();
        
        for(int i=0; i<matches.length; i++) {
            int winner = matches[i][0];
            int loser = matches[i][1];
            
            matchCount.put(winner, matchCount.getOrDefault(winner, 0) + 1);   
            matchCount.put(loser, matchCount.getOrDefault(loser, 0) + 1); 
            winCount.put(winner, winCount.getOrDefault(winner, 0) + 1);
        }
        
        List<List<Integer>> list = Arrays.asList(new ArrayList<>(), new ArrayList<>());
        
        for(Map.Entry<Integer, Integer> matchEntry: matchCount.entrySet()) {
            int key = matchEntry.getKey();
            if(matchEntry.getValue() == winCount.getOrDefault(key, 0)) {
                list.get(0).add(key);
            } else if (matchEntry.getValue() -1 == winCount.getOrDefault(key, 0)) {
                list.get(1).add(key);
            }
        }
        
        Collections.sort(list.get(0));
        Collections.sort(list.get(1));
        return list;
    }
}