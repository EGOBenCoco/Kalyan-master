package org.example.Kalyan.service;

import lombok.AllArgsConstructor;
import org.example.Kalyan.models.Kalyan;
import org.example.Kalyan.models.Tabak;
import org.example.Kalyan.repository.KalyanRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class KalyanService
{
    private final KalyanRepository kalyanRepository;

    @Transactional
    public List<Kalyan> showAllKalyan()
    {
        return kalyanRepository.findAll();
    }

    @Transactional
    public Kalyan showOneKalyan(int id)
    {
        Optional<Kalyan> optionalKalyan = kalyanRepository.findById(id);
        return optionalKalyan.orElse(null);
    }

    @Transactional
    public void addNewKalyan(String name,String description)
    {
        Kalyan kalyan = new Kalyan();
        kalyan.setName(name);
        kalyan.setDescription(description);
        kalyanRepository.save(kalyan);
    }

    @Transactional
    public void updateKalyan(Kalyan kalyan)
    {
        kalyanRepository.save(kalyan);
    }

    @Transactional
    public void deleteKalyan(int id)
    {
        kalyanRepository.deleteById(id);
    }
}
