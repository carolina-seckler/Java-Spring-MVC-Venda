package br.edu.infnet.vendamvc.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.vendamvc.model.negocio.Hibrido;
import br.edu.infnet.vendamvc.model.repository.IHibridoRepository;

@Service
public class HibridoService {

	@Autowired
	IHibridoRepository repository;
	
	public List<Hibrido> obterLista() {
		return (List<Hibrido>) repository.findAll();
	}
	
	public Optional<Hibrido> obterPorId(Integer id) {
		return repository.findById(id);
	}

	public void incluir (Hibrido hibrido) {
		repository.save(hibrido);
	}
	
	public void excluir (Integer id) {
		repository.deleteById(id);
	}
	
	public List<Hibrido> obterDisponiveis() {
		return (List<Hibrido>) repository.findAvailable();
	}
}
