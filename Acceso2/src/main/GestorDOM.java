package main;
import java.io.File;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class GestorDOM {

	private Document doc;

	public int abrirXmlDom(File fichero) {
		doc = null;

		try {
			// nueva instancia de la factoria
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			// para que ignore comentarios en xml
			factory.setIgnoringComments(true);
			// para que ignore espacios en blanco redundantes en el xml
			factory.setIgnoringElementContentWhitespace(true);
			// para que no valide el documento xml segun un schema
			factory.setValidating(false);
			// Creamos el builder con la factoria recien creada
			DocumentBuilder builder = factory.newDocumentBuilder();
			// Construimos el documento pasado por parametro
			doc = builder.parse(fichero);
			// si llega hasta aqui el proceso, ha funcionado, así que devolvemos 0
			return 0;

		} catch (Exception e) {
			e.printStackTrace();
			// Si captura una excepción, ha fallado al abrir documento, devuelve -1
			return -1;
		}
	}
	
	public String recorrerDOM() {

		String[] datosNodos = null;
		String salida = "";
		Node node;
		// nodo raiz del documento
		Node raiz = doc.getFirstChild();
		// Hijos del nodo raiz
		NodeList nodosHijos = raiz.getChildNodes();
		// recorremos los nodos hijos
		for (int i = 0; i < nodosHijos.getLength(); i++) {
			node = nodosHijos.item(i);
			//comprobamos que el nodo es un elemento y no texto
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				// procesamos el nodo libro en un string
				datosNodos = procesarLibros(node);
				// construimos un string con todos los libros del xml
				salida = salida + "\n publicado en " + datosNodos[0] + 
								  "\n Titulo: " + datosNodos[1] + 
								  "\n Autor: " + datosNodos[2];
			}
		}		
		return salida;
	}

	private String[] procesarLibros(Node node) {
		
		String[] datos = new String[3];
		Node ntm = null;
		// este contador es porque nos vamos a saltar la posicion con el atributo "publicado_en"
		int contador = 1;
		// Cogemos el primer aributo(el unico) y lo guardamos en la posicion 0


		// guardamos los hijos del nodo libro
		NodeList nodos = node.getChildNodes();
		// recorremos los hijos de "libro", que son "titulo" y "autor"
		for (int i = 0; i < nodos.getLength(); i++) {
			ntm = nodos.item(i);
			// comprobamos que no son texto
			if (ntm.getNodeType() == Node.ELEMENT_NODE) {
				// guardamos el valor del texto( que es un nodo) de cada hijo de libro
				datos[contador] = ntm.getChildNodes().item(0).getNodeValue();
				
				/* tambien se puede usar esta linea, pero sabiendo que coge el texto de
				 *  los hijos del nodo ntm.
				*  datos[contador] = ntm.getTextContent();
				*/
				contador++;
			}
		}	
		return datos;
	}
}

	