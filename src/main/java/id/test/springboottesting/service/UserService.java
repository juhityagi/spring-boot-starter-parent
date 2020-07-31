package id.test.springboottesting.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashMap;
import id.test.springboottesting.model.User;


/**
 * @author e1077326
 *
 */
@Service
@Transactional
public class UserService {

    

    
    public List<User> findAllUsers() {
       ArrayList <User> datas = new ArrayList<User>();
       
       datas.add(new User(1L, "ten@mail.com","teten","teten"));
       datas.add(new User(2L, "ten@mail.com","teten","teten"));
       datas.add(new User(3L, "ten@mail.com","teten","teten"));
       return datas;
    }

    public User findUserById(Long id) {
        return new User(1L, "a@a.com", "ABC", "abc");
    }

    
}
