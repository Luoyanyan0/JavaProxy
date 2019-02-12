package cglib.proxy;

// 真实对象
public class UserDao {
    public void save() {
        System.out.println("----已经保存数据!----");
    }
}
