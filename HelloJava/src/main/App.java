package main;

public class App {
    public static void main(String[] args) throws Exception {

      byte a = 1;
      short b = 2;
      int c = 3;
      long d = 4l;
      System.out.println(a + b + c + d);

      float e = 5.0f;
      double f = 6.0d;
      System.out.println(e + f);

      char g = '@';
      String h = "Hello world";
      System.out.println(g);
      System.out.println(h);

      String escapeSequences = "\\t, \\n, \\r, \\s, \\', \\";
      System.out.println(escapeSequences);
    }
}
