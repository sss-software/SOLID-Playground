package solid.ocp.taxcalculator.interfaces;

import solid.models.Employee;

public interface TaxCalculator {
    double calculate(Employee employee);
}
