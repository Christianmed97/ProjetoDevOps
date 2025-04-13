package com.example.LivroDevOps.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tabelaLivro")
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank
	@Size(min=3,max=100,message="O nome precisa ter mais de 3 letras e menos de 100")
	@Column(name = "cs_nome")
	private String nome;
	@NotBlank
	@Column(name = "cs_autor")
	private String autor;
	@Min(1)
	@Max(2000)
	@Column(name = "qt_numeroPaginas")
	private int numeroPaginas;
	@Min(0)
	@Column(name = "vl_preco")
	private float preco;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
	 return String.format("%d - %s - %s - %d -%f",id, nome,autor, numeroPaginas,preco);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}

}
