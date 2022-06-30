package com.ferreira.costa.demo.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferreira.costa.demo.entity.Status;
import com.ferreira.costa.demo.entity.User;

public interface UserRepository extends JpaRepository <User, Long> {

	Optional<User> findByName(String name);

	Optional<User> findByNomeMae(String nomeMae);

	Optional<User> findByEmail(String email);

	Optional<User> findByCpf(String cpf);

	Optional<User> findByTelefone(String telefone);

	Optional<User> findByLogin(String login);

	Optional<User> findBySenha(String senha);

	Optional<User> findByStatus(Status status);

	Optional<User> findByDataInclusao(Date dataInclusao);

	Optional<User> findByDataAlteracao(Date dataAlteracao);

}
