package com.ferreira.costa.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.ferreira.costa.demo.entity.Status;
import com.ferreira.costa.demo.entity.User;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.properties")
public class UserServiceTest {

	SimpleDateFormat sdf = new SimpleDateFormat("HH:mmZ");

	@Autowired
	UserService userService;

	@Test
	public void findAll() {
		// Act
		List<User> user = userService.findAll();

		// Print
		user.forEach(System.out::println);
	}

	@Test
	public void findById() {
		// Arrange
		Long id = 1L;

		// Act
		User user = userService.findById(id);

		// Print
		System.out.println(user);
	}

	@Test
	public void save() throws ParseException {
		// Arrange
		User user = new User();
		 user.setId(null);
	     user.setName("Joao");
	     user.setCpf("07466704001");
	     user.setEmail("joao@gmail.com");
	     user.setTelefone("98888-4040");
	     user.setEmail("joao@gmail.com");
	     user.setDataNascimento(new Date());
	     user.setDataAlteracao(new Date());
	     user.setDataInclusao(new Date());
	     user.setLogin("joao-Depp");
	     user.setStatus(Status.ATIVO);
	     user.setSenha("202020");

		// Act
		user = userService.save(user);

		// Print
		System.out.println(user);
	}

	@Test
	public void update() throws ParseException {
		// Arrange
		User user = new User();
		 user.setId(null);
	        user.setName("Joao");
	        user.setCpf("07466704001");
	        user.setEmail("joao@gmail.com");
	        user.setTelefone("98888-4040");
	        user.setEmail("joao@gmail.com");
	        user.setDataNascimento(new Date());
	        user.setDataAlteracao(new Date());
	        user.setDataInclusao(new Date());
	        user.setLogin("joao-Depp");
	        user.setStatus(Status.ATIVO);
	        user.setSenha("202020");
		// Act
		user = userService.update(user);

		// Print
		System.out.println(user);
	}

	@Test
	public void deleteById() {
		// Arrange
		Long id = 1L;

		// Act
		userService.deleteById(id);
	}

	@Test
	public void deleteAll() {
		// Act
		userService.deleteAll();
	}
}


