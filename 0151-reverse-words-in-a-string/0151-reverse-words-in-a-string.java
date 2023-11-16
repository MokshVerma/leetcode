    class Solution {
        public String reverseWords(String s) {
            List<String> list = new ArrayList<>();
            StringBuilder word = new StringBuilder();
            for(int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                if(c == ' ') {
                    if(!word.toString().equals("")) {
                        list.add(word.toString());
                    }
                    word = new StringBuilder();
                    continue;
                }

                word.append(c);
            }

            if(!word.toString().equals("")) {
                list.add(word.toString());
            }

            Collections.reverse(list);
            return String.join(" ", list);
        }
    }