package example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class JsonUtil {
    private static final Logger logger = LoggerFactory.getLogger(JsonUtil.class);
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static <T> String toJson(List<T> collection) throws Exception {
        logger.debug("Сериализация коллекции объектов в JSON.");
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(collection);
        logger.info("Коллекция успешно сериализована в JSON.");
        return json;
    }

    public static <T> List<T> fromJson(String json, Class<T[]> clazz) throws Exception {
        logger.debug("Десериализация JSON в коллекцию объектов типа {}.", clazz.getSimpleName());
        T[] array = objectMapper.readValue(json, clazz);
        List<T> result = List.of(array);
        logger.info("JSON успешно десериализован в коллекцию объектов типа {}.", clazz.getSimpleName());
        return result;
    }
}

