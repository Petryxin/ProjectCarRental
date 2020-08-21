package by.grickevich.service;

import by.grickevich.models.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends CrudServiceJpaRepoImpl<Order> implements OrderService {
}
