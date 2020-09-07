package by.grickevich.web;

import by.grickevich.models.Order;
import by.grickevich.interfaces.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/order")
public class OrderManagementController {

	@Autowired
	private OrderService orderService;

	@GetMapping(path = "/{id}")
	public Order getById(@PathVariable Integer id) {
		return orderService.getById(id);
	}

	@PostMapping
	public Order save(@RequestBody Order order) {
		return orderService.save(order);
	}

}
