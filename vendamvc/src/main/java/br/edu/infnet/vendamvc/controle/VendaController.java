package br.edu.infnet.vendamvc.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.vendamvc.auxiliar.ProdutoEditor;
import br.edu.infnet.vendamvc.model.negocio.Produto;
import br.edu.infnet.vendamvc.model.negocio.Venda;
import br.edu.infnet.vendamvc.model.service.CartonagemService;
import br.edu.infnet.vendamvc.model.service.ClienteService;
import br.edu.infnet.vendamvc.model.service.HibridoService;
import br.edu.infnet.vendamvc.model.service.ProdutoService;
import br.edu.infnet.vendamvc.model.service.TecidoService;
import br.edu.infnet.vendamvc.model.service.VendaService;

@Controller
@SessionAttributes("user")
public class VendaController {
	
	@Autowired
	private VendaService service;
	@Autowired
	private ClienteService clienteService;
	@Autowired
	private TecidoService tecidoService;
	@Autowired
	private CartonagemService cartonagemService;
	@Autowired
	private HibridoService hibridoService;
	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping(value = "/venda", method = RequestMethod.GET)
	public String showDetalhe(Model model) {
		model.addAttribute("clientesLista", clienteService.obterLista());
		model.addAttribute("tecidosLista", tecidoService.obterDisponiveis());
		model.addAttribute("cartonagensLista", cartonagemService.obterDisponiveis());
		model.addAttribute("hibridosLista", hibridoService.obterDisponiveis());
		return "venda/detalhe";
	}
	
	@RequestMapping(value = "/vendas", method = RequestMethod.GET)
	public String obterLista(Model model) {
		model.addAttribute("vendasLista", service.obterLista());
		return "venda/lista";
	}
	
	@InitBinder     
	public void initBinder(WebDataBinder binder){
	     binder.registerCustomEditor(Produto.class, new ProdutoEditor());   
	}
	
	@RequestMapping(value = "/venda", method = RequestMethod.POST)
	public String incluir(Model model, Venda venda) {
		
		service.incluir(venda);
		for (Produto produto : venda.getProdutos()) {
			produto.setVenda(venda);
			produtoService.atualizar(produto);
		}
		
		return this.obterLista(model);
	}
	
	@RequestMapping(value = "/venda/excluir/{id}", method = RequestMethod.GET)
	public String excluir(Model model, @PathVariable Integer id) {
		
		service.excluir(id);
		
		return this.obterLista(model);
	}

	public VendaService getService() {
		return service;
	}

	public void setService(VendaService service) {
		this.service = service;
	}
	
	

}
