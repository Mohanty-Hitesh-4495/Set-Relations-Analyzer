package MathProjClasses;

import java.util.ArrayList;

public class Set {

    private ArrayList<OrderPair> FullSet = new ArrayList<>();
    private ArrayList<String> eachEle = new ArrayList<>();

    public Set(){

    }
    public Set(OrderPair[] set){
        for(int i=0;i<set.length;i++){
            FullSet.add(set[i]);
        }
        generateDistinctEls();
    }
    public Set(ArrayList<OrderPair> set){
        for(int i=0;i<set.size();i++){
            FullSet.add(set.get(i));
        }
        generateDistinctEls();
    }

    private ArrayList<OrderPair> getOPStartsWith(String V){
        ArrayList<OrderPair> OPS = new ArrayList<>();
        for(int i=0;i<FullSet.size();i++){
            if(FullSet.get(i).getA().equals(V)){
                OPS.add(FullSet.get(i));
            }
        }
        return OPS;
    }
    private boolean isAvailable(OrderPair V){
        boolean check=false;
        for(int i=0;i<FullSet.size();i++){
            if(OrderPair.isEqual(FullSet.get(i), V)){
                check=true;
            }
        }
        return check;
    }
    public boolean checkSymmetry(){
        boolean checkAll = true;
        for(int i=0;i<FullSet.size();i++){
            if(!(isAvailable(FullSet.get(i))&&isAvailable(new OrderPair(FullSet.get(i).getB(), FullSet.get(i).getA())))){
                checkAll=false;
            }
        }
        return checkAll;
    }
    public boolean checkReflexive(){
        boolean checkAll=true;
        for(int i=0;i<eachEle.size();i++){
            
            if(!isAvailable(new OrderPair(eachEle.get(i),eachEle.get(i)))){
                checkAll=false;
                break;
            }
        }
        return checkAll;
    }
    public boolean checkTransitive(){
        boolean checkAll =true;
        for(int i=0;i<FullSet.size();i++){
            ArrayList<OrderPair> Found = getOPStartsWith(FullSet.get(i).getB());
            for(int j=0;j<Found.size();j++){
                if(!((isAvailable(FullSet.get(i))&&isAvailable(Found.get(j)))&&isAvailable(new OrderPair(FullSet.get(i).getA(), Found.get(j).getB())))){
                    checkAll=false;
                    break;
                }
            }
        }
        return checkAll;
    }
    public boolean checkEquivalence(){
        return (checkReflexive()&&checkSymmetry()&&checkTransitive());
    }

    private boolean isPresentInEachEle(String V){
        return eachEle.contains(V);
    }
    private void generateDistinctEls(){
        if(eachEle.size()==0){
            for(OrderPair X : FullSet){
                if(eachEle.size()==0){
                    if(X.getA().equals(X.getB())){
                        eachEle.add(X.getA());
                    }else{
                        eachEle.add(X.getA());
                        eachEle.add(X.getB());
                    }
                }else{
                    if(!isPresentInEachEle(X.getA())){
                        eachEle.add(X.getA());
                    }
                    if(!isPresentInEachEle(X.getB())){
                        eachEle.add(X.getB());
                    }
                }
            }
        }
    }
    public ArrayList<String> getDistinctEls(){
        if(eachEle.size()==0){
            generateDistinctEls();
        }
        return eachEle;
    }

    //toString() Override to print the values the Set Holds.
    @Override
    public String toString(){
        String myValues="";
        for(int i=0;i<FullSet.size();i++){
            myValues+=FullSet.get(i).toString();
            if(i!=FullSet.size()-1){
                myValues+=",";
            }
        }
        return "{"+myValues+"}";
    }
}
