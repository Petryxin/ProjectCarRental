package by.grickevich.service.impl;

import by.grickevich.models.Logbook;
import by.grickevich.service.CrudServiceJpaRepoImpl;
import by.grickevich.service.interfaces.LogbookService;
import org.springframework.stereotype.Service;

@Service
public class LogbookServiceImpl extends CrudServiceJpaRepoImpl<Logbook> implements LogbookService {
}
