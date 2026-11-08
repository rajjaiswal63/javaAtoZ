package collectionframework.javaGenerics01;

public class genericClassWithObjectClass03 {
    public static void main(String[] args) {
        Box3 b2=new Box3("hello");


        Box3 b1=new Box3(10);
        Integer val=(Integer)b1.getVal();
        System.out.println(val+10);

    }
}
class Box3{
    private Object o;
    Box3(Object o){
        this.o=o;
    }
    public Object getVal(){
        return o;
    }
    public void setVal(Object o){
        this.o=o;
    }
}