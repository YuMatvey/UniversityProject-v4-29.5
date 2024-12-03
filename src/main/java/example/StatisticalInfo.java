package example;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class StatisticalInfo {

    public List<StatisticsEntry> getStatisticsEntryList() {
        return statisticsEntryList;
    }

    @XmlElement(name = "statisticsEntry")
    private List<StatisticsEntry> statisticsEntryList;

    public StatisticalInfo() {
    }

    public StatisticalInfo(List<StatisticsEntry> statisticsEntryList) {
        this.statisticsEntryList = statisticsEntryList;
    }

    public void setStatisticsEntryList(List<StatisticsEntry> statisticsEntryList) {
        this.statisticsEntryList = statisticsEntryList;
    }

}
