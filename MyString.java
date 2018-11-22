public class MyString implements CharSequence{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      data[i] = s.charAt(i);
    }
  }
  public char charAt(int index) {
    if (index <0 || index >= data.length) throw new IndexOutOfBoundsException();
    return data[index];
  }
  public int length() {
    return data.length;
  }
  public CharSequence subSequence(int start, int end) {
    CharSequence a;
    String b = "";
    if (start < 0 || end < 0 || end > length() || start > end) throw new IndexOutOfBoundsException();
    for (int i = start; i < end && i <length(); i++) {
      b += charAt(i);
    }
    a = b;
    return a;
  }
  public String toString() {
    String out = "";
    for (int i=0; i < this.length(); i++) {
      out += this.charAt(i);
    }
    return out;
  }
  public static void main(String[] args) {
    MyString a = new MyString("Hello");
    System.out.println(a.charAt(0)); //H
    System.out.println(a.length()); //5
    System.out.println(a.subSequence(0,2)); //He
    //System.out.println(a.charAt(-1)); // error
    //System.out.println(a.subSequence(-1,4)); //error
    }
  }
