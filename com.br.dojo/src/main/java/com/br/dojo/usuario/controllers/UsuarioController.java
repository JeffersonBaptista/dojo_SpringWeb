package com.br.dojo.usuario.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.dojo.usuario.models.UsuarioModel;
import com.br.dojo.usuario.services.UsuarioService;
@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/")
	public ModelAndView exibirComentarios() {
		ModelAndView modelAndView = new ModelAndView("home.html");
		modelAndView.addObject("comentarios", usuarioService.buscarTodos());
		return modelAndView;
	}
	
	@GetMapping("/detalhes/{id}")
	public ModelAndView buscarUsuario(@PathVariable int id) {
		ModelAndView modelAndView = new ModelAndView("perfil.html");
		modelAndView.addObject("comentario", usuarioService.buscarUsuario(id));
		return modelAndView;
	}
	@GetMapping("/excluir/{id}")
	public String excluirPost(@PathVariable int id) {	
		usuarioService.excluirPost(id);
		return "redirect:/";
		
//		modelAndView.addObject("comentario", usuarioService.excluirPost(id));
//		return modelAndView;
	}
	
	@GetMapping("/barrado")
	public ModelAndView barrado() {
		ModelAndView modelAndView = new ModelAndView("barrado.html");
		return modelAndView;
	}
	

	@GetMapping("/comentar")
	public ModelAndView cadastro() {
		ModelAndView modelAndView = new ModelAndView("comentar.html");
		return modelAndView;
	}
	
	@PostMapping("/comentar")
	public String salvarPessoa(String foto, String nome, int idade, String estadoCivil, String comentario) {
		return usuarioService.salvarComentario(foto, nome, idade, estadoCivil, comentario);
		
	}


}