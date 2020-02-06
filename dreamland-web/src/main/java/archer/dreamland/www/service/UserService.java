package archer.dreamland.www.service;

import archer.dreamland.www.entity.User;

public interface UserService {
    int regist(User user);
    User login(String email, String password);
    User findByEmail(String email);
    User findByPhone(String phone);
    User findById(Long Id);
    void deleteByEmail(String email);
    void update(User user);
}
