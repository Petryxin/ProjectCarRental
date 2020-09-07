package by.grickevich.impl;

import by.grickevich.CrudServiceJpaRepoImpl;
import by.grickevich.interfaces.OrderService;
import by.grickevich.models.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends CrudServiceJpaRepoImpl<Order> implements OrderService {
}
