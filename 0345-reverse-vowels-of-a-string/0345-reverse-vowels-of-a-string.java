class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i=0, j=s.length()-1;
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        while(i<j) {
            if(!set.contains(arr[i])){
                i++;
            } 

            if(!set.contains(arr[j])) {
                j--;
            }

            if(set.contains(arr[i]) && set.contains(arr[j])) {
                arr = swap(arr, i, j);
                i++;
                j--;
            }
        }
        return new String(arr);
    }

    public char[] swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}