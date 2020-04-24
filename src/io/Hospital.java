package io;

import data.Patient;

import java.util.Scanner;

public class Hospital {
    private final int patientNumber = 2;
    private  Patient [] patients = new Patient[patientNumber];
    private  int patientsInHospital = 0;
    private Scanner scan = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String documentID;
    private final int EXIT = 0;
    private final int ADD_PATIENT = 1;
    private final int SHOW_PATIENT = 2;
    private int option;


    public void addPatientToHospital(){
        if(patientNumber > patientsInHospital){
            System.out.println("First Name: ");
            firstName = scan.nextLine();
            System.out.println("Last Name: ");
            lastName = scan.nextLine();
            System.out.println("Document ID: ");
            documentID = scan.nextLine();
            patients[patientsInHospital] = new Patient (firstName,lastName,documentID);

            System.out.println("Patient number: "+(patientsInHospital+1)+ " added with data: "+patients[patientsInHospital]);
            patientsInHospital ++;
        }else{
            System.out.println("We have full list for patients today.");
        }
    }

    public void showPatientsList(){
        for(int i = 0 ; i<patientsInHospital;i++){
            System.out.println(patients[i]);
        }
        if(patientsInHospital == 0){
            System.out.println("We don't have any patient on list yet");
        }
    }

    public int userChoice(){
        showOptions();
        option = scan.nextInt();
        scan.nextLine();
        switch (option){
            case EXIT:
                System.out.println("Bye Bye!");
                break;
            case ADD_PATIENT:
                addPatientToHospital();
                break;
            case SHOW_PATIENT:
                showPatientsList();
                break;
            default:
                System.out.println("We don't have that option");
        }
        return option;
    }

    private void showOptions(){
        System.out.println("Choose option:\n" +
                "0 - EXIT\n" +
                "1 - ADD PATIENT\n" +
                "2 - SHOW PATIENTS");

    }

}
