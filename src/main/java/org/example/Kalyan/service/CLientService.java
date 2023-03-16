package org.example.Kalyan.service;

import lombok.AllArgsConstructor;
import org.example.Kalyan.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional( readOnly = true)
public class CLientService
{
    private final UserRepository clientRepository;




}
