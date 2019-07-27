package com.spring.soutenance.Controller;

import com.spring.soutenance.DTO.UserDto;
import com.spring.soutenance.Service.UserService;
import com.spring.soutenance.domain.UserApp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;
import java.util.Optional;


@RestController
@Slf4j
public class UserController {
    @Autowired
    UserService userService;
    private AuthenticationManager authenticationManager;

    @GetMapping("/hello")
    public String hello (){
        return "hello";
    }


    // Ajouter un utilisateur

    @PostMapping("/register")
    public void addUser(@RequestBody UserDto userDto) {
        userService.saveUser(userDto);
    }

    // modifier un utilisateur

    @PutMapping(value = "/{id}")
    public void apdateUser(@RequestBody UserDto userDto, @PathVariable long id) {
        userService.updateUser(userDto, id);
    }

    // supprimer un utilisateur

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteUser(@PathVariable long id) {
        userService.deleteUserById(id);
    }

    //@GetMapping()
    @RequestMapping("/all")
    public Collection<UserApp> findAll() {
        return userService.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<UserApp> findById(@PathVariable long id) {
        return userService.findUserById(id);
    }





}







/*



    @PostMapping("/auth")
    public ResponseEntity<String> login(HttpServletRequest request) throws RuntimeException,IOException{

       String tokenResponse = "";
        String header = request.getHeader("Authorization");
        log.info("Request Header credentials: {}", header);


       // if ((header == null) || (!header.startsWith("Basic "))) {
        //    throw new AuthenticationException();
       // }

        //AuthenticationRequest authenticationRequestDTO = new AuthenticationRequest();


        String[] tokens = extractAndDecodeToken(header);

if (tokens.length != 2) {
            throw new IOException("FAIL_DECODE_TOKEN");
        }


        String login = tokens[0];
        String password = tokens[1];

        UserApp user =userService.findUserByEmail(login);

        if(user == null) throw new RuntimeException("user not found");

        if(!user.getPassword().equals(password)) throw new RuntimeException("bad credientials");

        String token = JWT.create()
                .withIssuer(request.getRequestURI())
                .withSubject(user.getUserName())
                .withArrayClaim("roles", user.getUserRoles().toArray(new String[user.getUserRoles().size()]))
                .withExpiresAt(new Date(System.currentTimeMillis() + SecurityParams.EXPIRATION))
                .sign(HMAC256(SecurityParams.SECRET));
        //response.addHeader(SecurityParams.JWT_HEADER_NAME, token);
        return  new ResponseEntity<String>(token, HttpStatus.OK);
    }


    public String[] extractAndDecodeToken(String header) throws IOException {

        byte[] base64Token = header.substring(6).getBytes("UTF-8");
        byte[] decoded = Base64.decode(base64Token);
        String token = new String(decoded, "UTF-8");
        int delim = token.indexOf(":");

        if (delim == -1) {
            throw new IOException();
        }
        return new String[]{token.substring(0, delim), token.substring(delim + 1)};


    }


*/






