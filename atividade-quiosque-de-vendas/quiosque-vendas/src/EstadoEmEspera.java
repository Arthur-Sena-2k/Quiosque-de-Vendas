public class EstadoEmEspera implements PadraoState {

    private Quiosque quiosque;

    public EstadoEmEspera(Quiosque quiosque) {
        this.quiosque = quiosque;
    }

    private boolean matriculaExistente(String matricula) {
        if (matricula.length() == 8 && matricula.matches("\\d+")) {
            return true;
        }
        return false;
    }
    
    public void identificarAluno(String matricula) {
        if (matriculaExistente(matricula)) {
            quiosque.setState(new EstadoIdentificado(quiosque, matricula));
            System.out.println("Aluno identificado.");
        } else {
            System.out.println("Matrícula inexistentre. Digite uma matricula valida");
        }
    }
    public void escolherMinicurso(String minicurso) {
        System.out.println("Se identifiqeu");
    }

    public void informarCartao(String cartao) {
        System.out.println("Escolha o Mini curso");
    }

    public void finalizar() {
        System.out.println("Informe o cartão primiero");
    }
    public PadraoState getState() {
        return this;
    }
}