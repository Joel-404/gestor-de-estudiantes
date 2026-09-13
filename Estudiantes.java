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
    
//gets
    public String getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getCorreo(){
        return correo;
    }
    public String getCarrera(){
        return carrera;
    }
    public ArrayList<Double> getNotas(){
        return notas;
    }
    //set
    public void setNombre(String nombre){
        this.nombre=nombre;
    }   
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setCorreo(String correo){
        this.correo=correo;
    }
    public void setCarrera(String carrera){
        this.carrera=carrera;
    }

    public void setNotas(ArrayList<Double> notas){
        this.notas=notas;
    }  
    
    //limitar notas 3 
    public void agregarnotas (double notass){
        if(notas.size() <= 3){
            notas.add(notass);
        }else{
            System.out.println("ERROR");
        }
    }

    

}
