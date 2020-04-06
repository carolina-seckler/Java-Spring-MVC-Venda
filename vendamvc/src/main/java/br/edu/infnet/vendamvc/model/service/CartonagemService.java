package br.edu.infnet.vendamvc.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.vendamvc.model.negocio.Cartonagem;
import br.edu.infnet.vendamvc.model.repository.ICartonagemRepository;

@Service
public class CartonagemService {

	@Autowired
	ICartonagemRepository repository;
	
	public List<Cartonagem> obterLista() {
		return (List<Cartonagem>) repository.findAll();
	}
	
	public Optional<Cartonagem> obterPorId(Integer id) {
		return repository.findById(id);
	}

	public void incluir (Cartonagem cartonagem) {
		repository.save(cartonagem);
	}
	
	public void excluir (Integer id) {
		repository.deleteById(id);
	}
	
	public List<Cartonagem> obterDisponiveis() {
		return (List<Cartonagem>) repository.findAvailable();
	}
}
