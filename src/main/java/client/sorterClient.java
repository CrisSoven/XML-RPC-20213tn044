//Cristopher Soto Ventura - 4B
package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class sorterClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));

        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        Scanner teclado = new Scanner(System.in);
        Integer[] arrayNums = new Integer[5];

        for (int i = 0; i < arrayNums.length; i++) {
            System.out.print("Ingresa el valor "+(i+1)+": ");
            arrayNums[i] = teclado.nextInt();
        }

        Object[] nums = {arrayNums};
        String response = (String)
                client.execute("Methods.sortArray", nums);
        System.out.println(response);

    }
}
