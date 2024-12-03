package example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        logger.info("Программа запущена.");
        try {
            logger.info("Создание структуры данных...");
            StudentsInfo studentsInfo = new StudentsInfo(List.of(
                    new StudentEntry("Петров П. А.", "0001-high", 5.0),
                    new StudentEntry("Алексеев С. В.", "0001-high", 5.0),
                    new StudentEntry("Соколов В. В.", "0004-high", 4.8),
                    new StudentEntry("Иванов А. Г.", "0001-high", 4.8),
                    new StudentEntry("Васильев В. П.", "0001-high", 4.7),
                    new StudentEntry("Козлов М. В.", "0002-high", 4.6),
                    new StudentEntry("Игнатьев М. М.", "0003-high", 4.3),
                    new StudentEntry("Фёдоров А. И.", "0002-high", 4.2),
                    new StudentEntry("Иванов И. А.", "0002-high", 4.0),
                    new StudentEntry("Витальев В. А.", "0001-high", 4.0),
                    new StudentEntry("Сидоров Е. Г.", "0004-high", 3.9)
            ));

            // Создаём список университетов
            UniversitiesInfo universitiesInfo = new UniversitiesInfo(List.of(
                    new UniversityEntry("0005-high", "Самарский Медицинский Институт", "MEDICINE"),
                    new UniversityEntry("0003-high", "Московский Государственный Медицинский Университет", "MEDICINE"),
                    new UniversityEntry("0002-high", "Московский Придуманный Институт", "PHYSICS"),
                    new UniversityEntry("0007-high", "Казанский Университет Вычислений", "MATHEMATICS"),
                    new UniversityEntry("0001-high", "Московский Выдуманный Университет", "PHYSICS"),
                    new UniversityEntry("0004-high", "Тамбовский Университет Медицины", "MEDICINE"),
                    new UniversityEntry("0006-high", "Воронежский Литературно-Переводческий Университет", "LINGUISTICS")
            ));

            // Создаём статистику
            StatisticalInfo statisticalInfo = new StatisticalInfo(List.of(
                    new StatisticsEntry("LINGUISTICS", 0.0),
                    new StatisticsEntry("MEDICINE", 4.33),
                    new StatisticsEntry("MATHEMATICS", 0.0),
                    new StatisticsEntry("PHYSICS", 4.54)
            ));

            Root root = new Root();
            root.setStudentsInfo(studentsInfo);
            root.setUniversitiesInfo(universitiesInfo);
            root.setStatisticalInfo(statisticalInfo);
            root.setProcessedAt("2021-04-11T18:39:17.285+03:00");
            logger.info("Структура данных успешно создана.");

            XmlWriter xmlWriter = new XmlWriter("xmlReqs");
            xmlWriter.writeToXml(root, "req");

            JsonWriter jsonWriter = new JsonWriter("jsonReqs");
            jsonWriter.writeToJson(root, "reqs");

            logger.info("Генерация файлов завершена");
        } catch (Exception e) {
            logger.error("Ошибка в процессе выполнения программы: {}", e.getMessage(), e);
        }
        logger.info("Программа завершена.");
    }
}
