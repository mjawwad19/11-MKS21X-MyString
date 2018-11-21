public class MyString implements CharSequence{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      data[i] = s.charAt(i);
    }
  }
  public char charAt(int index) {
    return data[index];
  }
  public int length() {
    return data.length;
  }
  public CharSequence subSequence(int start, int end) {
    CharSequence a;
    String b = "";
    for (int i = start; i < end && i <length(); i++) {
      b += charAt(i);
    }
    a = b;
    return a;
  }
  public String toString() {
    String ans = "";
    for (int i=0; i < this.length(); i++) {
      ans+= this.charAt(i);
    }
    return ans;
  }
  public static void main(String[] args) {
      MyString a = new MyString("Hello");
    System.out.println(a.charAt(0));
    System.out.println(a.length());
    System.out.println(a.subSequence(0,2));
    }
  }
