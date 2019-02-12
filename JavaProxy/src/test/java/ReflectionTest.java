import org.junit.Test;
import sun.reflect.CallerSensitive;
import sun.reflect.Reflection;

public class ReflectionTest {
    public static void main(String[] args) {
        /*0：返回sun.reflect.Reflection
         1:返回当前类的Class对象
         2：返回调用该方法的Class对象
         */
        a();
        System.out.println(Reflection.getCallerClass());
    }

    public static void a(){
        System.out.println("123");
    }
}
