package by.grickevich.service;

import by.grickevich.models.RepairBill;
import org.springframework.stereotype.Service;

@Service
public class RepairBillServiceImpl extends CrudServiceJpaRepoImpl<RepairBill> implements RepairBillService {
}
