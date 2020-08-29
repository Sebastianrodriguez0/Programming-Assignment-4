import java.util.Scanner;

public class Test {

      public static void main(String[] args) {

            Set set = new Set();
            String choice = "";
            Scanner scan = new Scanner(System.in);

            while (true) {

                  System.out.print("Enter command: ");
                  choice = scan.nextLine();
                  String terms[] = choice.split(" ");

                  if (terms.length == 2) {

                        if (terms[0].trim().equalsIgnoreCase("add")) {
                              try {
                                    int number = Integer.parseInt(terms[1]);
                                    set.add(number);
                                    System.out.println(set);
                              } catch (Exception e) {
                                    System.out.println("Invalid input, try again!");
                              }
                        } else if (terms[0].trim().equalsIgnoreCase("del")) {
                              try {
                                    int number = Integer.parseInt(terms[1]);
                                    set.delete(number);
                                    System.out.println(set);
                              } catch (Exception e) {
                                    System.out.println("Invalid input, try again!");
                              }
                        } else if (terms[0].trim().equalsIgnoreCase("exists")) {
                              try {
                                    int number = Integer.parseInt(terms[1]);
                                    System.out.println(set.exists(number));
                              } catch (Exception e) {
                                    System.out.println("Invalid input, try again!");
                              }
                        } else {
                              System.out.println("Invalid command!");
                        }
                  } else {
                        System.out.println("Usage should be <command><space><number>");
                  }
            }
      }
}