package br.edu.infnet.vendamvc.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.vendamvc.model.negocio.Cliente;
import br.edu.infnet.vendamvc.model.repository.IClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private IClienteRepository repository;
	
	public List<Cliente> obterLista() {
		
		return (List<Cliente>) repository.findAll();
	}
	
	public Optional<Cliente> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir (Cliente cliente) {
		repository.save(cliente);
	}
	
	public void excluir (Integer id) {
		repository.deleteById(id);
	}
}
