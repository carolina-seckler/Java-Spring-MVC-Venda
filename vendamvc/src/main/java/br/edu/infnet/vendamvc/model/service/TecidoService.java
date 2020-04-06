package br.edu.infnet.vendamvc.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.vendamvc.model.negocio.Tecido;
import br.edu.infnet.vendamvc.model.repository.ITecidoRepository;

@Service
public class TecidoService {
	
	@Autowired
	ITecidoRepository repository;
	
	public List<Tecido> obterLista() {
		return (List<Tecido>) repository.findAll();
	}
	
	public Optional<Tecido> obterPorId(Integer id) {
		return repository.findById(id);
	}

	public void incluir (Tecido tecido) {
		repository.save(tecido);
	}
	
	public void excluir (Integer id) {
		repository.deleteById(id);
	}
	
	public List<Tecido> obterDisponiveis() {
		return (List<Tecido>) repository.findAvailable();
	}
}
