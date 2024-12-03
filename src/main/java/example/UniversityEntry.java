package example;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class UniversityEntry {

    @XmlElement(name = "universityId")
    private String universityId;

    @XmlElement(name = "universityName")
    private String universityName;

    @XmlElement(name = "universityProfile")
    private String universityProfile;

    public UniversityEntry() {
    }

    public UniversityEntry(String universityId, String universityName, String universityProfile) {
        this.universityId = universityId;
        this.universityName = universityName;
        this.universityProfile = universityProfile;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void setUniversityProfile(String universityProfile) {
        this.universityProfile = universityProfile;
    }

    public String getUniversityId() {
        return universityId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getUniversityProfile() {
        return universityProfile;
    }
}
