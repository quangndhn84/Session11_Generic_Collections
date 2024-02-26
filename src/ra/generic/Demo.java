package ra.generic;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        EnglishDitionary<String,String> ditionary1 = new EnglishDitionary<>("Study","Học");
        System.out.printf("Nghĩa của từ %s là %s\n",ditionary1.getKey(),ditionary1.getValue());
        EnglishDitionary<Integer,String> ditionary2 = new EnglishDitionary<>(1,"Một");
        System.out.printf("Nghĩa của số %d là %s\n",ditionary2.getKey(),ditionary2.getValue());

        MethodGeneric md = new MethodGeneric();
        Integer[] arrInt = {1,3,5,7};
        String[] arrString = {"Nguyễn Văn A", "Nguyễn Văn B"};
        md.printElementOfArray(arrInt);
        md.printElementOfArray(arrString);

        Map<Integer,Employee> mapEmployee = new HashMap<>();
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        mapEmployee.put(1,emp1);
        mapEmployee.put(1,emp2);
        System.out.println(mapEmployee.size());

    }

    public List<? extends Object> getData(){
        List<Employee> listEmp = new ArrayList<>();
        List<Leader> listLeader = new ArrayList<>();
        List<Person> listPerson = new ArrayList<>();
        return listPerson;
    }
}
