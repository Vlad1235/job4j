package ru.job4j;

public class Surgeon extends Doctor {
        Doctor premed = new Doctor(1,10);
        Doctor premed2 = new Doctor(1,5);
        Profession premed3 = new Profession("Ivan", "Ivanov", "high", 122589);

        @Override
        public int getExperience() {
                return super.getExperience();
        }

        @Override
        public String getEducation() {
                return super.getEducation();
        }

        @Override
        public int getQuantityOfPatiens() {
                return super.getQuantityOfPatiens();
        }
}
