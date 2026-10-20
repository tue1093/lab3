package filmnow;

public class Filme {

    private String nome;
    private String anoLancamento;
    private String plataforma;
    private String status;

    Filme(String nome, String anoLancamento, String plataforma) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.plataforma = plataforma;
        this.status = "";
    }

    public String getNome() {
        return this.nome;
    }

    public String getAnoLancamento() {
        return this.anoLancamento;
    }

    public String getPlataforma() {
        return this.plataforma;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatusHot(){
        this.status = "\uD83D\uDD25 ";
    }

    public void removerStatusHot(){
        this.status = "";
    }

    @Override
    public String toString() {

        return this.nome + ", " + this.anoLancamento + "\n" + this.getPlataforma();
    }

    @Override
    public boolean equals(Object o) {

        Filme a = (Filme) o;

        if (this.nome == a.getNome()) {
            return true;
        }
        return false;
    }

}
