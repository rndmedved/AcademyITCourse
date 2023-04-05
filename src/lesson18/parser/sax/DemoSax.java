package lesson18.parser.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class DemoSax extends DefaultHandler {
    static StringBuilder builder;
    /**
     * Данный метод запускается, когда парсер встретил тэг xml
     * @param uri
     * @param localName
     * @param qName
     * @param attributes
     * @throws SAXException
     */
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        builder.append("Элемент").append(qName).append("Открыт");
        if(attributes.getLength()!=0){
            for(int i = 0; i < attributes.getLength(); i++){
                builder.append("/nAttribut").append(attributes.getLocalName(i)).append(",Value");
            }
        }
        //        super.startElement(uri, localName, qName, attributes);
    }

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        builder = new StringBuilder();
        File file = new File("books.xml");
        SAXParserFactory factory = SAXParserFactory.newInstance();
        var parser = factory.newSAXParser();
        parser.parse(file, new DemoSax());
        System.out.println(builder);
    }
}
