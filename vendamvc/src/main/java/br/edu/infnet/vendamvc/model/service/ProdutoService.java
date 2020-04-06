package br.edu.infnet.vendamvc.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.vendamvc.model.negocio.Produto;
import br.edu.infnet.vendamvc.model.repository.IProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	IProdutoRepository repository;
	
	public Optional<Produto> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void atualizar(Produto produto) {
		repository.save(produto);
	}
}
