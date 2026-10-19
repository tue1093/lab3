package filmnow;

/**
 * Sistema que mantém os seus filmes prediletos. Podem existir 100 filmes.
 *
 * @author eliane
 *
 */
public class FilmNow {

    private static final int TAMANHO = 100;

    private Filme[] filmes;

    /**
     * Cria o FilmNow.
     */
    public FilmNow() {
        this.filmes = new Filme[TAMANHO];
    }

    /**
     * Acessa a lista de filmes mantida.
     * @return O array de filmes.
     */
    public String[] getFilmes() {
        String[] mostra = new String[filmes.length];

        for (int i = 0; i < filmes.length; i++) {

            if (filmes[i] != null) {

                mostra[i]= filmes[i].toString() + "\n";

            }
        }
        return mostra;
    }


    /**
     * Acessa os dados de um filme específico.
     * @param posicao Posição do filme no sistema.
     * @return Dados do filme. Null se não há filme na posição.
     */
    public String getFilme(int posicao) {
        return filmes[posicao].toString();
    }

    /**
     * Adiciona um filme em uma posição. Se já existir filme na posição, sobrescreve o anterior.
     * @param posicao Posição do filme.
     * @param nome Nome do filme.
     * @param ano Ano de lançamento do filme.
     * @param local Local onde o filme pode ser assitido.
     */
    public void cadastraFilme(int posicao, String nome, String ano, String local) {
        this.filmes[posicao] = new Filme(nome,ano,local);
    }

}