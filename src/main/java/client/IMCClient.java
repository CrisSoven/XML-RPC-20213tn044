//Cristopher Soto Ventura - 4B
package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class IMCClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));

        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        Scanner teclado = new Scanner(System.in);
        String name;
        double peso;
        double altura;

        System.out.print("introduce tu nombre: ");
        name = teclado.nextLine();
        System.out.print("Introduce tu peso en kg: ");
        peso = teclado.nextDouble();
        System.out.print("Introduce tu altura en metros: ");
        altura = teclado.nextDouble();

        Object[] datos = {name, peso, altura};
        String response = (String)
                client.execute("Methods.IMC", datos);
        System.out.println(response);
    }
}
