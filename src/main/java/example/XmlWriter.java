package example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class XmlWriter {
    private static final Logger logger = LoggerFactory.getLogger(XmlWriter.class);
    private final String directoryPath;

    public XmlWriter(String directoryPath) {
        this.directoryPath = directoryPath;
        createDirectory();
    }

    private void createDirectory() {
        File directory = new File(directoryPath);
        if (!directory.exists() && directory.mkdirs()) {
            logger.info("Директория {} успешно создана.", directoryPath);
        } else if (!directory.exists()) {
            logger.error("Не удалось создать директорию {}.", directoryPath);
        } else {
            logger.info("Директория {} уже существует.", directoryPath);
        }
    }

    public <T> void writeToXml(T object, String fileNamePrefix) {
        try {
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String fileName = directoryPath + File.separator + fileNamePrefix + "_" + timeStamp + ".xml";

            JAXBContext context = JAXBContext.newInstance(object.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(object, new File(fileName));
            logger.info("XML-файл успешно создан: {}", fileName);
        } catch (Exception e) {
            logger.error("Ошибка при создании XML-файла: {}", e.getMessage(), e);
        }
    }
}

