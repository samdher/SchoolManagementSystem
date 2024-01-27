import java.util.Date;

public class Estudiante {
    public String nombre;
    public int id;
    public String apellido;
    public Date fechaDeNacimiento;
    public Estado estado;

    public class Estado {
        protected int id;
        protected  String descripcion;
    }
}
