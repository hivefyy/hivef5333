package dao;

import entity.MyUser;

import java.util.List;

public interface UserDao {
    public boolean login(String name,String password);
    public boolean register(MyUser user);
    /**返回用户信息集合*/
    public List<MyUser> getUserAll();
    /**根据id删除
     * @param id*/
    public boolean delete(String id);
    public boolean update(String name, String id);
}
