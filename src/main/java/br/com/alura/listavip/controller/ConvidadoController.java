package br.com.alura.listavip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConvidadoController {

	@RequestMapping
	@ResponseBody
	String ola () {
		return "index";
	}
}
