package org.example.Kalyan.service;

import lombok.AllArgsConstructor;
import org.example.Kalyan.models.Client;
import org.example.Kalyan.models.Manager;
import org.example.Kalyan.models.Tabak;
import org.example.Kalyan.models.User;
import org.example.Kalyan.repository.TabakRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TabakService
{
    private final TabakRepository tabakRepository;

    @Transactional
    public List<Tabak> showAll()
    {
        return tabakRepository.findAll();
    }

    @Transactional
    public Tabak showOne(int id)
    {
        Optional<Tabak> optional = tabakRepository.findById(id);
        return optional.orElse(null);
    }



    @Transactional
    public void addTabak(String name,String brend,long strength,String aboutTabak)
    {
            Tabak tabak = new Tabak();
            tabak.setName(name);
            tabak.setBrend(brend);
            tabak.setStrength(strength);
            tabak.setAboutTabak(aboutTabak);
            tabakRepository.save(tabak);

    }


    @Transactional
    public void update(Tabak tabak)
    {
        tabakRepository.save(tabak);

    }


    @Transactional
    public void delete(int id)
    {
        tabakRepository.deleteById(id);
    }


}
