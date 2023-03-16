package org.example.Kalyan.transferModels;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.example.Kalyan.models.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class OrdersModels
{

    private int id_order;

    private long sum;


    private Date date;


    private Manager manager;

    private Integer client_id;


    private List<Integer> kalyans;
    private List<Integer> tabaks;

    public static Orders toOrders(OrdersModels model) {
        Orders orders = new Orders();
        orders.setSum(model.getSum());

        return orders;
    }


}
