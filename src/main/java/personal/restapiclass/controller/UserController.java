package personal.restapiclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import personal.restapiclass.model.UserModel;
import personal.restapiclass.repository.UserRepository;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping(path = "/api/user/{cod}")
    public ResponseEntity find(@PathVariable("cod") Integer cod) {
        return repository.findById(cod).map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/user/save")
    public UserModel create(@RequestBody UserModel newUser) {
        return repository.save(newUser);
    }

}
