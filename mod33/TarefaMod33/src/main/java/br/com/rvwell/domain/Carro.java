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
@Table(name = "TB_CARRO")
public class Carro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="carro_seq")
	@SequenceGenerator(name="carro_seq", sequenceName="sq_carro", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "CODIGO", length = 20, nullable = false, unique = true)
	private String codigo;
	
	@Column(name = "NOME", length = 20, nullable = false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "id_marca_fk", 
		foreignKey = @ForeignKey(name = "fk_marca_carro"), 
		referencedColumnName = "id", nullable = false
	)
	private Marca marca;
	
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "TB_CARRO_ACESSORIO", 
        joinColumns = { @JoinColumn(name = "id_carro_fk") }, 
        inverseJoinColumns = { @JoinColumn(name = "id_acessorio_fk") }
    )
	private List<Acessorio> acessorios;

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

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public List<Acessorio> getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(List<Acessorio> acessorios) {
		this.acessorios = acessorios;
	}

}
