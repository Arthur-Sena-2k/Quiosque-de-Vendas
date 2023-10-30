public class EstadoFinalizado implements PadraoState {

    public EstadoFinalizado(Quiosque quiosque) {
    }

    public void identificarAluno(String matricula) {
        System.out.println("Operação finalizada.");
    }

    public void escolherMinicurso(String minicurso) {
        System.out.println("Operação finalizada");
    }

    public void informarCartao(String cartao) {
        System.out.println("Operação finalizada");
    }

    public void finalizar() {
        System.out.println("Operação finalizada");
    }
    public PadraoState getState() {
        return this;
    }
}