package id.test.springboottesting.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
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

	@Test
	void shouldReturnFindAll() {
		List<User> datas = new ArrayList<User>();
		datas.add(new User(1L, "ten@mail.com", "teten", "teten"));
		datas.add(new User(2L, "ten@mail.com", "teten", "teten"));
		datas.add(new User(3L, "ten@mail.com", "teten", "teten"));

		// Mockito.when(userService.findAllUsers()).thenReturn(datas);

		List<User> expected = userService.findAllUsers();

		assertEquals(expected.size(), datas.size());
	}

	@Test
	void findUserById() {
		final Long id = 1L;
		//final User user = new User(1L, "ten@mail.com", "teten", "teten");

		//given(userRepository.findById(id)).willReturn(Optional.of(user));

		final User expected = userService.findUserById(id);

		assertThat(expected).isNotNull();

	}

}