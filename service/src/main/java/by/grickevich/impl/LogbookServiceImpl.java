package by.grickevich.impl;

import by.grickevich.CrudServiceJpaRepoImpl;
import by.grickevich.models.Logbook;
import by.grickevich.interfaces.LogbookService;
import org.springframework.stereotype.Service;

@Service
public class LogbookServiceImpl extends CrudServiceJpaRepoImpl<Logbook> implements LogbookService {
}
