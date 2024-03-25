package GL_303_9.inheritance_303_9_2;

public class Hospital {
    public static void main(String[] args) {
        Surgeon s = new Surgeon();
        s.DoctorDetails();
        s.SurgeonDetails();

        System.out.println("Dr. Department: " + s.DoctorName);
        System.out.println("Dr. Name: " + s.DoctorName);
    }
}
