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
	     user1.setId(null);
	     user1.setName("Aelson");
	     user1.setCpf("45167830028");
	     user1.setTelefone("98888-0000");
	     user1.setEmail("Aelson@gmail.com");
	     user1.setDataNascimento(new Date());
	     user1.setDataAlteracao(new Date());
	     user1.setDataInclusao(new Date());
	     user1.setLogin("aelson-Depp");
	     user1.setStatus(Status.INATIVO);
	     user1.setSenha("202022");
	     
	     User user2 = new User();
	     user2.setId(null);
	     user2.setName("Amanda");
	     user2.setCpf("72059560055");
	     user2.setTelefone("98888-3030");
	     user2.setEmail("Amanda@gmail.com");
	     user2.setDataNascimento(new Date());
	     user2.setDataAlteracao(new Date());
	     user2.setDataInclusao(new Date());
	     user2.setLogin("amanda-Depp");
	     user2.setStatus(Status.ATIVO);
	     user2.setSenha("202023");
	     
	     User user3 = new User();
	     user3.setId(null);
	     user3.setName("Beny");
	     user3.setCpf("92090507039");
	     user3.setTelefone("98888-5050");
	     user3.setEmail("beny@gmail.com");
	     user3.setDataNascimento(new Date());
	     user3.setDataAlteracao(new Date());
	     user3.setDataInclusao(new Date());
	     user3.setLogin("beny-Depp");
	     user3.setStatus(Status.ATIVO);
	     user3.setSenha("202024");
	     
	     User user4 = new User();
	     user4.setId(null);
	     user4.setName("Paizão");
	     user4.setCpf("16760650085");
	     user4.setTelefone("98888-8080");
	     user4.setEmail("paizao@gmail.com");
	     user4.setDataNascimento(new Date());
	     user4.setDataAlteracao(new Date());
	     user4.setDataInclusao(new Date());
	     user4.setLogin("paizao-Depp");
	     user4.setStatus(Status.ATIVO);
	     user4.setSenha("202025");

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


