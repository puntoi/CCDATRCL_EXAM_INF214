
import java.util.Stack;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        // ARRAYS
        // ======================================================
        // 1. Create an array of characters of your SURNAME.
        char[] surname = { 'B', 'O', 'L', 'A', 'Ñ', 'O', 'S' };

        // 2. Print each character of your SURNAME on each line.
        for (int i = 0; i < surname.length; i++) {
            System.out.println(surname[i]);
        }

        // 3. Print the first character of your SURNAME.
        System.out.println("The First Character of my SURNAME is " + surname[0]);

        // 4. Print the last character of your SURNAME.
        System.out.println("The Last Character of my SURNAME is " +surname[6]);

        // 5. Print the character of your SURNAME in reverse order.
        for (int i = surname.length - 1; i >= 0; i--) {
            System.out.println(surname[i]);
        }

        // Linked List
        // ======================================================
        // 1. Create a Linked list of the last six numbers of your STUDENT NUMBER.

        LinkedList<String> StudentNumber = new LinkedList<>();

        StudentNumber.add("1");
        StudentNumber.add("0");
        StudentNumber.add("5");
        StudentNumber.add("5");
        StudentNumber.add("3");
        StudentNumber.add("9");

        System.out.println(StudentNumber);

        // 2. Add an asterisk (*) to the head/front of the Linked list.

        StudentNumber.addFirst("*");

        System.out.println(StudentNumber);

        // 3. Add an asterisk (*) to the tail/end of the Linked list.
        StudentNumber.addLast("*");

        // 4. Display the last character of the Linked list
        System.out.println(StudentNumber.get(7));

        // 5. Replace the last character of the Linked list with "!";
        StudentNumber.set(7, "!");

        // 6. Remove the first character of the Linked list
        StudentNumber.remove(0);

        // // 7. Display the LinkedList
        System.out.println(StudentNumber);

        // Stack
        // ======================================================
        // 1. Create a Stack of characters of your SURNAME.

        Stack<String> Surname = new Stack<>();

        Surname.push("B");
        Surname.push("O");
        Surname.push("L");
        Surname.push("A");
        Surname.push("Ñ");
        Surname.push("O");
        Surname.push("S");

        // 2. Print the Stack
        System.out.println(Surname);

        // 3. Add a "INF214" to the stack.
        Surname.push(" ");
        Surname.push("I");
        Surname.push("N");
        Surname.push("F");
        Surname.push("2");
        Surname.push("1");
        Surname.push("4");

        // 4. Print the Stack
        System.out.println(Surname);

        // 5. Remove "INF214" and Add "CCDATRCL-INF214".
        Surname.pop();
        Surname.pop();
        Surname.pop();
        Surname.pop();
        Surname.pop();

        Surname.push("C");
        Surname.push("C");
        Surname.push("D");
        Surname.push("A");
        Surname.push("T");
        Surname.push("R");
        Surname.push("C");
        Surname.push("L");
        Surname.push("-");
        Surname.push("I");
        Surname.push("N");
        Surname.push("F");
        Surname.push("2");
        Surname.push("1");
        Surname.push("4");
        

        // 6. Print the Stack
        System.out.println(Surname);
    }
}
