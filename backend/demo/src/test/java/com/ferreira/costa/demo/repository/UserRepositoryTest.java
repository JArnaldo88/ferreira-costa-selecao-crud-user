package com.ferreira.costa.demo.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;
import com.ferreira.costa.demo.entity.Status;
import com.ferreira.costa.demo.entity.User;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
@TestPropertySource(locations = "classpath:application.properties")
public class UserRepositoryTest {

	
	@Autowired
    UserRepository userRepository;

	
	
	@Test
    public void save_create() {
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
        user = userRepository.save(user);

        // Print
        System.out.println(user);
        assertNotNull(user.getId());
        userRepository.deleteAll();
    }
	
}
