package RRHH;

public class FactoriaDeEmpleados {
    public EmpleadoPrimitivo damePrimitivo(String nombre, byte numHijos,
                                    float sueldo, float porcentajeBenef) {
        if ((nombre != "") &&
                (numHijos < 10) &&
                (sueldo < 1000) &&
                (porcentajeBenef < 4)) {
            return new EmpleadoPrimitivo(nombre, numHijos, sueldo, porcentajeBenef);

        } else {
            return null;
        }
    }

    public Empleado dameNormal(String nombre, byte numHijos,
                        float sueldo, float porcentajeBenef) {
        if ((nombre == "") ||
                (numHijos < 1) ||
                (sueldo < 690) ||
                (porcentajeBenef < 1)) {
            return null;
        } else {
            return new Empleado(nombre, numHijos, sueldo, porcentajeBenef);
        }
    }
}
