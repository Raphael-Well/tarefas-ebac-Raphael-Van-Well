/**
 * 
 */
package br.com.rvwell.domain;

import java.util.List;

import javax.persistence.*;

/**
 * @Author Raphael Van Well
 */

@Entity
@Table(name = "TB_ACESSORIO")
public class Acessorio {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="acessorio_seq")
	@SequenceGenerator(name="acessorio_seq", sequenceName="sq_acessorio", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "CODIGO", length = 20, nullable = false, unique = true)
	private String codigo;
	
	@Column(name = "NOME", length = 20, nullable = false)
	private String nome;
	
	@ManyToMany(mappedBy = "acessorios")
	private List<Carro> carros;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}
}
