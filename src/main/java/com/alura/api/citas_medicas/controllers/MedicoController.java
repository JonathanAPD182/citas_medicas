package com.alura.api.citas_medicas.controllers;

import com.alura.api.citas_medicas.medico.DatosListadoMedico;
import com.alura.api.citas_medicas.medico.DatosRegistroMedico;
import com.alura.api.citas_medicas.medico.IMedicoRepository;
import com.alura.api.citas_medicas.medico.Medico;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public Page<DatosListadoMedico> listadoMedicos(@PageableDefault(size = 2) Pageable paginacion){
        return medicoRepository.findAll(paginacion).map(DatosListadoMedico::new);
    }

    @PutMapping
    public void actualizarMedico(){

    }
}

