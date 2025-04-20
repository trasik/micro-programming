package problems;

public class MergeStringsAlternately {

    private String word1;
    private String word2;

    public MergeStringsAlternately(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }

    public String solve() {
        StringBuilder sb = new StringBuilder();
        //Pointer to make sure all characters are met, even if one word is larger than the other
        int wordPointer = 0;

        //Loop through using the pointer checking the length of both words
        while(wordPointer < word1.length() || wordPointer < word2.length()) {
            //Start with the first word and append the current character
            if(wordPointer < word1.length()) sb.append(word1.charAt(wordPointer));
            //Next with the second word, append the current character
            if(wordPointer < word2.length()) sb.append(word2.charAt(wordPointer));
            //Increase the counter
            wordPointer++;
        }

        //Return the new merged word
        return sb.toString();
    }

    @Override
    public String toString() {
        return "MergeStringsAlternately{" +
                "word1='" + word1 + '\'' +
                ", word2='" + word2 + '\'' +
                '}';
    }
}
