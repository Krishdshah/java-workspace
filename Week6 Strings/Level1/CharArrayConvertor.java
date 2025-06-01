import java.util.Scanner;
class CharArrayConverter {
public static char[] toCharArrayCustom(String s) {
char[] arr = new char[s.length()];
for (int i = 0; i < s.length(); i++) {
arr[i] = s.charAt(i);
}
return arr;
}
public static boolean compareCharArrays(char[] a, char[] b) {
if (a.length != b.length) return false;
for (int i = 0; i < a.length; i++) {
if (a[i] != b[i]) return false;
}
return true;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s = sc.next();
char[] a1 = toCharArrayCustom(s);
char[] a2 = s.toCharArray();
boolean isSame = compareCharArrays(a1, a2);
System.out.println("Same arrays: " + isSame);
}

    
}
