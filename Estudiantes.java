import java.util.ArrayList;

public class Estudiantes {

    private String nombre;
    private String apellido;
    private String correo;
    private String carrera;
    private String id;
    private ArrayList<Double> notas;


    //constructor para 3
    public Estudiantes (String nombre, String apellido, String correo, String carrera, String id)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.notas =new ArrayList ();
        this.id= id;

    }
    

    

}
