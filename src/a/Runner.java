package a;

public class Runner {

    public static String[] firstNames ={"Sunny","Nathan","Ashley","Henry","Kim","Justin"};
    public static String[] familyNames ={"Chu","Oak","Thunder","River","Sky","Mountain"};

    public static void main(String[] args)
    {
       Student[] students = new Student[34];
        for (int i = 0; i < 34; i++)
        {
            students[i] = randomStudent();
        }
        Teacher teacher = new Teacher("Folwell", "Nathan", "Mr.", "CSA");
        Classroom ourClass = new Classroom(students, teacher);
        ourClass.printClass();
    }

    public static Student randomStudent()
    {
        String firstName = firstNames[(int)(Math.random() * firstNames.length)];
        String familyName = familyNames[(int)(Math.random() * familyNames.length)];
        Double GPA = Math.random() * 4.0;

        Student stu = new Student(firstName, familyName, GPA);
        return stu;
    }

	// declare and initalize a teacher, an array of students, and a classroom
        // print class and print class average
        // randomStudent() builds a random student with a random first name, last name, and GPA

}
