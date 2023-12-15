package MathProjClasses;

public class OrderPair {
    
    private String a,b;

    public OrderPair(){
        this.a=new String("");
        this.b=new String("");
    }
    public OrderPair(char a,char b){
        this.a = new String(Character.toString(a));
        this.b = new String(Character.toString(b));
    }
    public OrderPair(String a,String b){
        this.a = new String(a);
        this.b = new String(b);
    }
    public OrderPair(int a,int b){
        this.a = new String(Integer.toString(a));
        this.b = new String(Integer.toString(b));
    }
    public OrderPair(double a,double b){
        this.a=new String(Double.toString(a));
        this.a=new String(Double.toString(a));
    }
    public String getA(){return this.a;}
    public String getB(){return this.b;}
    public boolean isEqual(OrderPair OP){
        return (this.getA().equals(OP.getA())&&this.getB().equals(OP.getB()));
    }
    public static boolean isEqual(OrderPair OP0, OrderPair OP1){
        return ((OP0.getA().equals(OP1.getA()))&&(OP0.getB().equals(OP1.getB())));
    }
    @Override
    public String toString(){
        return "("+this.getA()+","+this.getB()+")";
    }
}
