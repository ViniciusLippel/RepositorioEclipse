package persistencia;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
 
public class XML implements Gravacao {
 
    public static final String xmlFilePath = "agenda.xml";
 
    public void gravar (List<Pessoa> lista) throws IOException {
    	
        try {
        	DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();
            
            Element root = document.createElement("root");
            document.appendChild(root);
            
        	for(Pessoa pessoa : lista) {
	            Element employee = document.createElement("pessoa");
	            Attr attr = document.createAttribute("codigo");
	            attr.setValue(Integer.toString(pessoa.getCodigo()));
	            employee.setAttributeNode(attr);
	            root.appendChild(employee);

	            // nome
	            Element nome = document.createElement("nome");
	            if(pessoa.getNome()!=null) {
	            	nome.appendChild(document.createTextNode(pessoa.getNome()));
	            	employee.appendChild(nome);
	            }
	 
	            // email
	            Element email = document.createElement("email");
	            if(pessoa.getEmail()!=null) {
	            	email.appendChild(document.createTextNode(pessoa.getEmail()));
	            	employee.appendChild(email);
	            }
	         
	            // telefone
	            Element telefone = document.createElement("telefone");
	            if(pessoa.getTelefone()!=null) {
	            	telefone.appendChild(document.createTextNode(pessoa.getTelefone()));
	            	employee.appendChild(telefone);
	            }
	            	
	            // department elements
	            Element dataNasc = document.createElement("dataNasc");
	            if(pessoa.getDataNasc()!=null) {
	            	dataNasc.appendChild(document.createTextNode(Long.toString(pessoa.getDataNasc().getTime())));
	            	employee.appendChild(dataNasc);
	            }
        	}
 
            // create the xml file
            //transform the DOM Object to an XML File
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));
 
            transformer.transform(domSource, streamResult);
            System.out.println("Done creating XML File");
 
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }

	@Override
	public List<Pessoa> ler() {
		List<Pessoa> list = new ArrayList<Pessoa>();
		try {
			
			
			File fXmlFile = new File("agenda.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
					
			doc.getDocumentElement().normalize();
		
			NodeList nList = doc.getElementsByTagName("pessoa");

			for (int temp = 0; temp < nList.getLength(); temp++) {
				Pessoa p = new Pessoa();
				Node nNode = nList.item(temp);
				Element eElement = (Element) nNode;

				p.setCodigo(Integer.parseInt(eElement.getAttribute("codigo")));
				p.setNome(eElement.getElementsByTagName("nome").item(0).getTextContent());
				try {
					p.setEmail(eElement.getElementsByTagName("email").item(0).getTextContent());
				}catch(Exception e) {}
				try {
					p.setTelefone(eElement.getElementsByTagName("telefone").item(0).getTextContent());
				}catch(Exception e) {}
				try {
					Date dt = new Date(Long.parseLong(eElement.getElementsByTagName("dataNasc").item(0).getTextContent()));
					p.setDataNasc(dt);
				}catch(Exception e) {}
				list.add(p);
			}
			
	   	} catch (Exception e) {
			e.printStackTrace();
	    }
		
		
		return list;
	}
}
