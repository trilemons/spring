public class ExceptionTest {
    public static void main(String[] args) {
        try {
            method1();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void method1()throws Exception{
        try {
            method2();
        }catch (Exception e){
            throw new Exception("News Info from method1",e);

        }finally {
            System.out.println("finally");
        }

    }

    public static void method2()throws Exception{
        throw new Exception("New Info from method2");
    }
}
