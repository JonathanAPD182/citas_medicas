package com.alura.api.citas_medicas.domain.medico;

import com.alura.api.citas_medicas.domain.direccion.DatosDireccion;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DatosRegistroMedico(
        @NotBlank
        String nombre,

        @NotBlank
        @Email
        String email,

        @NotBlank
        @Pattern(regexp = "\\d{10,13}")
        String telefono,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String documento,

        @NotNull
        Especialidad especialidad,

        @NotNull
        @Valid
        DatosDireccion direccion) {
}
