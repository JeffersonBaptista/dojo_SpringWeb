package com.br.dojo.usuario.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.w3c.dom.ls.LSInput;

import com.br.dojo.usuario.models.UsuarioModel;

@Service
public class UsuarioService {

	private List<UsuarioModel> listaUsuario = new ArrayList<UsuarioModel>(
			Arrays.asList(new UsuarioModel(0, "#", "Andressa", 16, "Casada", "Calma gente")));

	public List<UsuarioModel> buscarTodos() {
		return listaUsuario;
	}

	public String salvarComentario(String foto, String nome, int idade, String estadoCivil, String comentario) {
		
		if(idade>= 18) {
		listaUsuario.add(new UsuarioModel(listaUsuario.size(),foto,nome,idade,estadoCivil,comentario));
		return "redirect:/";
		}else {
			return "redirect:barrado";
		}
		
	}

	public UsuarioModel buscarUsuario(int id) {
		UsuarioModel usuario = null;

		for (UsuarioModel retorno : listaUsuario) {
			if (retorno.getId() == id) {
				usuario = retorno;
			}
		}
		return usuario;
	}
	public void excluirPost(int id) {
		for (UsuarioModel usuario : listaUsuario) {
			if (usuario.getId() == id) {
				listaUsuario.remove(usuario);
				
			}
		}
		
		
	}


}
