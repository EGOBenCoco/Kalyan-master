package org.example.Kalyan.service;

import lombok.AllArgsConstructor;
import org.example.Kalyan.models.*;
import org.example.Kalyan.repository.KalyanRepository;
import org.example.Kalyan.repository.OrdersRepository;
import org.example.Kalyan.repository.TabakRepository;
import org.example.Kalyan.repository.UserRepository;
import org.example.Kalyan.transferModels.OrdersModels;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class OrdersService
{
    private final OrdersRepository ordersRepository;
    private final TabakRepository tabakRepository;
    private final KalyanRepository kalyanRepository;
    private final UserRepository userRepository;

    @Transactional
    public void ordersAdd(OrdersModels ordersModels)
    {
        Orders orders = OrdersModels.toOrders(ordersModels);
        Client client = (Client) userRepository.findByIdUser(ordersModels.getClient_id());
        orders.setClient(client);

        List<Kalyan> kalyans = new ArrayList<>();
        for(Integer kalyanId: ordersModels.getKalyans()) {
            kalyans.add(kalyanRepository.findByIdKalyan(kalyanId));
        }
        orders.setKalyans(kalyans);

        List<Tabak> tabaks = new ArrayList<>();
        for(Integer tabakId: ordersModels.getTabaks()) {
            tabaks.add(tabakRepository.findByIdTabak(tabakId));
        }
        orders.setTabaks(tabaks);

        ordersRepository.save(orders);
    }
}
