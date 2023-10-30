public class EstadoIdentificado implements PadraoState {

    private Quiosque quiosque;
    private String matricula;

    public EstadoIdentificado(Quiosque quiosque, String matricula) {
        this.quiosque = quiosque;
        this.matricula = matricula;
    }

    public void identificarAluno(String matricula) {
        
        if (matriculaExistente(matricula)) {
            this.matricula = matricula; 
            System.out.println("Matricula identificada, aluno existente.");
        } else {
            System.out.println("Matrícula inexistente.");
        }
    }

    public void escolherMinicurso(String minicurso) {
        if (matriculaExistente(matricula)) {
            System.out.println("Minicurso:" + minicurso + "escolhido.");
            quiosque.setState(new EstadoProcessando(quiosque, minicurso));
        } else {
            System.out.println("Matricula Inexistente");
        }
    }

    public void informarCartao(String cartao) {
        System.out.println("Escoha um minicurso");
    }

    public void finalizar() {
        System.out.println("Escolha um minicurso");
    }

    public PadraoState getState() {
        return this;
    }

    private boolean matriculaExistente(String matricula) {
        if (matricula.length() == 8 && matricula.matches("\\d+ ")) {
            return true;
        }
        return false;
    }
}