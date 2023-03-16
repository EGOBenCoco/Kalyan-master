package org.example.Kalyan.controller;

import lombok.AllArgsConstructor;
import org.example.Kalyan.exception.CatchException;
import org.example.Kalyan.models.Kalyan;
import org.example.Kalyan.repository.KalyanRepository;
import org.example.Kalyan.service.KalyanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.kerberos.KerberosKey;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class KalyanController
{
    private final KalyanService kalyanService;

    @GetMapping("/kalyan")
    public List<Kalyan> showAllKalyan()
    {
        List<Kalyan> kalyanList = kalyanService.showAllKalyan();
        return kalyanList;
    }

    @GetMapping("/kalyan/{id}")
    public Kalyan showOneKalyan(@PathVariable int id)
    {
        Kalyan kalyan = kalyanService.showOneKalyan(id);

        if(kalyan ==null)
        {
            throw new CatchException("Кальяна не найден");
        }
        return kalyan;

    }

    @PostMapping("/kalyan/{name}/{description}")
    public ResponseEntity addNewKalyan(@PathVariable String name,@PathVariable String description)
    {
        try {
            kalyanService.addNewKalyan(name, description);
            return ResponseEntity.ok("Информация о кальяне добавлена");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/kalyan")
    public void updateKalyan(@RequestBody Kalyan kalyan)
    {
        kalyanService.updateKalyan(kalyan);
    }

    @DeleteMapping("/kalyan/{id}")
    public void deleteKalyan(@PathVariable int id)
    {
        kalyanService.deleteKalyan(id);
    }


}
