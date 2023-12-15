package MathProjClasses;

public class OrderPair {
    
    //To hold values of any pairs
    private String a,b;

    //Initialize Pair with nothing
    public OrderPair(){
        this.a=new String("");
        this.b=new String("");
    }

    //Inititalize Pair with given Characters
    public OrderPair(char a,char b){
        this.a = new String(Character.toString(a));
        this.b = new String(Character.toString(b));
    }

    //Initialize Pair with Given String
    public OrderPair(String a,String b){
        this.a = new String(a);
        this.b = new String(b);
    }

    //Initialize Pair with Given Integers
    public OrderPair(int a,int b){
        this.a = new String(Integer.toString(a));
        this.b = new String(Integer.toString(b));
    }

    //Initialize Pair with Given doubles
    public OrderPair(double a,double b){
        this.a=new String(Double.toString(a));
        this.a=new String(Double.toString(a));
    }

    //To get Value of First Value OF the Pair
    public String getA(){return this.a;}

    //To get Value of Second Value of the Pair
    public String getB(){return this.b;}

    //To Check If two OrderPair are Equal or Not
    public boolean isEqual(OrderPair OP){
        return (this.getA().equals(OP.getA())&&this.getB().equals(OP.getB()));
    }

    //To check if Two OrderPair are Equal or not
    public static boolean isEqual(OrderPair OP0, OrderPair OP1){
        return ((OP0.getA().equals(OP1.getA()))&&(OP0.getB().equals(OP1.getB())));
    }

    //Overriding toString method to print the value of the OrderPair.
    @Override
    public String toString(){
        return "("+this.getA()+","+this.getB()+")";
    }
}
