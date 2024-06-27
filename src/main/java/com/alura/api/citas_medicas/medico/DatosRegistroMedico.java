package com.alura.api.citas_medicas.medico;

import com.alura.api.citas_medicas.direccion.DatosDireccion;

public record DatosRegistroMedico(String nombre, String email, String documento, Especialidad especialidad, DatosDireccion direccion) {
}
