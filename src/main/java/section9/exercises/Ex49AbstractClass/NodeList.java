package section9.exercises.Ex49AbstractClass;

public interface NodeList {
    abstract Object getRoot();
    abstract boolean addItem(ListItem newItem);
    abstract boolean removeItem(ListItem itemToRemove);
    abstract void traverse(ListItem root);
}
