package project.sw;

public class Student {

    private String nationalId;
    private String firstName;
    private String lastName;
    private String password;
    private String major;
    private String gender;

    // Constructor
  public Student(String firstName,
               String lastName,
               String nationalId,
               String password,
               String gender,
               String major) {

    this.firstName = firstName;
    this.lastName = lastName;
    this.nationalId = nationalId;
    this.password = password;
    this.gender = gender;
    this.major = major;
}

    // Getters and Setters

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}