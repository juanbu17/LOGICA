package co.com.consultas;

public class Recepcionista extends Usuario {


    @Override
    public void verUsuario(Paciente paciente) {
        super.verUsuario(paciente);
    }

    @Override
    public void verUsuario() {
        super.verUsuario();
    }

    @Override
    public void verUsuario(Medico medico) {
        super.verUsuario(medico);
    }
}
