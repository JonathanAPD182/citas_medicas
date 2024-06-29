package com.alura.api.citas_medicas.controllers;

import com.alura.api.citas_medicas.medico.DatosRegistroMedico;
import com.alura.api.citas_medicas.medico.IMedicoRepository;
import com.alura.api.citas_medicas.medico.Medico;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private IMedicoRepository medicoRepository;

    @PostMapping
    public void registrarMedico(@RequestBody @Valid DatosRegistroMedico datosRegistroMedico){
        //Mostrar los datos provenientes del cliente
        //System.out.println(datosRegistroMedico);
        //Guardar en la base de datos
        medicoRepository.save(new Medico(datosRegistroMedico));
    }

    
}

