package data;

public class Patient {
    private String firstName;
    private String lastName;
    private String documentID;

    public Patient(String firstName, String lastName, String documentID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentID = documentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocumentID() {
        return documentID;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", documentID='" + documentID + '\'' +
                '}';
    }
}
