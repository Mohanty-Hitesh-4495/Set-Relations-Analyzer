package Set_Relation_Analyzer;
import java.util.ArrayList;
import java.util.Scanner;

// creating a Pair class...
class Pair {
    int first, second;
    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
// relation class...
class Relation {
    // check for AntiSymmetric Relation...
    boolean checkAntiSymmetric(ArrayList<Pair> R) {
        if (R.isEmpty())
            return true;
        for (Pair i : R) {
            int one = i.first;
            int two = i.second;
            if (one != two)
            {
                if (R.contains(new Pair(two, one)))
                    return false;
            }
        }
        return true;
    }
}
public class AntiSymmetric {
    public static void main(String[] args) {
        ArrayList<Pair> R = new ArrayList<>();
        // set R{(1,1),(1,2),(2,3),(3,4)}
        R.add(new Pair(1, 1));
        R.add(new Pair(1, 2));
        R.add(new Pair(2, 3));
        R.add(new Pair(3, 4));

        Relation obj = new Relation();

        if (obj.checkAntiSymmetric(R)) {
            System.out.println("Anti-Symmetric Relation");
        }
        else {
            System.out.println("Not a Anti-Symmetric Relation");
        }
    }
}
