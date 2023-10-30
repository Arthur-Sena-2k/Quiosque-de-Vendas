public class EstadoProcessando implements PadraoState {

    private Quiosque quiosque;
    private String minicursoEscolhido;

    public EstadoProcessando(Quiosque quiosque, String minicurso) {
        this.quiosque = quiosque;
        this.minicursoEscolhido = minicurso;
    }

    public void identificarAluno(String matricula) {
        System.out.println("Você está identificado");
    }

    public void escolherMinicurso(String minicurso) {
        
        System.out.println("Você já escolheu seu mini curso: "+ minicursoEscolhido);
    }

    public void informarCartao(String cartao) {
        if (minicursoEscolhido != null) {
            quiosque.setState(new EstadoInscrito(quiosque, minicursoEscolhido));
            System.out.println("Cartão autorizado.");
        } else {
            System.out.println("Escolha um minicurso");
        }
    }

    public void finalizar() {
        System.out.println("Espere autorizar o cartão para finalizar.");
    }

    public PadraoState getState() {
        return this;
    }
}
