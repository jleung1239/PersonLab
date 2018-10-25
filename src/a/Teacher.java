package a;

public class Teacher extends Person{
    private String subject;
    private String title;
    public Teacher(String subject, String title)
    {
        super("Teacher");
        this.subject = subject;
        this.title = title;
    }

    @Override
    public String getSubject()
    {
        return subject;
    }

    @Override
    public String toString()
    {
        return title +"."+ getFamilyName();
    }
}
