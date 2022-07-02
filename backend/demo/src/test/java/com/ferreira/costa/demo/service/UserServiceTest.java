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
	     user.setCpf("62133610065");
	     user.setEmail("joao@gmail.com");
	     user.setTelefone("98888-4040");
	     user.setEmail("joao@gmail.com");
	     user.setDataNascimento(new Date());
	     user.setDataAlteracao(new Date());
	     user.setDataInclusao(new Date());
	     user.setLogin("joao-Depp");
	     user.setStatus(Status.INATIVO);
	     user.setSenha("202021");
	     
	     User user1 = new User();
	     user.setId(null);
	     user.setName("Aelson");
	     user.setCpf("45167830028");
	     user.setTelefone("98888-0000");
	     user.setEmail("Aelson@gmail.com");
	     user.setDataNascimento(new Date());
	     user.setDataAlteracao(new Date());
	     user.setDataInclusao(new Date());
	     user.setLogin("aelson-Depp");
	     user.setStatus(Status.INATIVO);
	     user.setSenha("202022");
	     
	     User user2 = new User();
	     user.setId(null);
	     user.setName("Amanda");
	     user.setCpf("72059560055");
	     user.setTelefone("98888-3030");
	     user.setEmail("Amanda@gmail.com");
	     user.setDataNascimento(new Date());
	     user.setDataAlteracao(new Date());
	     user.setDataInclusao(new Date());
	     user.setLogin("amanda-Depp");
	     user.setStatus(Status.ATIVO);
	     user.setSenha("202023");
	     
	     User user3 = new User();
	     user.setId(null);
	     user.setName("Beny");
	     user.setCpf("92090507039");
	     user.setTelefone("98888-5050");
	     user.setEmail("beny@gmail.com");
	     user.setDataNascimento(new Date());
	     user.setDataAlteracao(new Date());
	     user.setDataInclusao(new Date());
	     user.setLogin("beny-Depp");
	     user.setStatus(Status.ATIVO);
	     user.setSenha("202024");
	     
	     User user4 = new User();
	     user.setId(null);
	     user.setName("Paizão");
	     user.setCpf("16760650085");
	     user.setTelefone("98888-8080");
	     user.setEmail("paizao@gmail.com");
	     user.setDataNascimento(new Date());
	     user.setDataAlteracao(new Date());
	     user.setDataInclusao(new Date());
	     user.setLogin("paizao-Depp");
	     user.setStatus(Status.ATIVO);
	     user.setSenha("202025");

		// Act
		user = userService.save(user);
		user1 = userService.save(user1);
		user2 = userService.save(user2);
		user3= userService.save(user3);
		user4= userService.save(user4);

		// Print
		System.out.println(user);
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		System.out.println(user4);
		
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
	        user.setStatus(Status.INATIVO);
	        user.setSenha("202020");
		// Act
		user = userService.update(user);

		// Print
		System.out.println(user);
	}

	@Test
	public void deleteById() throws ParseException {
		// Arrange
		User user = new User();
		 user.setId(null);
	     user.setName("Paulo");
	     user.setCpf("07466704002");
	     user.setEmail("paulo@gmail.com");
	     user.setTelefone("98888-4040");
	     user.setDataNascimento(new Date());
	     user.setDataAlteracao(new Date());
	     user.setDataInclusao(new Date());
	     user.setLogin("paulo-Depp");
	     user.setStatus(Status.ATIVO);
	     user.setSenha("202020");

		// Act
		user = userService.save(user);

		// Print
		System.out.println(user);
		userService.deleteById(user.getId());
		User userDeleted = userService.findById(user.getId());
		
	}
	@Test
	public void deleteAll() {
		// Act
		userService.deleteAll();
	}
}


