package main;

import java.util.Random;

// import java.util.Scanner;
// import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) throws Exception {

    byte a = 1; // Initialization
    short b = 2;
    int c = 3;
    long d = 4_000_000_000l;
    System.out.println(a + b + c + d);

    float e = 5.0f;
    double f = 6.0d;
    System.out.println(e + f);

    char g = '@';
    String h = "Hello world";
    System.out.println(g);
    System.out.println(h);

    boolean i = true;
    boolean j = false;
    System.out.println(i);
    System.out.println(j);

    String escapeSequences = "\\t, \\n, \\r, \\s, \\', \\";
    System.out.println(escapeSequences);

    // try (Scanner prompt = new Scanner(System.in)) {
    // System.out.println("Enter any text: ");
    // String text = prompt.nextLine();
    // System.out.println("Response: " + text);
    // }

    int hero = 1;
    System.out.println(hero);
    hero++;
    System.out.println(hero);
    hero++;
    System.out.println(hero);
    hero--;
    System.out.println(hero);
    hero += 10;
    System.out.println(hero);
    hero -= 2;
    System.out.println(hero);
    System.out.println(hero * 2);
    System.out.println(hero % 2);

    double avenger = (double) 10 / 3;
    System.out.println(avenger);

    // String num = Integer.parseInt(JOptionPane.showInputDialog("Enter some
    // number"));
    // JOptionPane.showMessageDialog(null, num);

    int x = 10;
    int y = 110;
    System.out.println(Math.min(x, y));
    System.out.println(Math.max(x, y));
    System.out.println(Math.pow(a, b));
    System.out.println(Math.round(Math.sqrt(f)));

    Random random = new Random();
    int unknown = random.nextInt(100) + 1; // 0 to 100 with +1
    System.out.println(unknown);

    String sentence = "I am sentence";

    if (sentence.length() < 10) {
      System.out.println("Sentence less than 10");
    } else if (sentence.length() > 10) {
      System.out.println("Sentence greater than 10");
    } else {
      System.out.println("No sentence found");
    }

    String gender = "Male";

    switch (gender) {
      case "Female" -> {
        System.out.println("You are feminine");
      }
      case "Male", "Boy" -> {
        System.out.println("You are masculine");
      }
      default -> {
        System.out.println("There are only two genders");
      }
    }
  }
}
