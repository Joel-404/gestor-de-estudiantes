import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();
        Arrays notass = new Arrays();

        String nombre = scanner.nextLine();
        estudiante.setNombre(nombre);

        String apellido = scanner.nextLine();
        estudiante.setApellido(apellido);

        String correo = scanner.nextLine();
        estudiante.setCorreo(correo);

        String id = scanner.nextLine();
        estudiante.setId(id);

        notass.setNotas(estudiantes.notas());

        scanner.close();

        String nombreArchivo = "notas.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            bw.write("El nombre de l estudiante es: " + nombre);
            bw.newLine(); // Salto de línea
            bw.write("EL paellido del estudiante es: " + apellido);
            bw.newLine();
            bw.write("El correo del estudiante es: " + correo);
            bw.newLine();
            bw.write("El ID del estudiante es: " + id);
            System.out.println("Archivo guardado.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        };    
}
}