package com.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.domain.Categoria;
import com.repository.CategoriaRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "INFORMATICA");
		Categoria cat2 = new Categoria(null, "ESCRITÓRIO");
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		
		
	}

}
