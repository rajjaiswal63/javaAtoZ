package collectionframework.javaGenerics01;

public class genericDemo04 {
    public static void main(String[] args) {
        Box4<Integer> b1=new Box4<>(10);
        System.out.println(b1.getVal()+10);

        Box4<String> b2=new Box4<>("hello");
        System.out.println(b2.getVal()+10);
    }
}
class Box4<T>{
    private T value;

    Box4(T value){
        this.value=value;
    }

    public T getVal(){
        return value;
    }
    public void setVal(T value){
        this.value=value;
    }
}
