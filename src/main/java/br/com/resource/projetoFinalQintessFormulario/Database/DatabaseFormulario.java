package br.com.resource.projetoFinalQintessFormulario.Database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_Formulario")
public class DatabaseFormulario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(length = 100, nullable = true)
	private String nomeColaborador;


	@Column(length = 100, nullable = true)
	private String atividade;

	@Column(length = 100, nullable = true)
	private String tecnologia;

	@Column(length = 100, nullable = true)
	private String conhecimentoOutraTecnologia;

	@Column(length = 100, nullable = true)
	private String formacaoAcademica;

	@Column(length = 100, nullable = true)
	private String certificacoes;
	
	@Column(length = 100, nullable = true)
	private String certificacoesNome;

	@Column(length = 100, nullable = true)
	private String tempoExperienciaAreaFuncaoAtual;

	@Column(length = 100, nullable = true)
	private String idiomas;

	@Column(length = 100, nullable = true)
	private String outroIdioma;
	
	@Column(length = 100, nullable = true)
	private String restricaoLocalAtuacao;
	
	@Column(length = 100, nullable = true)
	private String motivoRestricao;


	@Column(length = 100, nullable = true)
	private String temFilhos;

	public String getCertificacoesNome() {
		return certificacoesNome;
	}

	public void setCertificacoesNome(String certificacoesNome) {
		this.certificacoesNome = certificacoesNome;
	}

	public String getOutroIdioma() {
		return outroIdioma;
	}

	public void setOutroIdioma(String outroIdioma) {
		this.outroIdioma = outroIdioma;
	}

	public String getMotivoRestricao() {
		return motivoRestricao;
	}

	public void setMotivoRestricao(String motivoRestricao) {
		this.motivoRestricao = motivoRestricao;
	}

	public String getOffTopic() {
		return offTopic;
	}

	public void setOffTopic(String offTopic) {
		this.offTopic = offTopic;
	}

	@Column(length = 100, nullable = true)
	private String qtdFilhos;

	@Column(length = 100, nullable = true)
	private String idadeFilhos;

	@Column(length = 100, nullable = true)
	private String beneficioDesejavel;

	@Column(length = 100, nullable = true)
	private String temasDeInteresse;

	@Column(length = 100, nullable = true)
	private String temasDeInteresseEnsinar;

	@Column(length = 100, nullable = true)
	private String offTopic;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getConhecimentoOutraTecnologia() {
		return conhecimentoOutraTecnologia;
	}

	public void setConhecimentoOutraTecnologia(String conhecimentoOutraTecnologia) {
		this.conhecimentoOutraTecnologia = conhecimentoOutraTecnologia;
	}

	public String getFormacaoAcademica() {
		return formacaoAcademica;
	}

	public void setFormacaoAcademica(String formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}

	public String getCertificacoes() {
		return certificacoes;
	}

	public void setCertificacoes(String certificacoes) {
		this.certificacoes = certificacoes;
	}

	public String getTempoExperienciaAreaFuncaoAtual() {
		return tempoExperienciaAreaFuncaoAtual;
	}

	public void setTempoExperienciaAreaFuncaoAtual(String tempoExperienciaAreaFuncaoAtual) {
		this.tempoExperienciaAreaFuncaoAtual = tempoExperienciaAreaFuncaoAtual;
	}

	public String getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}

	public String getRestricaoLocalAtuacao() {
		return restricaoLocalAtuacao;
	}

	public void setRestricaoLocalAtuacao(String restricaoLocalAtuacao) {
		this.restricaoLocalAtuacao = restricaoLocalAtuacao;
	}

	
	public String getTemFilhos() {
		return temFilhos;
	}

	public void setTemFilhos(String temFilhos) {
		this.temFilhos = temFilhos;
	}

	public String getQtdFilhos() {
		return qtdFilhos;
	}

	public void setQtdFilhos(String qtdFilhos) {
		this.qtdFilhos = qtdFilhos;
	}

	public String getIdadeFilhos() {
		return idadeFilhos;
	}

	public void setIdadeFilhos(String idadeFilhos) {
		this.idadeFilhos = idadeFilhos;
	}

	public String getBeneficioDesejavel() {
		return beneficioDesejavel;
	}

	public void setBeneficioDesejavel(String beneficioDesejavel) {
		this.beneficioDesejavel = beneficioDesejavel;
	}

	public String getTemasDeInteresse() {
		return temasDeInteresse;
	}

	public void setTemasDeInteresse(String temasDeInteresse) {
		this.temasDeInteresse = temasDeInteresse;
	}

	public String getTemasDeInteresseEnsinar() {
		return temasDeInteresseEnsinar;
	}

	public void setTemasDeInteresseEnsinar(String temasDeInteresseEnsinar) {
		this.temasDeInteresseEnsinar = temasDeInteresseEnsinar;
	}

	public String getNomeColaborador() {
		return nomeColaborador;
	}

	public void setNomeColaborador(String nomeColaborador) {
		this.nomeColaborador = nomeColaborador;
	}

public String getAtividade() {
	return atividade;
}

public void setAtividade(String atividade) {
	this.atividade = atividade;
}

public String getTecnologia() {
	return tecnologia;
}

public void setTecnologia(String tecnologia) {
	this.tecnologia = tecnologia;
}



}