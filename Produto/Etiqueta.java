package Produto;

public class Etiqueta {
    private String nomeEtiqueta;
    private int tamanhoEtiqueta;
    private String descrição;
    private String corVerso;


    public String getNomeEtiqueta() {
        return nomeEtiqueta;
    }

    public void setNomeEtiqueta(String nomeEtiqueta) {
        if (nomeEtiqueta != null && !nomeEtiqueta.isEmpty()) {
            this.nomeEtiqueta = nomeEtiqueta;
        } else {
            throw new IllegalArgumentException("Nome inválido!");
        }
    }

    public int getTamanhoEtiqueta() {
        return tamanhoEtiqueta;
    }

    public void setTamanhoEtiqueta(int tamanhoEtiqueta) {
        if (tamanhoEtiqueta <= 0 ) {
            throw new IllegalArgumentException("Tamanho inválido");
        } else {
            this.tamanhoEtiqueta = tamanhoEtiqueta;
        }
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public String getCorVerso() {
        return corVerso;
    }

    public void setCorVerso(String corVerso) {
        if (corVerso != null) {
            this.corVerso = corVerso;
        } else {
            this.corVerso = "Cor do verso será preto";
        }
    }
}
