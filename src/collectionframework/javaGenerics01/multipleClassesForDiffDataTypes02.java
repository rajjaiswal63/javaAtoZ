package collectionframework.javaGenerics01;

public class multipleClassesForDiffDataTypes02 {
    public static void main(String[] args) {
        Box b=new Box(10);
        System.out.println(b.getVal());

        Box2 b2=new Box2("hello");
        System.out.println(b2.getVal());
    }
}
class Box{
    private int val;
    public Box(int val){
        this.val=val;
    }
    public int getVal(){
        return val;
    }
    public void setVal(int val){
        this.val=val;
    }
}

class Box2{
    private String val;
    public Box2(String val){
        this.val=val;
    }
    public String getVal(){
        return val;
    }
    public void setVal(String val){
        this.val=val;
    }
}
