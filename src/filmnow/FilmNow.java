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
    private Filme[] hotList;

    /**
     * Cria o FilmNow.
     */
    public FilmNow() {
        this.filmes = new Filme[TAMANHO];
        this.hotList = new Filme[10];
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

    public String[] getFilmesHot() {
        String[] mostra = new String[hotList.length];

        for (int i = 0; i < hotList.length; i++) {

            if (hotList[i] != null) {

                mostra[i]= hotList[i].toString() + "\n";

            }
        }
        return mostra;
    }

    /**
     * Acessa os dados de um filme específico.
     * @param posicao Posição do filme no sistema.
     * @return Dados do filme. Null se não há filme na posição.
     */
    public Filme getFilme(int posicao) {
        return filmes[posicao];
    }

    /**
     * Adiciona um filme em uma posição. Se já existir filme na posição, sobrescreve o anterior.
     * @param posicao Posição do filme.
     * @param nome Nome do filme.
     * @param ano Ano de lançamento do filme.
     * @param local Local onde o filme pode ser assitido.
     */
    public void cadastraFilme(int posicao, String nome, String ano, String local) {

        this.filmes[posicao] = new Filme(nome, ano, local);

    }

    public String atribuirHot(int idFilme) {

        if (hotList[idFilme-1] != null) {
            hotList[idFilme-1].removerStatusHot();
            hotList[idFilme-1] = filmes[idFilme];
            hotList[idFilme-1].setStatusHot();
        } else {

            hotList[idFilme-1] = filmes[idFilme];
            hotList[idFilme-1].setStatusHot();

        }

        return "ADICIONADO À HOTLIST NA POSIÇÃO " + idFilme + "!";
    }

    public void removerHot(int idFilme){

        hotList[idFilme-1].removerStatusHot();
        hotList[idFilme-1] = null;

    }

    private boolean nomeEAnoLancamentoSaoValidos(String nome, String anoLacamento) {

        for (Filme f : filmes) {

            if (f != null)

            if (f.getNome().equals(nome) && f.getAnoLancamento().equals(anoLacamento)) {
                return false;
            }
        }
        return true;
    }

    private boolean estaNaHotList(int idFilme) {

        for (Filme f : hotList) {

            if (f != null) {

                if (f.getNome().equals(hotList[idFilme].getNome())) {
                    return true;
                }
            }
        }
        return false;
    }

}