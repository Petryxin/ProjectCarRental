package by.grickevich.service;

import by.grickevich.models.Tenant;
import org.springframework.stereotype.Service;

@Service
public class TenantServiceImpl extends CrudServiceJpaRepoImpl<Tenant> implements TenantService {
}
