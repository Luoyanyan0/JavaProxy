package sta.proxy;
import org.junit.Test;

public class ProxyTest {
    @Test
    public void test() {
        //目标对象
        UserDao target = new UserDao();

        //代理对象,把目标对象传给代理对象,建立代理关系
        sta.proxy.UserDaoProxy proxy = new sta.proxy.UserDaoProxy(target);

        proxy.save();//执行的是代理的方法
    }
}
