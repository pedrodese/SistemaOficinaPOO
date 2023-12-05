package Model;

public class OrdemServico {

    private String descricaoDefeito;
    private String funcionarioResponsavel;
    private String dataEntrada;
    private double valorOrcamento;

    private int codigoOrdemServico;

    public String getDescricaoDefeito() {
        return descricaoDefeito;
    }

    public void setDescricaoDefeito(String descricaoDefeito) {
        this.descricaoDefeito = descricaoDefeito;
    }

    public String getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(String funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada){
        this.dataEntrada = dataEntrada;
    }

    public double getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(double valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public int getCodigoOrdemServico() {
        return codigoOrdemServico;
    }

    public void setCodigoOrdemServico(int codigoOrdemServico) {
        this.codigoOrdemServico = codigoOrdemServico;
    }
}
