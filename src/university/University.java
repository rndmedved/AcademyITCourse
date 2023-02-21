package university;

public class University {
    private String name;
    private String universityInfo;

    private Student[] students;

    public University(String name, String universityInfo) {
        this.name = name;
        this.universityInfo = universityInfo;
    }

    public String getName() {
        return name;
    }

    public String getUniversityInfo() {
        return universityInfo;
    }

    public void setStudent(String[] studentNames){
        students = new Student[studentNames.length];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(studentNames[i]);
        }
    }
    public void showGoodStudents(){
        System.out.println("Список студентов со средним баллом 4 и выше:");
        for (Student student : students) {
            if (student.getGPA() > 4){
                System.out.println(student);
            }
        }

    }

    public double averageGPA(){
        double sum = 0;
        for (Student student : students) {
            sum += student.getGPA();
        }
        return  sum / students.length;
    }


}
