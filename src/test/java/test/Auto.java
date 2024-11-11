// archivo Auto.java
package test;

public class Auto {
    String modelo;
    int precio;
    String marca;
    Asiento[] asientos;
    Motor motor;
    int registro;
    static int cantidadCreados = 0;

    public Auto() {
        cantidadCreados++;
    }

    public int cantidadAsientos() {
        int count = 0;
        if (asientos != null) {
            for (Asiento asiento : asientos) {
                if (asiento != null) {
                    count++;
                }
            }
        }
        return count;
    }

    public String verificarIntegridad() {
        if (motor != null && motor.registro == this.registro) {
            if (asientos != null) {
                for (Asiento asiento : asientos) {
                    if (asiento != null && asiento.registro != this.registro) {
                        return "Las piezas no son originales";
                    }
                }
            }
            return "Auto original";
        }
        return "Las piezas no son originales";
    }
}

