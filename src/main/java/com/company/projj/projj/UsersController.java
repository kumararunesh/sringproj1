package com.company.projj.projj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserJpaRepository userJpaRepository ;

@RequestMapping(value ="/all" ,method = RequestMethod.GET)
    public List<Users> findAll()
{
    return  userJpaRepository.findAll();
}

     @PostMapping("load")
    public Users load (@RequestBody Users users)
     {
         userJpaRepository.save(users);
         return  userJpaRepository.findByName(users.getName());
     }
}
