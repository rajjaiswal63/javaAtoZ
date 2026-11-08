package collectionframework.javaGenerics01;

public class casting01 {
    public static void main(String[] args) {
        //upCasting
        String s= "Hello";
        Object obj=s;
        System.out.println(obj);

        //downCasting
        Object obj2="Hello ji";
        String s2 = (String)obj;
        System.out.println(s2);

        //run time error -- class cast exception
        Object obj3=10;
        String s3=(String)obj3;
        System.out.println(s3);
    }
}
