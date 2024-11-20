import java.util.*;

class Music {
    Node first;
    Node last;
    Node currentSong;
    int length = 0;

    class Node {
        String data;
        Node lptr;
        Node rptr;

        public Node(String data) {
            this.data = data;
            this.lptr = null;
            this.rptr = null;
        }
    }

    public void ins_At_First(String data) {
        Node n = new Node(data);
        length++;
        if (first == null) {
            n.lptr = null;
            n.rptr = null;
            first = n;
            last = n;
            currentSong = first;
            return;
        } else {
            first.lptr = n;
            n.rptr = first;
            first = n;
            currentSong = first;
        }
    }

    // repeat song or current song played
    public void current_Song() {
        if (first == null) {
            System.out.println("There is no playList:");
            return;
        }
        System.out.println("Current song is:" + currentSong.data);
    }

    // previous song in playlist
    public void previous_Song() {
        if (first == null) {
            System.out.println("There is no playList:");
            return;
        }
        if (currentSong == first) {
            System.out.println("Previous song is not available");
            return;
        }
        currentSong = currentSong.lptr;
        System.out.println("previous:" + currentSong.data);

    }

    // next song in play list
    public void next_Song() {
        if (first == null) {
            System.out.println("There is no playList:");
            return;
        }
        if (currentSong == last) {
            System.out.println("Next song is not available:");
            return;
        }
        currentSong = currentSong.rptr;
        System.out.println("Next song:" + currentSong.data);
    }

    // delete current song
    public void delete_Current() {
        if (first == null) {
            System.out.println("No song in playlist:");
            return;
        }
        if (currentSong == first) {
            first = first.rptr;
            first.lptr = null;
            currentSong = first;
            System.out.println("current:" + currentSong.data);
            return;
        }
        if (currentSong == last) {
            last = last.lptr;
            last.rptr = null;
            currentSong = last;
            System.out.println("current2:" + currentSong.data);
        } else {
            currentSong.rptr.lptr = currentSong.lptr;
            currentSong.lptr.rptr = currentSong.rptr;
            currentSong = currentSong.rptr;
            System.out.println("current3:" + currentSong.data);
        }
    }

    // delete specific song
    public void delete(String data) {
        if (first == null) {
            System.out.println("under flow:");
            return;
        }
        if (data.equals(first.data)) {
            first = first.rptr;
            first.lptr = null;
            return;
        }
        Node save = first.rptr;
        Node pre = first;
        while (save != null && !data.equals(save.data)) {
            pre = save;
            save = save.rptr;
        }
        if (save == null) {
            System.out.println("Node not fount");
        } else {
            if (save == last) {
                pre.rptr = save.rptr;
                last = pre;
                return;
            }
            pre.rptr = save.rptr;
            save.rptr.lptr = pre;
        }
    }

    public void display() {
        int i = 0;
        Node save = first;
        while (save != null) {
            System.out.print("n[" + i + "]:" + save.data + " , ");
            save = save.rptr;
            i++;
        }
        System.out.println();
    }
}

public class Music_Player_75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Music m = new Music();
        m.ins_At_First("abc");
        m.ins_At_First("def");
        m.ins_At_First("pqr");
        m.ins_At_First("hij");
        m.ins_At_First("xyz");
        m.display();
        // m.previous_Song();
        m.next_Song();
        // m.current_Song();
        // // m.previous_Song();
        m.next_Song();
        // m.next_Song();
        m.delete_Current();
        m.delete("abc");
        m.display();
    }
}