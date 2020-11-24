package com.rasmoo.cliente.escola.matrizescurriculares.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rasmoo.cliente.escola.matrizescurriculares.entity.MateriaEntity;

@Repository
public interface IMateriaRepository extends JpaRepository<MateriaEntity, Long>{

}
