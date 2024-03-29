/**
 * 
 */
package br.com.rvwell.online.dto;

import java.time.Instant;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Raphael Van Well
 *
 */
@Getter
@Setter
@AllArgsConstructor
@Builder
public class VendaDTO {
	
	@NotNull
	@Size(min = 2, max = 10)
	private String codigo;
	
	@NotNull
	private String clienteId;
	
	@NotNull
	private Instant dataVenda;

}
