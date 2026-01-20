//Primeiro passo: Modelagem
//Que dados esse sistema precisa guardar?

public class Ingresso {

    private String nomeComprador;
    private int quantidade;
    private boolean meiaEntrada;

    //Metodo construtor para alinhar como esses dados serão organizados//
    public Ingresso(String nomeComprador, int quantidade, boolean meiaEntrada) {
        this.nomeComprador = nomeComprador;
        this.quantidade = quantidade;
        this.meiaEntrada = meiaEntrada;
    }

    //Getters//Return// Ler  e retornar os dados //
    public String getNomeComprador() {
        return nomeComprador;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean isMeiaEntrada() {
        return meiaEntrada;
    }

    //Setters//Atualizar os Ingressos
    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setMeiaEntrada(boolean meiaEntrada) {
        this.meiaEntrada = meiaEntrada;
    }


    //Define como o objeto aparece quando listado
    @Override
    public String toString() {
        return "Comprador: " + nomeComprador +
                " | Quantidade: " + quantidade +
                " | Meia-entrada: " + (meiaEntrada ? "Sim" : "Não");
    }
}
