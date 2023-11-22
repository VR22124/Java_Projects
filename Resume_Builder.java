import java.util.Scanner;

public class ResumeBuilder {
    public static void main(String[] args) {
        PersonalInformation personalInfo = new PersonalInformation();
        personalInfo.collectInformation();

        Education education = new Education();
        education.collectInformation();

        Experience experience = new Experience();
        experience.collectInformation();

        Skills skills = new Skills();
        skills.collectInformation();

        System.out.println("\nGenerated Resume:");
        personalInfo.displayInformation();
        education.displayInformation();
        experience.displayInformation();
        skills.displayInformation();
    }
}

class PersonalInformation {
    private String name;
    private String email;
    private String phone;

    public void collectInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        this.name = scanner.nextLine();

        System.out.println("Enter your email:");
        this.email = scanner.nextLine();

        System.out.println("Enter your phone number:");
        this.phone = scanner.nextLine();
    }

    public void displayInformation() {
        System.out.println("\nPersonal Information:");
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phone);
    }
}

class Education {
    private String degree;
    private String institution;
    private int graduationYear;

    public void collectInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter your highest degree:");
        this.degree = scanner.nextLine();

        System.out.println("Enter the institution:");
        this.institution = scanner.nextLine();

        System.out.println("Enter graduation year:");
        this.graduationYear = scanner.nextInt();
    }

    public void displayInformation() {
        System.out.println("\nEducation:");
        System.out.println("Degree: " + this.degree);
        System.out.println("Institution: " + this.institution);
        System.out.println("Graduation Year: " + this.graduationYear);
    }
}

class Experience {
    private String jobTitle;
    private String company;
    private int yearsOfExperience;

    public void collectInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter your job title:");
        this.jobTitle = scanner.nextLine();

        System.out.println("Enter the company name:");
        this.company = scanner.nextLine();

        System.out.println("Enter years of experience:");
        this.yearsOfExperience = scanner.nextInt();
    }

    public void displayInformation() {
        System.out.println("\nExperience:");
        System.out.println("Job Title: " + this.jobTitle);
        System.out.println("Company: " + this.company);
        System.out.println("Years of Experience: " + this.yearsOfExperience);
    }
}

class Skills {
    private String[] skills;

    public void collectInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter your skills (comma-separated):");
        String skillsInput = scanner.nextLine();
        this.skills = skillsInput.split(",\\s*");
    }

    public void displayInformation() {
        System.out.println("\nSkills:");
        for (String skill : this.skills) {
            System.out.println(skill);
        }
    }
}
