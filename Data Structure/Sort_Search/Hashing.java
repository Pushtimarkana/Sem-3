
import java.util.*;

class Hash {

    public void createHashTable(int array[]) {

        // Hashtable<Integer, Integer> hastable = new Hashtable<>();
        int hash[] = new int[20];

        for (int i = 0; i < array.length; i++) {
            int index = (array[i] % 18) + 2;
            if (hash[index] == 0 && index < 20) {
                hash[index] = array[i];
            } else {
                while (hash[index] != 0) {
                    index++;
                }
                hash[index] = array[i];
            }
        }

        //printing array
        System.out.println(" The Hash Table is :");
        for (int i = 0; i < hash.length; i++) {
            System.out.println("hash[" + i + "] : " + hash[i]);
        }
    }  
}

public class Hashing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 15;
        int array[] = new int[n];
        // int random=0;
        int max = 999999;
        int min = 100000;

        //take random elements from 100000 to 999999
        for (int i = 0; i < n; i++) {
            int ran = min + (int) (Math.random() * max);
            array[i] = ran;
        }
        Hash h = new Hash();
        h.createHashTable(array);
    }
}
