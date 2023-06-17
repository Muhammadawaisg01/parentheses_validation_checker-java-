

static boolean isParenthesesValid(String str) {

        ArrayList<Character> chr_array_1 = new ArrayList<>();
        ArrayList<Character> chr_array_2 = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chr_array_1.add(str.charAt(i));
        }
        for (int i = 0; i < chr_array_1.size(); i++) {

            if (chr_array_1.get(i) == '(' || chr_array_1.get(i) == '[' || chr_array_1.get(i) == '{') {

                chr_array_2.add(chr_array_1.get(i));
            } else if (chr_array_1.get(i) == ')' || chr_array_1.get(i) == ']' || chr_array_1.get(i) == '}') {
                if (i == 0) {
                    return false;
                }
                Character chr1 = chr_array_2.get(chr_array_2.size() - 1);
                Character chr2 = chr_array_1.get(i);
                if (chr1 == '(' && chr2 == ')') {
                    chr_array_2.remove(chr_array_2.size() - 1);
                } else if (chr1 == '[' && chr2 == ']') {
                    chr_array_2.remove(chr_array_2.size() - 1);
                } else if (chr1 == '{' && chr2 == '}') {
                    chr_array_2.remove(chr_array_2.size() - 1);
                } else {
                    return false;
                }
            }

        }
        if (chr_array_2.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
