package by.grickevich.service.impl;

import by.grickevich.models.RepairBill;
import by.grickevich.service.CrudServiceJpaRepoImpl;
import by.grickevich.service.interfaces.RepairBillService;
import org.springframework.stereotype.Service;

@Service
public class RepairBillServiceImpl extends CrudServiceJpaRepoImpl<RepairBill> implements RepairBillService {
}
