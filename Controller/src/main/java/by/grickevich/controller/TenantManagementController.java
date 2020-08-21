package by.grickevich.controller;

import by.grickevich.models.Tenant;
import by.grickevich.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/users")
public class TenantManagementController {

	@Autowired
	private TenantService tenantService;

	@GetMapping(path = "/{id}")
	public Tenant getById(@PathVariable Integer id) {

		return tenantService.getById(id);
	}

	@PostMapping
	public Tenant save(@RequestBody Tenant tenant) {
		return tenantService.save(tenant);
	}

}
