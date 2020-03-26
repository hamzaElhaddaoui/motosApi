package com.bibliotheque.motosapi.controllers;

import com.bibliotheque.motosapi.models.AuthentificationRequest;
import com.bibliotheque.motosapi.models.AuthentificationResponse;
import com.bibliotheque.motosapi.security.MyUserDetailsService;
import com.bibliotheque.motosapi.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthentificationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/authentification")
    public ResponseEntity<?> creationAuthentification(@RequestBody AuthentificationRequest authentificationRequest) throws Exception{
        System.out.println("en cours d'authentification");
        // s'ethentifier en utilisant l'objet authentificationManager
        try{
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authentificationRequest.getUsername(),authentificationRequest.getPassword()));
        }catch (BadCredentialsException e){
            throw new Exception("Incorrect username or password",e);
        }

        // le client est authentifié
        // Generation de codeToken
        // La generation de token necessite un objet de type userdetails
        final UserDetails userDetails = userDetailsService.loadUserByUsername(authentificationRequest.getUsername());
        final String jwt = jwtUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthentificationResponse(jwt));
    }
}
