package by.grickevich.impl;

import by.grickevich.CrudServiceJpaRepoImpl;
import by.grickevich.models.Tenant;
import by.grickevich.interfaces.TenantService;
import org.springframework.stereotype.Service;

@Service
public class TenantServiceImpl extends CrudServiceJpaRepoImpl<Tenant> implements TenantService {
}
