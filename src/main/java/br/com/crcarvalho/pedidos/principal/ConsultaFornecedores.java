package br.com.crcarvalho.pedidos.principal;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.crcarvalho.pedidos.entity.FornecedorDTO;

@RestController
@RequestMapping("/consulta")
public class ConsultaFornecedores {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	public List<FornecedorDTO> index() {
		
		String uri = "https://egf1amcv33.execute-api.us-east-1.amazonaws.com/dev/produto/7894900011517";
		
		List<FornecedorDTO> fornecedores = Arrays.asList(restTemplate.getForObject(uri, FornecedorDTO[].class));
		
		fornecedores.forEach(System.out::println);
		
		
		//responseDTO.getFornecedores().forEach(System.out::println);
		
		
		
		return fornecedores;
	}
	
}
