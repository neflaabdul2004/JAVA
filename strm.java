import java.util.Scanner;

class strm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string1:");
        String s1 = sc.nextLine();

        System.out.println("Enter string2:");
        String s2 = sc.nextLine();

        System.out.println("Length of string1: " + s1.length());
        System.out.println("Length of string2: " + s2.length());

        String c = s1 + " " + s2;
        System.out.println("Concatenation: " + c);

        System.out.println("Enter the index:");
        int index = sc.nextInt();
        System.out.println(index + " : " + s1.charAt(index));
        sc.nextLine(); // consume newline

        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 compareTo s2: " + s1.compareTo(s2));

        System.out.println("Enter substring to find index:");
        String sub = sc.nextLine();
        System.out.println("Index: " + s1.indexOf(sub));

        System.out.println("Replace 'a' with 'x': " + s1.replace('a', 'x'));
        System.out.println("Uppercase: " + s1.toUpperCase());

        System.out.println("Enter integer value:");
        int num = sc.nextInt();
        String strr = String.valueOf(num);
        System.out.println("Integer: " + num);
        System.out.println("Converted String: " + strr);
        sc.nextLine();

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("Enter a string for buffer:");
        String sbInput = sc.nextLine();
        StringBuffer sb = new StringBuffer(sbInput);

        System.out.println("Enter append string:");
        String s = sc.nextLine();
        sb.append(" ").append(s);

        System.out.println("StringBuffer result: " + sb);
    }
}

