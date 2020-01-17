package br.com.resource.projetoFinalQintessFormulario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.resource.projetoFinalQintessFormulario.DAO.FormularioDAO;
import br.com.resource.projetoFinalQintessFormulario.Database.DatabaseFormulario;

@Controller
public class FormularioController {

	@RequestMapping("/")
	public String Formulario() {
		System.out.println("Se esta mensagem apareceu significa que o controller do formulario passou");
		return "formulario";
	}

	@Autowired
	private FormularioDAO form;

	@PostMapping("/salva")
	public String salvarDados(@ModelAttribute(name = "dado") DatabaseFormulario dado) {
		form.save(dado);
		return "redirect:/";
	}

}
