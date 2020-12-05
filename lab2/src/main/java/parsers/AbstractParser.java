package parsers;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import generated.classes.ObjectFactory;
import generated.classes.Paper;
import parsers.utils.ObjectBuilder;

import java.util.HashMap;

public abstract class AbstractParser {
    static final Logger logger = LoggerFactory.getLogger(DOMParser.class);

    HashMap<String, String> data = new HashMap<>();
    ObjectBuilder objectBuilder = new ObjectBuilder();
    ObjectFactory objectFactory = new ObjectFactory();

    public AbstractParser(){
        objectBuilder.resetID();
    }

    public Paper getObject() {
        return objectBuilder.getPaper();
    }

    public abstract Paper parseXML(String filename);
}
