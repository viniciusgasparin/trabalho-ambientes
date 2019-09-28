package br.com.fiap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.component.RelatorioComponent;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RestController
public class RelatorioController {

	@Autowired
	private RelatorioComponent component;
	
	@PostMapping("/solicitarRelatorio")
	public void solicitarRelatorio(@RequestBody String uf) {
		try {
			component.solicitarRelatorio(uf);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
