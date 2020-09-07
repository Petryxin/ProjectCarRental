package by.grickevich.impl;

import by.grickevich.CrudServiceJpaRepoImpl;
import by.grickevich.models.RepairBill;
import by.grickevich.interfaces.RepairBillService;
import org.springframework.stereotype.Service;

@Service
public class RepairBillServiceImpl extends CrudServiceJpaRepoImpl<RepairBill> implements RepairBillService {
}
