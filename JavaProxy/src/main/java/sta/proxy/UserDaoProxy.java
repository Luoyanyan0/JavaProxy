package sta.proxy;
// 代理对象
public class UserDaoProxy implements IUserDao {
    //接收保存目标对象
    private IUserDao target;
    public UserDaoProxy(IUserDao target){
        this.target=target;
    }

    public void save() {
        // 对目标方法进行增强
        System.out.println("静态代理功能执行前...");
        target.save();//执行目标对象的方法
        System.out.println("静态代理功能执行后...");
    }
}
