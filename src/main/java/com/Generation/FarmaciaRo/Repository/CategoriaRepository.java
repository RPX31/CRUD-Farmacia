package com.Generation.FarmaciaRo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.Generation.FarmaciaRo.Model.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria, Long>{
	
	public List<Categoria> findAllBynomeContainingIgnoreCase(@Param("nome") String nome);
	public List<Categoria> findAllBydescricaoContainingIgnoreCase(@Param("nome") String descricao);

}
