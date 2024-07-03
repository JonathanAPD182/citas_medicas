package com.alura.api.citas_medicas.domain.medico;

import com.alura.api.citas_medicas.domain.direccion.DatosDireccion;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarMedico(@NotNull Long id, String nombre, String documento, DatosDireccion direccion) {
}
