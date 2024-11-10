package task1;

public class Employee {

        private int empId;
        private String phone;
        private String name;
        private int experience;

        public Employee(int empId, String phone, String name, int experience) {
            this.empId = empId;
            this.phone = phone;
            this.name = name;
            this.experience = experience;
        }
        public int getEmpId() {
            return empId;
        }
        public String getPhone() {
            return phone;
        }
        public String getName() {
            return name;
        }
        public int getExperience() {
            return experience;

        }
        public String toString() {
            return "Employee [empId=" + empId + ", phone=" + phone + ", name=" + name + ", experience=" + experience + "]";
        }


}
