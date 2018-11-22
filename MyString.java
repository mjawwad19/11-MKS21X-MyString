public class MyString implements CharSequence, Comparable<CharSequence>{
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
  public int compareTo(CharSequence o) throws ClassCastException {
    if (o == null) throw new NullPointerException();
    int sumData = 0;
    for (int i = 0; i < data.length; i++) {
      sumData += data[i];
    }
    for (int i = 0; i < o.length(); i++) {
      sumData -= o.charAt(i);
    }
    return sumData;
  }

/*  public static void main(String[] args) {
      MyString first = new MyString("Hello");
      MyString second = new MyString("Hello world");
      MyString third = new MyString("Hi");
      MyString fourth = new MyString("");
      MyString fifth = new MyString("Hillo");
      String s = null;
      System.out.println(first.charAt(0)); //H
      System.out.println(first.length()); //5
      System.out.println(first.subSequence(0,2)); //He
      System.out.println("Hello".substring(0,2)); //He FOR CHECKING PURPOSES
      /*System.out.println(first.subSequence(0,6)); //error
      System.out.println("Hello".substring(0,6)); //error FOR CHECKING PURPOSES
      System.out.println(first.charAt(-1)); // IndexOutOfBoundsException
      System.out.println(first.subSequence(-1,4)); //IndexOutOfBoundsException
      System.out.println(first.compareTo(second)); // some negative integer
      System.out.println(second.compareTo(first)); // opposite of previous sign
      System.out.println(first.compareTo(third)); // some positive integer
      System.out.println(first.compareTo(first)); // 0
      System.out.println(first.compareTo(fourth));// VERY
      //System.out.println(first.compareTo(s)); //NullPointerException
      System.out.println(first.compareTo(fifth)); // some negative integer
    }*/
  }
