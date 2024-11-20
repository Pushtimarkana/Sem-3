import java.util.*;

class Linked_List {
    Node first;
    Node first2;

    class Node {
        int coff;
        int power;
        Node link;

        public Node(int coff, int power) {
            this.coff = coff;
            this.power = power;
            this.link = null;
        }
    }

    // insert for polynomial first
    public void ins_At_First(int coff, int power) {
        Node n = new Node(coff, power);
        if (first == null) {
            first = n;
            return;
        }
        n.link = first;
        first = n;
    }

    // insert for polynomial second
    public void ins_At_First2(int coff, int power) {
        Node n = new Node(coff, power);
        if (first2 == null) {
            first2 = n;
            return;
        }
        n.link = first2;
        first2 = n;
    }

    // addition for polynomialfirst and second
    public void addition() {
        Node save = first;
        Node save2 = first2;
        int coff3 = 0;
        while (save != null && save2 != null) {
            if (save.power == save2.power) {
                coff3 = save.coff + save2.coff;
                System.out.print(coff3 + "x^" + save.power);
                save = save.link;
                save2 = save2.link;
            }
            System.out.print(" ");
            if (save != null && save2 != null) {
                if (save.power < save2.power) {
                    coff3 = save2.coff;
                    System.out.print(coff3 + "x^" + save2.power);
                    save2 = save2.link;
                } else if (save.power > save2.power) {
                    coff3 = save.coff;
                    System.out.print(coff3 + "x^" + save.power);
                    save = save.link;
                }
                System.out.print(" ");
            }
        }

        if (save != null) {
            coff3 = save.coff;
            System.out.println(coff3 + "x^" + save.power);
            save = save.link;
        } else if (save2 != null) {
            coff3 = save2.coff;
            System.out.println(coff3 + "x^" + save2.power);
            save2 = save2.link;
        }
        System.out.println(" ");
    }

    // display polynomial first
    public void display() {
        Node temp = first;
        int i = 0;
        while (temp != null) {
            System.out.print("n[" + i + "]=" + temp.coff + "x^" + temp.power);
            temp = temp.link;
            i++;
            System.out.print("  ");
        }
        System.out.println();
    }

    // display polynomial second
    public void display2() {
        Node temp = first2;
        int i = 0;
        while (temp != null) {
            System.out.print("n[" + i + "]=" + temp.coff + "x^" + temp.power);
            temp = temp.link;
            i++;
            System.out.print("  ");
        }
        System.out.println();
    }
}

public class Polynomial_Addition_76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linked_List l1 = new Linked_List();
        int flag = 1;
        int power = 0;
        int cof = 0;
        while (true) {
            System.out.println("1:Enter in First List   2:Enter in Second List");
            System.out.println("3:Calculate             4:Exit");
            System.out.print("Enter choice: ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.print("enter power");
                    power = sc.nextInt();
                    System.out.print("enter power's cofficient:");
                    cof = sc.nextInt();
                    l1.ins_At_First(cof, power);
                    break;
                case 2:
                    System.out.print("enter power");
                    power = sc.nextInt();
                    System.out.print("enter power's cofficient:");
                    cof = sc.nextInt();
                    l1.ins_At_First2(cof, power);
                    break;
                case 3:
                    l1.display();
                    l1.display2();
                    l1.addition();
                    break;
                case 4:
                    System.exit(0);
            }
        }

        // l1.ins_At_First(5, -1);
        // l1.ins_At_First(10, 0);
        // // l1.ins_At_First(20, 1);
        // l1.ins_At_First(30, 2);
        // l1.ins_At_First(40, 3);
        // // l2.ins_At_First2(50, -2);
        // // l2.ins_At_First2(100, 0);
        // // l2.ins_At_First2(200, 1);
        // l2.ins_At_First2(300, 2);
        // l2.ins_At_First2(400, 3);
        // l1.display();
        // l2.display2();
        // l1.addition(l2.first2);

    }
}
