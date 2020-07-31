package id.test.springboottesting.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import id.test.springboottesting.model.User;



/**
 * @author e1077326
 *
 */
@ExtendWith(MockitoExtension.class)
class UserServiceTest {

   

    @InjectMocks
    private UserService userService;

    

	/*
	 * @Test void shouldReturnFindAll() { List<User> datas = new ArrayList();
	 * datas.add(new User(1L, "ten@mail.com","teten","teten")); datas.add(new
	 * User(2L, "ten@mail.com","teten","teten")); datas.add(new User(3L,
	 * "ten@mail.com","teten","teten"));
	 * 
	 * Mockito.when(userService.findAllUsers()).thenReturn(datas);
	 * 
	 * List<User> expected = userService.findAllUsers();
	 * 
	 * assertEquals(expected, datas); }
	 */


}