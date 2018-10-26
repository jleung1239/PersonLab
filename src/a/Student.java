package a;

public class Student extends Person {
    private int gpa;
    private String club, major;
    public Student(int gpa, String club, String major, String firstName, String familyName)
    {
        super(firstName, familyName);
        this.gpa = gpa;
        this.club = club;
        this.major = major;
    }
    public int getGpa()
    {
        return gpa;
    }
    @Override
    public String toString()
    {
        return getFirstName() + " " + getFamilyName();
    }
    public String getClub()
    {
        return (club);
    }
    public String getMajor()
    {
        return major;
    }
}
