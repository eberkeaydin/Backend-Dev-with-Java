public class Employee{
        String name;
        double salary;
        int workHour;
        int hireYear;

        public Employee(String name, double salary, int workHour, int hireYear){
            this.name = name;
            this.salary = salary;
            this.workHour = workHour;
            this.hireYear = hireYear;
        }

        public double tax(){
            double taxRate;
            if (this.salary < 1000 ){
                taxRate = 0;
            }
            else {
                taxRate = 0.03;
            }
            return this.salary * taxRate;
        }

        public int bonus(){
            int bonusHourPrice;
            if (this.workHour < 40){
                bonusHourPrice = 0;
            }
            else {
                bonusHourPrice = 30;
            }
            return  (this.workHour - 40) * bonusHourPrice;

        }

        public double raiseSalary(){
            int currentWorkYear = 2021 - this.hireYear + 1;
            if (currentWorkYear <= 10){
                return this.salary + this.salary * 0.05;
            }
            else if(currentWorkYear > 10 && currentWorkYear <= 20){
                return this.salary + this.salary * 0.1;
            }
            else {
                return this.salary + this.salary * 0.15;
            }

        }

        public String toString(){
            return "Name : " + this.name + "\n" +
                    "Salary : " + this.salary + "\n" +
                    "Work hour: " + this.workHour + "\n" +
                    "Hire year: " + this.hireYear + "\n" +
                    "Tax: " + tax() + "\n" +
                    "Bonus: " + bonus() + "\n" +
                    "Salary increment: " + (raiseSalary() - bonus()) + "\n" +
                    "New salary : " + raiseSalary();
        }
}