package example;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class Root {
    @XmlElement(name = "studentsInfo")
    private StudentsInfo studentsInfo;

    @XmlElement(name = "universitiesInfo")
    private UniversitiesInfo universitiesInfo;

    @XmlElement(name = "statisticalInfo")
    private StatisticalInfo statisticalInfo;

    @XmlElement(name = "processedAt")
    private String processedAt;

    public void setStudentsInfo(StudentsInfo studentsInfo) {
        this.studentsInfo = studentsInfo;
    }

    public void setUniversitiesInfo(UniversitiesInfo universitiesInfo) {
        this.universitiesInfo = universitiesInfo;
    }

    public void setStatisticalInfo(StatisticalInfo statisticalInfo) {
        this.statisticalInfo = statisticalInfo;
    }

    public void setProcessedAt(String processedAt) {
        this.processedAt = processedAt;
    }

    public StudentsInfo getStudentsInfo() {
        return studentsInfo;
    }

    public UniversitiesInfo getUniversitiesInfo() {
        return universitiesInfo;
    }

    public StatisticalInfo getStatisticalInfo() {
        return statisticalInfo;
    }

    public String getProcessedAt(String s) {
        return processedAt;
    }
}
