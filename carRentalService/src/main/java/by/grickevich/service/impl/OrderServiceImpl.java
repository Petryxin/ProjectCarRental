package by.grickevich.service.impl;

import by.grickevich.models.Order;
import by.grickevich.service.CrudServiceJpaRepoImpl;
import by.grickevich.service.interfaces.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends CrudServiceJpaRepoImpl<Order> implements OrderService {
}
