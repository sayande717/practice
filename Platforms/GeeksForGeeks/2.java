// Q. https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1

/* Algorithms: Sliding Window (2-pointer) & Hashmap
 * Let two pointers be p1 & p2.
 * Approach:
 * We put the first character and it's frequency in the hashmap.
 * Check the size of the map, i.e. if it has become > K. If it has, we need to decrease the window size.
 * If frequency of an element becomes zero, we remove the element.
 * Target is to make the size of the window = K. If it has, we store it (p2-p1)+1 in a variable 'max'.
 */

class Solution {
    public int longestkSubstr(String s, int k) {
        int p1 = 0, p2 = 0; // Pointers
        HashMap<Character,Integer> store = new HashMap<>();
        int max = -1;
        while(p2 < s.length()) {
            // store.getOrDefault(s.charAt(p2),0): Return the frequency of the character provided, otherwise return the default value (0).
            store.put(s.charAt(p2),store.getOrDefault(s.charAt(p2),0)+1); // Put the character:frequency pair in the hashmap.
            
            if(store.size() == k) {
                max = Math.max(max,(p2-p1)+1);  // (p2-p1)+1 = Window size
            }
            
            while(store.size() > k) {
                store.put(s.charAt(p1),store.get(s.charAt(p1))-1); // Reduce the frequency of the character.
                
                if(store.get(s.charAt(p1)) == 0) { 
                    store.remove(s.charAt(p1));                   // If the frequency of a character is zero, remove the character.
                }
                p1++;
            }
            p2++;
        }
        return max;
    }
}