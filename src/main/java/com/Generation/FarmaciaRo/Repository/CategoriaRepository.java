package com.Generation.FarmaciaRo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Generation.FarmaciaRo.Model.Categoria;
@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Long>{
	 List<Categoria> findAllBynomeContainingIgnoreCase(@Param("nome") String nome);
	 List<Categoria> findAllBydescricaoContainingIgnoreCase(@Param("nome") String descricao);

}
