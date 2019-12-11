package solid.ocp.taxcalculator;

import solid.models.Employee;
import solid.models.FullTimeEmployee;
import solid.models.Intern;
import solid.models.PartTimeEmployee;
import solid.ocp.taxcalculator.interfaces.TaxCalculator;

public class TaxCalculatorFactory {
    public static TaxCalculator create(Employee employee) {
        if (employee instanceof FullTimeEmployee) {
            return new FullTimeTaxCalculator();
        }

        if (employee instanceof PartTimeEmployee) {
            return new PartTimeTaxCalculator();
        }

        if (employee instanceof Intern) {
            return new InternTaxCalculator();
        }

        throw new RuntimeException("Invalid employee type");
    }
}
