package app;

import io.Hospital;

public class HospitalApp {
    public static void main(String[] args) {
        int option;
        Hospital hospital = new Hospital();

        do{
            option = hospital.userChoice();

        }while(option != 0);
    }
}
