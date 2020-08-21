package by.grickevich.service;

import by.grickevich.models.Logbook;
import org.springframework.stereotype.Service;

@Service
public class LogbookServiceImpl extends CrudServiceJpaRepoImpl<Logbook> implements LogbookService {
}
