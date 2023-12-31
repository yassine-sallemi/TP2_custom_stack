import java.util.ArrayList;

public class CustomStack {
    private int maxSize;
    private ArrayList<Object> stack;
    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new ArrayList<>();
    }

    public void addElement(Object element) {
        if (stack.size() < maxSize) {
            stack.add(element);
            System.out.println("Added " + element + " to the stack.");
        } else {
            System.out.println("Stack is full. Cannot add element.");
        }
    }

    public void removeElement() {
        if (!stackIsEmpty()) {
            stack.remove(stack.size() - 1);
            System.out.println("Removed from the stack.");
        } else {
            System.out.println("Stack is empty. Cannot remove element.");
        }
    }

    public Object lastInStack() {
        if (!stackIsEmpty()) {
            return stack.get(stack.size() - 1);
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }

    public boolean stackIsEmpty() {
        return stack.isEmpty();
    }

    public boolean stackIsFull() {
        return stack.size() == maxSize;
    }

    public void stackStatus(){
        if (stackIsEmpty())
            System.out.println("Stack is empty.");
        else if (stackIsFull())
            System.out.println("Stack is full.");
        else
            System.out.println("There are " + stack.size() + " elements in the stack.");
    }
}
