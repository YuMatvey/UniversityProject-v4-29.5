package example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JsonWriter {
    private static final Logger logger = LoggerFactory.getLogger(JsonWriter.class);
    private final String directoryPath;

    public JsonWriter(String directoryPath) {
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

    public <T> void writeToJson(T object, String fileNamePrefix) {
        try {
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String fileName = directoryPath + File.separator + fileNamePrefix + "_" + timeStamp + ".json";

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(fileName), object);

            logger.info("JSON-файл успешно создан: {}", fileName);
        } catch (Exception e) {
            logger.error("Ошибка при создании JSON-файла: {}", e.getMessage(), e);
        }
    }
}

