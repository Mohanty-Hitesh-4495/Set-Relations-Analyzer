package Set_Relation_Analyzer;
import java.util.ArrayList;
import java.io.*;

public class MathProjT0 {
    public static void main(String []  args)throws IOException{
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<OrderPair> OPs = new ArrayList<>();
        System.out.print("NUMBER OF RELATIONS ARE THERE : ");
        int N = Integer.parseInt(Br.readLine());
        System.out.println("Give Pairs Separated by comma(,):->");
        for(int i=0;i<N;i++){
            System.out.print("VALUE "+(i+1)+" : ");
            String V = Br.readLine();
            OPs.add(new OrderPair(V.split(",")[0], V.split(",")[1]));
        }
        Set mySet = new Set(OPs);
        System.out.println("YOUR GIVEN SET IS  : "+mySet);
        System.out.println("STATUS REFLEXIVE   : "+mySet.checkReflexive());
        System.out.println("STATUS SYMMETRIC   : "+mySet.checkSymmetry());
        System.out.println("STATUS TRANSITIVE  : "+mySet.checkTransitive());
        System.out.println("STATUS EQUIVALENCE : "+mySet.checkEquivalence());
    }
}
