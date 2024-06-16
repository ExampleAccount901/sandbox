import java.util.logging.Logger;

public class Loader {

    private static Logger logger = Logger.getLogger(Loader.class.getName());

    public static void main(String[] args) {
        DummyClass obj = new DummyClass();
        obj.setField1("value1");
        obj.setField2(1000);
        method1(obj);
    }

    public static void method1(DummyClass arg) {
        logger.info("method1 has been called.");
        System.out.println(arg);
        method2(arg);
    }

    public static void method2(DummyClass arg) {
        logger.info("method2 has been called.");
        System.out.println(arg);
        method3(arg);
    }

    public static void method3(DummyClass arg) {
        logger.info("method3 has been called.");
        System.out.println(arg);
    }
}













