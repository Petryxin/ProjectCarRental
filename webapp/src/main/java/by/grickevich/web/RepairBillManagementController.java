package by.grickevich.web;

import by.grickevich.models.RepairBill;
import by.grickevich.interfaces.RepairBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/bill")
public class RepairBillManagementController {

	@Autowired
	private RepairBillService repairBillService;

	@GetMapping(path = "/{id}")
	public RepairBill getById(@PathVariable Integer id) {

		return repairBillService.getById(id);
	}

	@PostMapping
	public RepairBill save(@RequestBody RepairBill repairBill) {
		return repairBillService.save(repairBill);
	}

}
