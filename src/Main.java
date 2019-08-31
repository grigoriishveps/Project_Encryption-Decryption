
public class Main {
    public static void main(String[] args) {
        String s = "we found a treasure!";
        for(char x : s.toCharArray())
            if(x == '!' || x == ' ')
                System.out.print(x);
            else
                System.out.print((char)('z'-x+'a'));

    }
}
