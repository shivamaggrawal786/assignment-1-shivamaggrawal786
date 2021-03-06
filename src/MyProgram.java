public class MyProgram {
    Node top;

    public MyProgram() {
        this.top = null;
    }

    public void insert(Node newnode) {
        if (isempty()) {
            top = newnode;
        } else {
            Node temp = top;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void search(String fna) {
        Node temp = top;
        int flag = 0;
        while (temp != null) {
            if (temp.data.firstname.equals(fna)) {
                display(temp.data);
                flag = 1;
                break;
            }
            temp = temp.next;
        }
        if (flag == 0) {
            System.out.println("Not Found ");
        }
    }

    public void viewcontact() {
        Node temp = top;
        while (temp != null) {
            display(temp.data);
            temp = temp.next;
        }
    }

    public void delete(String name) {
        if (isempty()) {
            System.out.println("No Data Found...");
        } else if (top.data.getFirstname().equals(name)) {
            top = top.next;
        } else {
            Node temp = top;
            Node temp2 = null;
            while (temp != null) {
                System.out.println(temp.data.getFirstname());
                if (temp.data.getFirstname().equals(name)) {
                    temp2.next = temp.next;
                }
                temp2 = temp;
                temp = temp.next;
            }
        }

    }

    public boolean isempty() {
        return top == null;
    }

    public void display(Person per) {
        System.out.println("Contact Detail : ");
        System.out.println("First Name: " + per.getFirstname());
        System.out.println("Last Name: " + per.getLastname());
        System.out.println("Mob. Number : " + per.getNumber());
        System.out.println("Email Address : " + per.getEmail());
    }
}