//Cristopher Soto Ventura - 4B
package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;

public class RPCClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {

        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));

        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        Object[] numbers = {5.0, 5.1D}; //5D Double
        //Enviar arreglo, toma en cuenta el numero de parametros a recibir en el metodo

        Double response = (Double)
                client.execute("Methods.addition", numbers);
        System.out.println("Result -> " + response);
    }
}
