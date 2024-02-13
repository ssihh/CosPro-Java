#### extends
extends Job { 소문자e로 시작 | 뒤에 s | 소괄호 없이 바로 { 붙음


    class Solution {
      class Job {
          public int salary;
  
          public Job() {
              this.salary = 0;
          }
  
          public int getSalary() {
              return salary;
          }
    }

    class PartTimeJob extends Job { 
        public int workHour, payPerHour;

        public PartTimeJob(int workHour, int payPerHour) {
            this.workHour = workHour;
            this.payPerHour = payPerHour;
        }

        public int getSalary() {
            salary = workHour * payPerHour;
            if(workHour >= 40)
                salary += (payPerHour * 8);

            return salary;
        }
    }
