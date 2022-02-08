package homework1;

public class RansomNote {

    /*
     * Question 7: Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.
     */

    public boolean ransomNoteConstructed(String ransomNote, String magazine){

        // if the note or magazine are empty
        if(ransomNote.length() == 0) return true;

        if (magazine.length() ==0 || ransomNote.length() > magazine.length()) return false;

        // Assuming string consists of ASCII characters only
        int[] set = new int[128];

        for (int i = 0; i < magazine.length(); i++) {
            set[magazine.charAt(i)]++;
        }

        for (int j = 0; j < ransomNote.length(); j++) {
            set[ransomNote.charAt(j)]--;
        }

        for (int k : set) {
            if (k < 0)
                return false;
        }
        return true;
    }

}
