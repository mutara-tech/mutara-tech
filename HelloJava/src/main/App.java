package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

// import java.util.Scanner;
// import javax.swing.JOptionPane;

public class App {
  /**
   * @param args
   * @throws Exception
   */
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

    String molly = "Molly";
    String dave = "Dave";
    boolean condition1 = molly.length() > 10 && dave.length() > 10;
    System.out.println(condition1);
    boolean condition2 = molly.length() > 10 || dave.length() > 10;
    System.out.println(condition2);
    boolean condition3 = !(molly.length() > 10 && dave.length() > 10);
    System.out.println(condition3);

    int bro = 0;
    while (bro < 3) {
      System.out.println("Bro");
      bro++;
    }

    for (int start = 0; start < 3;) {
      System.out.println("Dude");
      start++; // Could be placed within the parenthesis as well
      // Make sure to check out nested loops as well
    }

    int[] array = new int[3]; // Same as int[] array = {1, 2, 3};
    array[0] = 0; // Count starts at index 0
    array[0] = 1; // Overriding the first element from 0 to 1
    array[1] = 2;
    array[2] = 3;
    System.out.println(Arrays.toString(array));

    String[][] fruits = { { "Apple", "Mango", "Pineapple" }, { "Peach", "Jackfruit", "Watermelon" } };
    System.out.println(Arrays.deepToString(fruits));
    fruits[1][1] = "Grapes";
    System.out.println(Arrays.deepToString(fruits));

    // Some string methods
    String stringMethods = "String  methods";
    System.out.println(Arrays.toString(stringMethods.split("")));
    System.out.println(stringMethods.toLowerCase());
    System.out.println(stringMethods.toUpperCase());

    // Wrapper classes
    // Boolean
    // Integer
    // Double
    // Float
    // String

    // ArrayList: Only store reference datatypes. NB: Primitive DTs are store
    // through wrapper classes
    ArrayList<String> food = new ArrayList<String>();
    food.add("Pizza");
    food.add("Hamburger");
    food.add("Hotdog");
    System.out.println(food.size());
    System.out.println(food);

    // Iterate through indexes
    for (int valueAt = 0; valueAt < food.size(); valueAt++) {
      System.out.println(food.get(valueAt));
    }

    // Some methods
    food.set(2, "Apple pie");
    // remove
    // clear

    // For each
    for (String foods : food) {
      System.out.println(foods);
    }

    ArrayList<String> vegetableList = new ArrayList<String>();
    vegetableList.add("Lettuce");
    vegetableList.add("Cucumber");
    vegetableList.add("Spinach");
    System.out.println(vegetableList);

    ArrayList<String> diaryProducts = new ArrayList<String>();
    diaryProducts.add("Milk");
    diaryProducts.add("Eggs");
    diaryProducts.add("Meat");
    System.out.println(diaryProducts);

    // 2d ArrayList
    ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
    groceryList.add(vegetableList);
    groceryList.add(diaryProducts);
    groceryList.add(food);
    System.out.println(groceryList);

    // Get elements in 2d arraylist
    System.out.println(groceryList.get(0).get(0));
    System.out.println(groceryList.get(2).get(0));

    // Methods
    // Pass arguments to method parameters if any
    // Assign return value to sayHello variable
    String helloUser = hello("William");
    System.out.println(helloUser);

    // Printf
    // Format specifiers,%s,%d,%b,%c,%f(float or double),15(width, space)
    System.out.printf("%,15.2f\n", 10_000.000);

    // Final keyword
    final double PI = 3.14d;
    System.out.printf("Variables declared final, like PI: %.2f, cannot be changed\n", PI);
  }

  // Methods
  // Return types, void(returns no value), String(returns string), ...
  // Return value is String
  // Check out overloaded methods
  static String hello(String name) {
    return "Hello " + name; // return null as default
  }
}
