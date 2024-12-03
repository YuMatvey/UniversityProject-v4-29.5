package example;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class StudentEntry {
    @XmlElement(name = "studentName")
    private String studentName;

    @XmlElement(name = "universityId")
    private String universityId;

    @XmlElement(name = "avgScore")
    private double avgScore;

    public String getStudentName() {
        return studentName;
    }

    public String getUniversityId() {
        return universityId;
    }
    public StudentEntry() {}

    public StudentEntry(String studentName, String universityId, double avgScore) {
        this.studentName = studentName;
        this.universityId = universityId;
        this.avgScore = avgScore;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public double getAvgScore() {
        return avgScore;
    }
}
