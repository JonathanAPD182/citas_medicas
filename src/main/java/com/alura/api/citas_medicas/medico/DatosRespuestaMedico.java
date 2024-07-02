package com.alura.api.citas_medicas.medico;

import com.alura.api.citas_medicas.direccion.DatosDireccion;

public record DatosRespuestaMedico(Long id, String nombre, String email, String telefono, String especialidad,
                                   DatosDireccion direccion) {
}
