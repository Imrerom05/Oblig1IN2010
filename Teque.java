import java.util.ArrayList;




public class Teque {
    ArrayList<Integer> right = new ArrayList<>();
    ArrayList<Integer> left = new ArrayList<>();

    
    public void push_back(int x) {
        right.add(x);
        fix();
    }

    public void push_front(int x) {
        left.add(0, x);
        fix();
    }

    public void push_middle(int x) {
        if (left.size() <= right.size()) {
            left.add(x);
        } else {
            right.add(0, x);
        }
    }

    public int get(int i) {
        if (i >= left.size()){
            return right.get(i - left.size());
        } else {
            return left.get(i);
        }
    }

    public void fix() {
        if (left.size() > right.size() + 1) {
            right.add(0, left.get(left.size() - 1));
            left.remove(left.size() - 1);
        } else if (right.size() > left.size()) {
            left.add(right.get(0));
            right.remove(0);
        }
    }
}
