package br.edu.infnet.vendamvc.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.vendamvc.model.negocio.Venda;
import br.edu.infnet.vendamvc.model.repository.IVendaRepository;

@Service
public class VendaService {

	@Autowired
	private IVendaRepository repository;
	
	public List<Venda> obterLista() {
		
		return (List<Venda>) repository.findAll();
	}
	
	public Optional<Venda> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir (Venda venda) {
		repository.save(venda);
	}
	
	public void excluir (Integer id) {
		repository.deleteById(id);
	}
}
