package by.grickevich.web;

import by.grickevich.models.Logbook;
import by.grickevich.interfaces.LogbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/log")
public class LogbookManagementController {

	@Autowired
	private LogbookService logbookService;

	@GetMapping(path = "/{id}")
	public Logbook getById(@PathVariable Integer id) {

		return logbookService.getById(id);
	}

	@PostMapping
	public Logbook save(@RequestBody Logbook logbook) {
		return logbookService.save(logbook);
	}

}
