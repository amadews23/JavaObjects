package Gente;

import java.util.GregorianCalendar;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.00 2019/5/17
 */

public class EmpleadoAtencion extends Empleado {

    public EmpleadoAtencion(int dni, String nombre, String apellidos, GregorianCalendar fechaNacimiento) {
        super(EnumEmpleado.ATENCION, dni, nombre, apellidos, fechaNacimiento);
    }

    public EmpleadoAtencion(int dni, String nombre, String apellidos, int diaNacimiento, int mesNacimiento, int anyoNacimiento) {
        super(EnumEmpleado.ATENCION, dni, nombre, apellidos, diaNacimiento, mesNacimiento, anyoNacimiento);
    }
    
}
