package br.com.alura.listavip.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.listavip.database.entity.Convidado;
import br.com.alura.listavip.database.repository.ConvidadoRepository;

@Controller
public class ConvidadoController {

	@Autowired
	private ConvidadoRepository repository;

	Logger logger = LoggerFactory.getLogger(ConvidadoController.class);

	@RequestMapping("/home")
	String ola() {
		logger.info("recebeu requisicao");
		return "home";
	}

	@RequestMapping("/listar-convidados")
	public String listarConvidados(Model model) {
		logger.info("recebeu request");

		Iterable<Convidado> convidados = repository.findAll();

		model.addAttribute("convidados", convidados);

		return "listaconvidados";
	}
}
