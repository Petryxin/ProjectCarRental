package by.grickevich.service.impl;

import by.grickevich.models.Tenant;
import by.grickevich.service.CrudServiceJpaRepoImpl;
import by.grickevich.service.interfaces.TenantService;
import org.springframework.stereotype.Service;

@Service
public class TenantServiceImpl extends CrudServiceJpaRepoImpl<Tenant> implements TenantService {
}
