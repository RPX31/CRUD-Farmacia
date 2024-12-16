package com.Generation.FarmaciaRo.Model;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "O nome é obrigatório.") 
	@Size(min = 3, max = 5000, message = "O nome deve ter entre 3 e 5000 caracteres.")
	private String nome;
	@NotBlank(message = "A marca é obrigatória.") 
	@Size(min = 3, max = 5000, message = "O nome deve ter entre 3 e 5000 caracteres.")
	private String marca;
	@NotBlank(message = "A descrição é obrigatória.") 
	@Size(min = 3, max = 5000, message = "O nome deve ter entre 3 e 5000 caracteres.")
	private String descricao;
	@NotNull(message = "O preço não pode ser nulo.") 
	@Positive(message = "o preço so pode ser positivo") 
	private float preco;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date validade;
	@ManyToOne
	@JsonIgnoreProperties("produto")
	@JoinColumn(name = "id_categoria", nullable = false)
	private Categoria categoria;
	
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
