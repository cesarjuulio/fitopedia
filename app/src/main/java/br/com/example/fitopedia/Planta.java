package br.com.example.fitopedia;

public class Planta {
    private String nomePopular;
    private String nomeCientifico;
    private String remedio;
    private String indicacao;
    private String posologia;
    private String descarte;
    private String contraIndicacoes;
    private String indicacoesExtemporaneas;
    private String modoPreparo;
    private String modoUso;
    private String contraIndicacoesExtemporaneas;
    private String localizacao;
    private String imagemDemonstracao1;
    private String imagemDemonstracao2;
    private String imagemRemedioDemonstracao;

    public Planta(String nomePopular, String nomeCientifico, String remedio, String indicacao, String posologia, String descarte, String contraIndicacoes, String indicacoesExtemporaneas, String modoPreparo, String modoUso, String contraIndicacoesExtemporaneas, String localizacao, String imagemDemonstracao1, String imagemDemonstracao2, String imagemRemedioDemonstracao) {
        this.nomePopular = nomePopular;
        this.nomeCientifico = nomeCientifico;
        this.remedio = remedio;
        this.indicacao = indicacao;
        this.posologia = posologia;
        this.descarte = descarte;
        this.contraIndicacoes = contraIndicacoes;
        this.indicacoesExtemporaneas = indicacoesExtemporaneas;
        this.modoPreparo = modoPreparo;
        this.modoUso = modoUso;
        this.contraIndicacoesExtemporaneas = contraIndicacoesExtemporaneas;
        this.localizacao = localizacao;
        this.imagemDemonstracao1 = imagemDemonstracao1;
        this.imagemDemonstracao2 = imagemDemonstracao2;
        this.imagemRemedioDemonstracao = imagemRemedioDemonstracao;
    }

    public String getNomePopular() {
        return nomePopular;
    }

    public void setNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getRemedio() {
        return remedio;
    }

    public void setRemedio(String remedio) {
        this.remedio = remedio;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    public String getDescarte() {
        return descarte;
    }

    public void setDescarte(String descarte) {
        this.descarte = descarte;
    }

    public String getContraIndicacoes() {
        return contraIndicacoes;
    }

    public void setContraIndicacoes(String contraIndicacoes) {
        this.contraIndicacoes = contraIndicacoes;
    }

    public String getIndicacoesExtemporaneas() {
        return indicacoesExtemporaneas;
    }

    public void setIndicacoesExtemporaneas(String indicacoesExtemporaneas) {
        this.indicacoesExtemporaneas = indicacoesExtemporaneas;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    public String getModoUso() {
        return modoUso;
    }

    public void setModoUso(String modoUso) {
        this.modoUso = modoUso;
    }

    public String getContraIndicacoesExtemporaneas() {
        return contraIndicacoesExtemporaneas;
    }

    public void setContraIndicacoesExtemporaneas(String contraIndicacoesExtemporaneas) {
        this.contraIndicacoesExtemporaneas = contraIndicacoesExtemporaneas;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getImagemDemonstracao1() {
        return imagemDemonstracao1;
    }

    public void setImagemDemonstracao1(String imagemDemonstracao1) {
        this.imagemDemonstracao1 = imagemDemonstracao1;
    }

    public String getImagemDemonstracao2() {
        return imagemDemonstracao2;
    }

    public void setImagemDemonstracao2(String imagemDemonstracao2) {
        this.imagemDemonstracao2 = imagemDemonstracao2;
    }

    public String getImagemRemedioDemonstracao() {
        return imagemRemedioDemonstracao;
    }

    public void setImagemRemedioDemonstracao(String imagemRemedioDemonstracao) {
        this.imagemRemedioDemonstracao = imagemRemedioDemonstracao;
    }

    @Override
    public String toString() {
        return "Planta{" +
                "Nome popular: " + nomePopular +
                " | Nome científico: " + nomeCientifico +
                " | Remédio: " + remedio +
                " | Indicação: " + indicacao +
                " | Posologia: " + posologia +
                " | Descarte: " + descarte +
                " | Contra Indicações: " + contraIndicacoes +
                " | Indicações Extemporâneas: " + indicacoesExtemporaneas +
                " | Modo de preparo: " + modoPreparo +
                " | Modo de uso: " + modoUso +
                " | Contra Indicações Extemporâneas: " + contraIndicacoesExtemporaneas +
                " | Localização: " + localizacao +
                " | Imagem Demonstração 1: " + imagemDemonstracao1 +
                " | Imagem Demonstração 2: " + imagemDemonstracao2 +
                " | Imagem Remédio Demonstração: " + imagemRemedioDemonstracao +
                "}";
    }
}
