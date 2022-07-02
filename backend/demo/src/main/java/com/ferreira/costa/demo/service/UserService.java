package com.ferreira.costa.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ferreira.costa.demo.entity.Status;
import com.ferreira.costa.demo.entity.User;
import com.ferreira.costa.demo.repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		
		super();
		this.userRepository = userRepository;
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		return userRepository.findById(id).orElse(null);
	}
	
	public User findByName(String name) {
		return userRepository.findByName(name).orElse(null);
	}
	
	public User findByNomeMae(String nomeMae) {
		return userRepository.findByNomeMae(nomeMae).orElse(null);
	}
	
	public User findByEmail(String email) {
		return userRepository.findByEmail(email).orElse(null);
	}
	
	public User findByCpf(String cpf) {
		return userRepository.findByCpf(cpf).orElse(null);
	}
	
	public User findByTelefone(String telefone) {
		return userRepository.findByTelefone(telefone).orElse(null);
		
	}
	
	public User findByLogin(String login) {
		return userRepository.findByLogin(login).orElse(null);
		
	}
	
	public User findBySenha(String senha) {
		return userRepository.findBySenha(senha).orElse(null);
		
	}
	
	public User findByStatus(Status status) {
		return userRepository.findByStatus(status).orElse(null);
		
	}
	
	public User findByDataInclusao(Date dataInclusao) {
		return userRepository.findByDataInclusao(dataInclusao).orElse(null);
		
	}
	
	public User findByDataAlteracao(Date dataAlteracao) {
		return userRepository.findByDataAlteracao(dataAlteracao).orElse(null);
		
	}
	

	public User save(User user) {
		user.setId(null);
		return saveInternal(user);
	}
	
	private User saveInternal(User user) {
		user = userRepository.save(user);
		
		return user;
			
	}
	
	public User update(User user) {
		Long id = user.getId();
		if (id != null && userRepository.existsById(id)) {
			return saveInternal(user);
		} else {
			return null;
		}
	}
	
	public void deleteById(Long id) {
		User user = userRepository.findById(id).orElse(null);
		if (user != null) {
			user.setStatus(Status.INATIVO);
			saveInternal(user);
		}
	}
		public void deleteAll() {
		List<User> allUser = userRepository.findAll();	
		for (User user : allUser) {
			user.setStatus(Status.INATIVO);
		}
		userRepository.saveAll(allUser);
		}
		
		public void teste() {

		}

}

	


