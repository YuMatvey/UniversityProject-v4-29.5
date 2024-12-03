package example;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class StatisticsEntry {
    @XmlElement(name = "universityProfile")
    private String universityProfile;

    @XmlElement(name = "avgScore")
    private double avgScore;

    public String getUniversityProfile() {
        return universityProfile;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setUniversityProfile(String universityProfile) {
        this.universityProfile = universityProfile;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public StatisticsEntry() {}
    public StatisticsEntry(String universityProfile, double avgScore) {
        this.universityProfile = universityProfile;
        this.avgScore = avgScore;
    }
}
