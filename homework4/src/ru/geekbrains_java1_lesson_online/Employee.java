package ru.geekbrains_java1_lesson_online;

public class Employee {
    //Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
    //Конструктор класса должен заполнять эти поля при создании объекта;
    //Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    //Вывести при помощи методов из пункта 3 ФИО и должность.
    //Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
    //* Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
    //* Подсчитать средние арифметические зарплаты и возраста
    //*** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный идентификационный порядковый номер
    String fullName;
    String position;
    int phone;
    int salary;
    int age;
    System.out.println("ФИО" + employee1.getFullName() + "должность" + employee.getPosition());

    public String getFullName() {
        return fullName;
    }
    public String getPosition() {
        return position;
    }
    public int getPhone() {
        return phone;
    }
    public int getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }

    public static int salaryIncrease() {
        for (int i = 0; i<5; i++) {
            if (employee.age[i] > 45) {
                employee.salary = employee.salary + 5000;
            }
            }
        }
    }


    public Employee(String this.fullName, String this.position, int this.phone, int this.salary, int this.age String иванов_иван_иванович, String менеджер, int i, int i1, int i2) {
        fullName = this.fullName;
        position = this.position;
        phone = this.phone;
        salary = this.salary;
        age = this.age;
    }
}
