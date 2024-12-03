package example;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class UniversitiesInfo {
    @XmlElement(name = "universityEntry")
    private List<UniversityEntry> universityEntries;

    public void setUniversityEntries(List<UniversityEntry> universityEntries) {
        this.universityEntries = universityEntries;
    }
    public UniversitiesInfo() {}

    public UniversitiesInfo(List<UniversityEntry> universityEntries) {
        this.universityEntries = universityEntries;
    }

    public List<UniversityEntry> getUniversityEntries() {
        return universityEntries;
    }

}
