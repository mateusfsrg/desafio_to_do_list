package com.example.desafio_to_do_list.repository;

import com.example.desafio_to_do_list.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {



}

