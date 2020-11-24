package com.rasmoo.cliente.escola.matrizescurriculares.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rasmoo.cliente.escola.matrizescurriculares.entity.MateriaEntity;
import com.rasmoo.cliente.escola.matrizescurriculares.repository.IMateriaRepository;


@RestController
@RequestMapping("/materia")
public class MateriaController {
	
	@Autowired
	private IMateriaRepository materiaRepository;
	
	@GetMapping
	public ResponseEntity <List<MateriaEntity>> ListarMaterias(){
		return ResponseEntity.status(HttpStatus.OK).body(materiaRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity <MateriaEntity> consultaMateria(@PathVariable long id){
		return ResponseEntity.status(HttpStatus.OK).body(materiaRepository.findById(id).get());
	} 
	
	
	@PostMapping
	public ResponseEntity <Boolean> CadastrarMateria(@RequestBody MateriaEntity materia) {
		try {
			this.materiaRepository.save(materia);
			return ResponseEntity.status(HttpStatus.OK).body(true);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.OK).body(false);
		}
		
	}	
}
			
