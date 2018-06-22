package org.claro.controller;

import java.util.List;

import org.claro.db.Celular;
import org.claro.service.CelularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CelularController {

	@Autowired
	private CelularService celularService;

	@RequestMapping(path = "/claro/mobile", method = RequestMethod.POST)
	public ResponseEntity<Celular> inserir(@RequestBody Celular celular) {
		return new ResponseEntity<Celular>(celularService.inserir(celular),
				HttpStatus.OK);
	}

	@RequestMapping(path = "/claro/mobile", method = RequestMethod.GET)
	public ResponseEntity<List<Celular>> obterTodos() {
		return new ResponseEntity<List<Celular>>(celularService.obterTodos(),
				HttpStatus.OK);
	}

	@RequestMapping(path = "/claro/mobile/{code}", method = RequestMethod.GET)
	public ResponseEntity<Celular> obterPorCode(
			@PathVariable(value = "code") String code) {
		return new ResponseEntity<Celular>(celularService.obterPeloCode(code),
				HttpStatus.OK);
	}

}
