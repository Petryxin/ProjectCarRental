package by.grickevich;

import by.grickevich.models.Passport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
public class PassportRepository implements IPassportRepository {
    
    @Autowired
    private EntityManager entityManager;

    @Override
    public Passport getPassportById(Long id) {
        return entityManager.find(Passport.class,id);
    }

    @Override
    public Passport createPassport(Passport readValue){
        entityManager.persist(readValue);
        return readValue;
    }

    @Override
    public List<Passport> getAllPassport() {
        CriteriaQuery<Passport> query = entityManager.getCriteriaBuilder().createQuery(Passport.class);
        query.from(Passport.class);
        return entityManager.createQuery(query).getResultList();
    }
}
