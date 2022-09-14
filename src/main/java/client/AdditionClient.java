//Cristopher Soto Ventura - 4B
package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class AdditionClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {

        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));

        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        Scanner teclado = new Scanner(System.in);
        int num1, num2;

        System.out.print("Ingresa un número entero: ");
        num1 = teclado.nextInt();
        System.out.print("Ingresa otro número entero: ");
        num2 = teclado.nextInt();

        Object[] nums = {num1, num2};

        String response = (String)
                client.execute("Methods.sum", nums);

        System.out.println(response);
    }
}
