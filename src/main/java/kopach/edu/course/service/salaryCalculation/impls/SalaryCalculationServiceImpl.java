package kopach.edu.course.service.salaryCalculation.impls;

import kopach.edu.course.datastorage.DataFake;
import kopach.edu.course.model.SalaryCalculation;
import kopach.edu.course.model.WorkLoad;
import kopach.edu.course.repository.SalaryCalculationRepository;
import kopach.edu.course.service.salaryCalculation.interfaces.ISalaryCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryCalculationServiceImpl implements ISalaryCalculationService {

    @Autowired
    SalaryCalculationRepository salaryCalculationRepository;

    @Autowired
    DataFake dataFake;


    @Override
    public SalaryCalculation create(SalaryCalculation salaryCalculation) {
        return salaryCalculationRepository.save(salaryCalculation);
    }

    @Override
    public SalaryCalculation get(String id) {
        return  salaryCalculationRepository.findById(id).orElse(null);
    }

    @Override
    public SalaryCalculation delete(String id) {
        SalaryCalculation salaryCalculation = this.get(id);
        salaryCalculationRepository.deleteById(salaryCalculation.getId());
        return salaryCalculation;
    }

    @Override
    public SalaryCalculation update(SalaryCalculation salaryCalculation) {
        return salaryCalculationRepository.save(salaryCalculation);
    }

    @Override
    public List<SalaryCalculation> getAll() {
        return salaryCalculationRepository.findAll();
    }

    public void reloadDataBase()
    {
        dataFake.init();
    }
}
