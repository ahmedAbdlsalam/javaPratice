package MergeStringsAlternately;
class Solution {
    public static String mergeAlternately(String word1, String word2) {
        char[] word11 = word1.toCharArray();
        char[] word22 = word2.toCharArray();

        int word1Len = word1.length();
        int word2Len = word2.length();

        System.out.println("length of word1: "+ word1Len);
        System.out.println("length of word2: "+ word2Len);
        StringBuilder mergedWordchar = new StringBuilder();
        
        int pointer1 = 0;
        int pointer2 = 0;

        boolean proceed1= true;
        boolean proceed2= true;
        int index=0;

        while(proceed1 || proceed2){

            if (pointer1 < word1Len){
                mergedWordchar.append(word11[pointer1]);
            } else{
                proceed1 = false;
                System.out.println("end for word1");
            }
            
            

            if (pointer2 < word2Len){
                mergedWordchar.append(word22[pointer2]);
            } else{
                proceed2 = false;
                System.out.println("end for word2");
            }
            

            index = index +1;
            pointer1 = pointer1 +1;
            pointer2 = pointer2 +1;

            System.out.println(index);
        }


        String mergedWord = mergedWordchar.toString();
        return mergedWord;
    }



    public static void main(String args[])
    {
        System.out.println(mergeAlternately("abcd","pq"));
    }
}