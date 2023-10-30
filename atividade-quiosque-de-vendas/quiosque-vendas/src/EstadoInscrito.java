public class EstadoInscrito implements PadraoState {

    private Quiosque quiosque;
    private String minicursoSelecionado;

    public EstadoInscrito(Quiosque quiosque, String minicurso) {
        this.quiosque = quiosque;
        this.minicursoSelecionado = minicurso;
    }

    public void identificarAluno(String matricula) {
        System.out.println("Você já está inscrito no" + minicursoSelecionado);
    }

    public void escolherMinicurso(String minicurso) {
        System.out.println("Você já está inscrito no" + minicursoSelecionado);
    }

    public void informarCartao(String cartao) {
        System.out.println("Você já informou o cartão");
    }

    public void finalizar() {
        System.out.println("Gerando ticket para o minicurso " + minicursoSelecionado);
        quiosque.setState(new EstadoFinalizado(quiosque));
    }

    public PadraoState getState() {
        
        return this;
    }
}