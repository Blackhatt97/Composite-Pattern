package EmployeeEx;

import java.util.SortedMap;

public class Company {

    public static void main(String[] args) {

        //Some employees of a company and the CEO
        Employee emp1 = new Employee("John",
                50,
                120000,
                "CEO");
        Employee emp2 = new Employee("Doe",
                34,
                1200,
                "CTO");
        Employee emp3 = new Employee("Bill",
                20,
                12,
                "Son of CTO");
        Employee emp4 = new Employee("Alice",
                30,
                1200,
                "CFO");
        Employee emp5 = new Employee("Jonathan",
                44,
                1000,
                "Board member");
        Employee emp6 = new Employee("Dough",
                20,
                100,
                "Security");
        Employee emp7 = new Employee("John",
                50,
                1000,
                "Board member");
        //Designing the hierarchy of the company
        //CEO Subordinates
        emp1.addEmployee(emp2);
        emp1.addEmployee(emp4);

        //CTO subordinates

        emp2.addEmployee(emp3);

        //CFO subordinates

        emp4.addEmployee(emp5);
        emp4.addEmployee(emp7);

        //Son of CTO subordinates
        emp3.addEmployee(emp6);


        //Prints

        System.out.println("Individual object");
        System.out.println("Security guy");
        System.out.println(emp6.print());

        System.out.println("=============================");

        System.out.println("Groups of objects");
        System.out.println("Son of CTO: ");
        System.out.println(emp3.print());

        System.out.println("=============================");

        System.out.println("CFO subordinates: ");
        System.out.println(emp4.print());

        System.out.println("=============================");

        System.out.println("CTO subordinates: ");
        System.out.println(emp2.print());

        System.out.println("=============================");
        System.out.println("CEO subordinates: ");
        System.out.println(emp1.print());

    }
}
