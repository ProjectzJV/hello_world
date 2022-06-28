package com.generation.listaObjetivo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-objetivo")
public class ListaObjetivoController {

	@GetMapping
	public String listaObjetivo() {
		return 	"-----------------Lista de Objetivos----------------\n\n" 
				+ "1ª - Estudar MySQL;\n" 
				+ "2ª - Fazer revisão de Java;\n"
				+ "3ª - Reinstalar o Eclipse para corrigir erro;\n"
				+ "4ª - Fazer todas as atividades prospostas em aula;\n"
				+ "5ª - Baixar o SpringTool na internet;\n\n"
				
				+ "-------------------Encerramento--------------------";

	
	
	}
}