package com.alura.api.citas_medicas.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    public void registrarMedico(@RequestBody String parametro){
        System.out.println("El request llega correctamente");
        //Mostrar los datos provenientes del cliente
        System.out.println(parametro);
    }

}
