package br.com.fiap.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fiap.service.Produtor;

@Component
public class RelatorioComponent {

	@Autowired
	private Produtor produtor;
	
	public void solicitarRelatorio(String uf) throws Exception {
		produtor.enviarMensagem(uf);
	}
	
}
