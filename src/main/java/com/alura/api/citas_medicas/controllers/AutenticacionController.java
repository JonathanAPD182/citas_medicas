package com.alura.api.citas_medicas.controllers;

import com.alura.api.citas_medicas.domain.usuarios.DatosAutenticacionUsuario;
import com.alura.api.citas_medicas.domain.usuarios.Usuario;
import com.alura.api.citas_medicas.infra.security.DatosJwtToken;
import com.alura.api.citas_medicas.infra.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity autenticarUsuario(@RequestBody @Valid DatosAutenticacionUsuario datosAutenticacionUsuario){
        Authentication authToken = new UsernamePasswordAuthenticationToken(datosAutenticacionUsuario.login(),
                datosAutenticacionUsuario.clave());
        var usuarioAutenticado = authenticationManager.authenticate(authToken);
        var JwtToken = tokenService.generarToken((Usuario) usuarioAutenticado.getPrincipal());
        //Solo para fines didacticos vamos a retornar un 200 OK
        return ResponseEntity.ok(new DatosJwtToken(JwtToken));
    }

}
