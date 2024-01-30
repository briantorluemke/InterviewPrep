public class AbstractPractice {
    abstract class Employee {
        public abstract String doWork();
    }

    class Accountant extends Employee {

        // Always have to define doWork method from abstract class.
        @Override
        public String doWork() {
            return "Crunching numbers";
        }
    }

}
