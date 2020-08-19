package kopach.edu.course.form;

public class GroupForm {
    private String id;
    private String name;
    private String specialty;
    private String description;

    public GroupForm() {
    }

    public GroupForm(String name, String specialty, String description) {
        this.name = name;
        this.specialty = specialty;
        this.description = description;
    }

    public GroupForm(String id, String name, String specialty, String description) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "GroupForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
