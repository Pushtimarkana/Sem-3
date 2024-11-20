import java.util.Scanner;

class Node {
    String code;
    int inStock;
    Node next;
    SubCategoryNode subCategoryHead;

    Node(String code, int inStock) {
        this.code = code;
        this.inStock = inStock;
        this.next = null;
        this.subCategoryHead = null;
    }
}

class SubCategoryNode {
    String code;
    int inStock;
    SubCategoryNode next;

    SubCategoryNode(String code, int inStock) {
        this.code = code;
        this.inStock = inStock;
        this.next = null;
    }
}

class LAB70 {
    private Node mainHead;

    public LAB70() {
        this.mainHead = null;
    }

    // Add stock function
    public void addStock(String code, int n) {
        String ab = code.substring(0, 2);
        String cd = code.substring(2, 4);
        String ef = code.substring(4, 6);

        Node mainNode = findOrCreateMainCategory(ab);
        SubCategoryNode subNode = findOrCreateSubCategory(mainNode, cd);
        findOrCreateSubSubCategory(subNode, ef, n);
    }

    // Find or create main category
    private Node findOrCreateMainCategory(String ab) {
        if (mainHead == null) {
            mainHead = new Node(ab, 0);
            mainHead.next = mainHead; // circular link
            return mainHead;
        }

        Node current = mainHead;
        do {
            if (current.code.equals(ab)) {
                return current;
            }
            current = current.next;
        } while (current != mainHead);

        Node newNode = new Node(ab, 0);
        Node tail = mainHead;
        while (tail.next != mainHead) {
            tail = tail.next;
        }
        tail.next = newNode;
        newNode.next = mainHead;
        return newNode;
    }

    // Find or create sub-category
    private SubCategoryNode findOrCreateSubCategory(Node mainNode, String cd) {
        if (mainNode.subCategoryHead == null) {
            mainNode.subCategoryHead = new SubCategoryNode(cd, 0);
            return mainNode.subCategoryHead;
        }

        SubCategoryNode current = mainNode.subCategoryHead;
        do {
            if (current.code.equals(cd)) {
                return current;
            }
            current = current.next;
        } while (current != mainNode.subCategoryHead);

        SubCategoryNode newNode = new SubCategoryNode(cd, 0);
        newNode.next = mainNode.subCategoryHead;
        current = mainNode.subCategoryHead;
        while (current.next != mainNode.subCategoryHead) {
            current = current.next;
        }
        current.next = newNode;
        return newNode;
    }

    // Find or create sub-sub-category
    private void findOrCreateSubSubCategory(SubCategoryNode subNode, String ef, int n) {
        if (n < 0 && subNode != null) {
            subNode.inStock += n;
            if (subNode.inStock <= 0) {
                removeSubCategory(subNode);
            }
            return;
        }

        subNode.inStock += n;
    }

    // Remove sub-category if stock is zero
    private void removeSubCategory(SubCategoryNode subNode) {
        // Handle removal logic here
        // This is a simplified example and may require additional logic
    }

    // Print inventory function
    public void printInventory() {
        if (mainHead == null) {
            return;
        }
        Node current = mainHead;
        do {
            System.out.println(current.code + " " + current.inStock);
            SubCategoryNode subCurrent = current.subCategoryHead;
            while (subCurrent != null) {
                System.out.println("  " + subCurrent.code + " " + subCurrent.inStock);
                subCurrent = subCurrent.next;
            }
            current = current.next;
        } while (current != mainHead);
    }

    // Search for stock levels
    public Integer search(String code) {
        // Implement search logic here
        // Return inStock value or null if not found
        return null; // Placeholder
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        LAB70 inventory = new LAB70();

        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String command = parts[0];

            switch (command) {
                case "I":
                    String code = parts[1];
                    int n = Integer.parseInt(parts[2]);
                    inventory.addStock(code, n);
                    break;
                case "P":
                    inventory.printInventory();
                    break;
                case "S":
                    // Search logic
                    break;
                case "M":
                    // Merge logic
                    break;
            }
        }

        scanner.close();
    }
}
