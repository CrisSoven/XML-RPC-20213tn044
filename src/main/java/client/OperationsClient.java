//Cristopher Soto Ventura - 4B
package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class OperationsClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));

        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        Scanner teclado = new Scanner(System.in);
        double num1, num2, num3, num4;

        System.out.print("Ingresa el numero uno: ");
        num1 = teclado.nextDouble();
        System.out.print("Ingresa el numero dos: ");
        num2 = teclado.nextDouble();
        System.out.print("Ingresa el numero tres: ");
        num3 = teclado.nextDouble();
        System.out.print("Ingresa el numero cuatro: ");
        num4 = teclado.nextDouble();

        Object[] nums = {num1, num2, num3, num4};
        String response = (String)
                client.execute("Methods.operations", nums);
        System.out.println(response);
    }
}
