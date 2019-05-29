package Gente;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.00 2019/5/17
 */

public class Empleado extends Persona {
  
    protected EnumEmpleado tipoEmpleado;
    int dni;
    protected float sueldo;

    public Empleado(EnumEmpleado tipoEmpleado, int dni, String nombre, String apellidos, GregorianCalendar fechaNacimiento) {
        super(nombre, apellidos, fechaNacimiento);
        this.tipoEmpleado = tipoEmpleado;
        this.dni = dni;
        this.sueldo = tipoEmpleado.obtenerSueldo();
    }

    public Empleado(EnumEmpleado tipoEmpleado, int dni, String nombre, String apellidos, int diaNacimiento, int mesNacimiento, int anyoNacimiento) {
        super(nombre, apellidos, diaNacimiento, mesNacimiento, anyoNacimiento);
        this.tipoEmpleado = tipoEmpleado;
        this.dni = dni;
        this.sueldo = tipoEmpleado.obtenerSueldo();
    }

    public Empleado(int dni, String nombre, String apellidos, GregorianCalendar fechaNacimiento) {
        super(nombre, apellidos, fechaNacimiento);
    }

    public Empleado(int dni, String nombre, String apellidos, int diaNacimiento, int mesNacimiento, int anyoNacimiento) {
        super(nombre, apellidos, diaNacimiento, mesNacimiento, anyoNacimiento);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
  
    
    public float getSueldo() {
        return sueldo;
    }

    public EnumEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MMMMMM/yyyy");

        return "\n Puesto: " + tipoEmpleado.getNombreEmpleo() + " Sueldo: " + sueldo
               +"\n Nombre: " + nombre + " " + apellidos + " DNI:" + dni 
               + " Fecha de Nacimiento: " + formatoFecha.format(fechaNacimiento.getTime())
               +"\n" ;
  
    }
   
}
