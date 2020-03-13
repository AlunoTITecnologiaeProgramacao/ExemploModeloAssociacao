package exemplomodeloassociacao;

public class Parafuso {
    private String tamanho;
    private String tipoMaterial;
    private Fornecedor fornecedor; 

    public Parafuso(String tamanho, String tipoMaterial, Fornecedor fornecedor) {
        this.tamanho = tamanho;
        this.tipoMaterial = tipoMaterial;
        this.fornecedor = fornecedor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    @Override
    public String toString() {
        return "\nTamanho: " + this.getTamanho()
                + "\nTipo Material: " + this.getTipoMaterial()
                + "\nFornededor do Parafuso: " + this.getFornecedor();
    }
    
}
