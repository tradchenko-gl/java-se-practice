package buchalka.section9.exercises.Ex49AbstractClass;

public class MyLinkedList implements NodeList{
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (newItem != null) {
            if (this.root == null) {
                this.root = newItem;
                return true;
            }

            ListItem currentItem = this.root;
            while (currentItem != null) {
                int compareResult = currentItem.compareTo(newItem);
                if(compareResult < 0) {
                    if(currentItem.next() != null) {
                        currentItem = currentItem.next();
                    } else {
                        currentItem.setNext(newItem);
                        newItem.setPrevious(currentItem);
                        return true;
                    }
                } else if(compareResult > 0) {
                    if(currentItem.previous() != null) {
                        currentItem.previous().setNext(newItem);
                        newItem.setPrevious(currentItem.previous());
                        newItem.setNext(currentItem);
                        currentItem.setPrevious(newItem);
                    } else {
                        newItem.setNext(this.root);
                        this.root.setPrevious(newItem);
                        this.root = newItem;
                    }
                    return true;
                } else {
                    //equal
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem itemToRemove) {
        if(itemToRemove != null) {
            ListItem currentItem = this.root;
            while (currentItem != null) {
                int compareResult = currentItem.compareTo(itemToRemove);
                if (compareResult == 0) {
                    if(currentItem == this.root) {
                        this.root = currentItem.next();
                    } else {
                        currentItem.previous().setNext(currentItem.next());
                        if(currentItem.next() != null) {
                            currentItem.next().setPrevious(currentItem.previous());
                        }
                    } return true;
                } else if (compareResult < 0) {
                    currentItem = currentItem.next();
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
