class Solution {
    ArrayList<Integer> search(String pat, String S) {
        ArrayList<Integer> indexes = new ArrayList<>();
        int index = 0;

        while (index != -1) {
            index = S.indexOf(pat, index);

            if (index != -1) {
                indexes.add(index + 1);
                index += 1; // Move one character ahead to avoid overlapping
            }
        }

        if (indexes.isEmpty()) {
            indexes.add(-1);
        }

        return indexes;
    }
}
