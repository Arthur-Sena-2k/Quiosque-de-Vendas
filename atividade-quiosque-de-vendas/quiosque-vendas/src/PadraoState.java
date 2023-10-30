public interface PadraoState {

    void identificarAluno(String matricula);
    void escolherMinicurso(String minicurso);
    void informarCartao(String cartao);
    void finalizar();
    PadraoState getState();
    
}