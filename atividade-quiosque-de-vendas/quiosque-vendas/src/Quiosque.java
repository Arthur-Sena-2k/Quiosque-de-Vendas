public class Quiosque {

    private PadraoState state;

    public Quiosque() {
        state = new EstadoEmEspera(this);
    }

    public void setState(PadraoState state) {
        this.state = state;
    }
    public PadraoState getState() {
        return state;
    }

    public void identificarAluno(String matricula) {
        state.identificarAluno(matricula);
    }

    public void escolherMinicurso(String minicurso) {
        state.escolherMinicurso(minicurso);
    }

    public void informarCartao(String cartao) {
        state.informarCartao(cartao);
    }

    public void finalizar() {
        state.finalizar();
    }
    
    
    
    
}