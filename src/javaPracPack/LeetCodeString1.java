package javaPracPack;

class LeetCodeString1 {

    public static void main(String[] args) {
        System.out.println(restoreString("codeleet",new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
    }
    /*public static int balancedStringSplit(String s) {
        int r, l,count;
        r=l=count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R') r++;
            else l++;

            if(r==l) {
                count++;
                r=l=0;
            }
        }
        return count;*/
    public static String restoreString(String s, int[] indices) {
        char[] ch = new char[s.length()];
        for(int i=0;i<s.length();i++){
            ch[indices[i]] = s.charAt(i);
        }
        return String.valueOf(ch);
    }

    }
