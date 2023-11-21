class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
        Set<Integer> set2 = new HashSet<>(Arrays.stream(nums2).boxed().collect(Collectors.toList()));

        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());

        for(int i=0; i<nums1.length; i++) {
            if(!set2.contains(nums1[i])) {
                list.get(0).add(nums1[i]);
                set2.add(nums1[i]);
            }
        }

        list.add(new ArrayList<>());

        for(int i=0; i<nums2.length; i++) {
            if(!set1.contains(nums2[i])) {
                list.get(1).add(nums2[i]);
                set1.add(nums2[i]);
            }
        }
        return list;
    }
}