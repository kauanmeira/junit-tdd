package br.kauanmeira.servicos;

import java.util.Date;

import br.kauanmeira.entidades.Filme;
import br.kauanmeira.entidades.Locacao;
import br.kauanmeira.entidades.Usuario;
import br.kauanmeira.utils.DataUtils;

public class LocacaoService {

	public String vPublico;
	protected String vProtegida;
	private String vPrivada;
	String vDefault;
	
	public Locacao alugarFilme(Usuario usuario, Filme filme) {
		Locacao locacao = new Locacao();
		locacao.setFilme(filme);
		locacao.setUsuario(usuario);
		locacao.setDataLocacao(new Date());
		locacao.setValor(filme.getPrecoLocacao());

		//Entrega no dia seguinte
		Date dataEntrega = new Date();
		dataEntrega = DataUtils.adicionarDias(dataEntrega, 1);
		locacao.setDataRetorno(dataEntrega);
		
		//Salvando a locacao...	
		//TODO adicionar método para salvar
		
		return locacao;
	}


}