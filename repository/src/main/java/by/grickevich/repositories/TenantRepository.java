package by.grickevich.repositories;


import by.grickevich.models.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantRepository extends JpaRepository<Tenant,Integer> {
}