package hospital;

public class HospitalApp {

    public static void main(String[] args) {

        Doctor jane = new Doctor("1111", "Jane", "skin");
        Nurse florence = new Nurse("2222", "Florence", 5);
        Surgeon ben = new Surgeon ("3333", "Ben",  "nervous system", true);
        Janitor will = new Janitor("4444", "Will", "in patient", true);
        Receptionist barb = new Receptionist("5555", "Barb", "emergency", true);


        Hospital myHospital = new Hospital();

        myHospital.hire(jane);
        myHospital.hire(florence);
        myHospital.hire(ben);
        myHospital.hire(will);
        myHospital.hire(barb);

        Patient patient1 = new Patient();
        Patient patient2 = new Patient(5,10);
        Patient patient3 = new Patient();

        myHospital.admit(patient1);
        myHospital.admit(patient2);
        myHospital.admit(patient3);

        System.out.println("Here are all the medical professionals:");
        //you will need to add a toString method to each employee class to return the properties instead of the object hash code
        System.out.println(myHospital.getMedicalEmployees());


    }
}
