package org.example.Kalyan.service;

import lombok.AllArgsConstructor;
import org.example.Kalyan.models.Client;
import org.example.Kalyan.models.Manager;
import org.example.Kalyan.models.User;
import org.example.Kalyan.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional( readOnly = true)
public class UserService
{
    private final UserRepository userRepository;

    @Transactional
    public User registerUser(String name,int number,String email,String password,boolean isManager)
    {
        User user;
        if(isManager)
        {
            user = new Manager();
        }
        else
        {
            user = new Client();
        }
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setNumber(number);
       return userRepository.save(user);

    }

}
