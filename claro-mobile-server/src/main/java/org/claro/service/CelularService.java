package org.claro.service;

import java.util.List;

import org.claro.db.Celular;
import org.claro.repository.CelularRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CelularService {

	@Autowired
	private CelularRepo celularRepo;

	@Transactional(readOnly = true)
	public Celular obterPeloCode(String code) {
		return celularRepo.findOne(code);
	}

	@Transactional(readOnly = true)
	public List<Celular> obterTodos() {
		return celularRepo.findAll();
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Celular inserir(Celular celular) {
		if (celular == null) {
			throw new IllegalArgumentException(
					"Erro no cadastramento do celular");
		}
		return celularRepo.save(celular);
	}

}
