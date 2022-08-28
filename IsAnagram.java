
    public static boolean checkAnagram(char[] char1, char[] char2) {
        if (char1.length != char2.length) {
            return false;
        }
        int array[] = new int[256];

        for (int i = 0; i < char1.length; i++) {
            array[char1[i]]++;
            array[char2[i]]--;
        }

        for (int i = 0; i < 256; i++) {
            if (array[i] != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s1 = "newtoN";
        String s2 = "noewtN";
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();
        boolean isAnagram = checkAnagram(char1, char2);
        System.out.println("Anagram=> :" + isAnagram);

    }
}
