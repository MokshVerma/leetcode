class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> dp = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        dp.add(new ArrayList<>());
        dp.get(0).add(triangle.get(0).get(0));
        
        for(int i=1; i<triangle.size(); i++) {
            dp.add(new ArrayList<>());
            for(int j = 0; j < triangle.get(i).size(); j++) {
                if(j == 0) {
                    dp.get(i).add(dp.get(i-1).get(0) + triangle.get(i).get(0));
                } else if (j == triangle.get(i).size()-1) {
                    dp.get(i).add(dp.get(i-1).get(j-1) + triangle.get(i).get(j));
                }else {
                    dp.get(i).add(Math.min(dp.get(i-1).get(j-1), dp.get(i-1).get(j)) + triangle.get(i).get(j));
                }
                
                if(i == triangle.size()-1){
                    min = Math.min(dp.get(i).get(j), min);
                }
            }
            // System.out.println(dp.get(i));
        }
        
        if(triangle.size() == 1) {
            min = triangle.get(0).get(0);
        }
        return min;
    }
}