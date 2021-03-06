package Gente;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import static Utilidades.CalculosFechas.calcularEdad;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.00 2019/5/17
 */

public class Persona {
    protected String nombre;
    protected String apellidos;
    protected GregorianCalendar fechaNacimiento;
    protected int diaNacimiento;
    protected int mesNacimiento;
    protected int anyoNacimiento;
    protected int edad;
    
    public Persona(String nombre, String apellidos, GregorianCalendar fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.diaNacimiento = fechaNacimiento.get(GregorianCalendar.DATE);
        this.mesNacimiento = fechaNacimiento.get(GregorianCalendar.MONTH);
        this.anyoNacimiento = fechaNacimiento.get(GregorianCalendar.YEAR);
        this.edad = calcularEdad(fechaNacimiento);
    }

    public Persona(String nombre, String apellidos, int diaNacimiento, int mesNacimiento, int anyoNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento-1;
        this.anyoNacimiento = anyoNacimiento;
        this.fechaNacimiento = new GregorianCalendar(anyoNacimiento, mesNacimiento-1, diaNacimiento);
        this.edad = calcularEdad(fechaNacimiento);   
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }

    public int getEdad() {
        return edad;
    }
   
    @Override
    public String toString() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MMMMMM/yyyy");
        fechaNacimiento.set(anyoNacimiento, mesNacimiento,diaNacimiento);
        return "\nNombre: " + nombre
                + ", Apellidos: " + apellidos+"\n"
                + " Fecha de Nacimiento: " +formatoFecha.format(fechaNacimiento.getTime());
    }
}
