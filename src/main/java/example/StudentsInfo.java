package example;

import jakarta.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "studentsInfo")
@XmlAccessorType(XmlAccessType.FIELD)

public class StudentsInfo {
    @XmlElement(name = "studentEntry")
    private List<StudentEntry> studentEntries;

    public StudentsInfo(List<StudentEntry> studentEntries) {
        this.studentEntries = studentEntries;
    }
    public StudentsInfo() {}

    public List<StudentEntry> getStudentEntries() {
        return studentEntries;
    }

    public void setStudentEntries(List<StudentEntry> studentEntries) {
        this.studentEntries = studentEntries;
    }
}

