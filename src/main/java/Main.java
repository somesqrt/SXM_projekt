

import org.example.model.TabakovyPriemysel;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser saxParser = spf.newSAXParser();
        XMLReader xmlReader = saxParser.getXMLReader();
        MyHandler handler = new MyHandler();
        xmlReader.setContentHandler(handler);
        xmlReader.parse("S:\\Vysoka skola\\SXM\\SXM\\XML.xml");

        TabakovyPriemyselforParsing tabakovyPriemyselforParsing = handler.getTabakovyPriemyselforParsing();

        tabakovyPriemyselforParsing.companyList.forEach(System.out::println);



    }

    private static class MyHandler extends DefaultHandler{
        static final String PRIEMYSEL = "TabakovyPriemysel";
        static final String COMPANY = "Company";

        private TabakovyPriemyselforParsing tabakovyPriemyselforParsing;

        Company curentCompany;
        private String curentELement;

        TabakovyPriemyselforParsing getTabakovyPriemyselforParsing() {return tabakovyPriemyselforParsing;}

        public void startDocument() throws SAXException {
            System.out.println("Starting XML parsig...");
        }

        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
            curentELement = qName;

            switch (curentELement){
                case PRIEMYSEL: {

                    tabakovyPriemyselforParsing = new TabakovyPriemyselforParsing();
                    tabakovyPriemyselforParsing.companyList = new ArrayList<Company>();

                }break;
                case COMPANY:{
                    curentCompany = new Company();
                }break;
                case "Celkovy_penazny_brat":{
                    curentCompany.brat = new Company.Brat();
                    curentCompany.brat.rok = attributes.getValue("rok");

                }break;
                case "Cisty_zisk":{
                    curentCompany.zisk = new Company.Zisk();
                    curentCompany.zisk.rok = attributes.getValue("rok");
                }break;

            }
        }

        public void characters(char[] ch, int start, int lenght) throws SAXException{
            String text = new String(ch,start,lenght);

            if(text.contains("<") || curentELement == null){
                return;
            }

            switch (curentELement){
                case "Nazov":{

                    curentCompany.Nazov = text;
                    curentELement = "";
                }break;
                case "Rok_zalozenia":{

                    curentCompany.Rok_zalozenia = text;
                    curentELement = "";
                }break;
                case "Ustredie":{

                    curentCompany.Ustredie = text;
                    curentELement = "";
                }break;
                case "Celkovy_penazny_brat":{

                    curentCompany.brat.hodnota = text;
                    curentELement = "";
                }break;
                case "Cisty_zisk":{

                    curentCompany.zisk.hodnota = text;
                    curentELement = "";
                }break;
                case "Stranka":{

                    curentCompany.Stranka = text;
                    curentELement = "";
                }break;

                default:{

                }

            }
        }

        public void endElement(String uri, String localName, String qName) throws SAXException{
            switch (qName){
                case COMPANY:{

                    tabakovyPriemyselforParsing.companyList.add(curentCompany);
                    curentCompany = null;
                }break;

                default:{

                }
            }

        }
        public void endDocument() throws SAXException{
            System.out.println("XML parsing is completed.");
        }

    }

    static class TabakovyPriemyselforParsing {
        String nazov;
        List<Company> companyList;
    }

    static class Company {
        String Nazov;
        String Rok_zalozenia;
        String Ustredie;
        Brat brat;
        Zisk zisk;
        String Stranka;

        static class Brat {
            String hodnota;

            String rok;

        }

        static class Zisk {

            String hodnota;

            String rok;
        }

        @Override
        public String toString() {
            return "Company{" +
                    "Nazov='" + Nazov + '\'' +
                    ", Rok_zalozenia='" + Rok_zalozenia + '\'' +
                    ", Ustredie='" + Ustredie + '\'' +
                    ", brat=" + brat.hodnota +
                    ", zisk=" + zisk.hodnota +
                    ", Stranka='" + Stranka + '\'' +
                    '}';
        }
    }
}
