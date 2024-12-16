package com.Generation.FarmaciaRo.Model;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "O nome é obrigatório.") 
	@Size(min = 3, max = 5000, message = "O nome deve ter entre 3 e 5000 caracteres.")
	private String nome;
	@NotBlank(message = "A descrição é obrigatória.") 
	@Size(min = 3, max = 5000, message = "O nome deve ter entre 3 e 5000 caracteres.")
	private String descricao;
	@OneToMany(mappedBy = "categoria") 
    private List<Produto> produtos;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
