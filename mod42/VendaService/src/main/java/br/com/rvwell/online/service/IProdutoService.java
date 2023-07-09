/**
 * 
 */
package br.com.rvwell.online.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.rvwell.online.domain.Produto;

/**
 * @author Raphael Van Well
 *
 */

@FeignClient(name = "produto", url = "${application.produtoService.endpointConsultarProduto}")
@Service
public interface IProdutoService {

	@RequestMapping(method = RequestMethod.GET, value = "/{codigo}", produces = "application/json", headers = "application/json")
	Produto buscarProduto(@RequestParam("codigo") String codigoProduto);

}
