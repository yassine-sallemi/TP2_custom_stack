// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CustomStack customStack = new CustomStack(3);

        customStack.addElement("One");
        customStack.addElement("Two");
        customStack.addElement(3);
        customStack.addElement(-54);

        System.out.println("Last element in the stack: " + customStack.lastInStack());
        customStack.stackStatus();


        customStack.removeElement();
        customStack.removeElement();
        customStack.stackStatus();

        customStack.removeElement();
        customStack.stackStatus();
    }
}