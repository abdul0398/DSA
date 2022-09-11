package DSA.Array;
public class linearKeyboard {
    public static void main(String[] args) {
        keyboard("abcdefghijklmnopqrstuvwxyz", "hello");
    
    }
    public static void keyboard(String keyboard, String word) {
            int ans = 0;
            int[] arr = new int[26];
            for(int i = 0; i < keyboard.length(); i++){
                arr[keyboard.charAt(i) - 97] = i + 1;
            }
            
            for (int i = 0; i < word.length() - 1; i++) {
                ans = ans + Math.abs(arr[word.charAt( i + 1 ) - 97] - arr[word.charAt(i) - 97 ]);
            }
            System.out.println(ans);
    }
        
    }

 