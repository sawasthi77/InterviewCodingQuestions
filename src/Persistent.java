public class Persistent {
    public static void main(String[] args) {
        String input = "olleH";
        StringBuffer output;

        // TODO write the code to reverse the string
        char ch[] = input.toCharArray();
        char out[] = new char[5];
        int len = ch.length;
        for(int i = 0; i < len ; i ++) {
            out[ len - 1 - i] = ch[i];
        }
       output = new StringBuffer(String.valueOf(out));
        System.out.println(output);
    }
}

