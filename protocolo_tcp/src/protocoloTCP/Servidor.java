package protocoloTCP;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String[] args) {
        int puerto = 5000;

        try {
            ServerSocket servidorSocket = new ServerSocket(puerto);
            System.out.println("Servidor esperando conexiones en el puerto " + puerto);

                // Espera a que un cliente se conecte y acepta la conexión
                Socket socketCliente = servidorSocket.accept();
                System.out.println("Cliente conectado");

                // Configura la entrada y salida para comunicarse con el cliente
                BufferedReader entrada = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
                PrintWriter salida = new PrintWriter(socketCliente.getOutputStream(), true);

                System.out.println("STATUS: Conectado al servidor");
                String mensaje= " ";

                // Lee mensajes del cliente hasta recibir "FIN"
                while (!mensaje.equals("FIN")) {
                    mensaje= entrada.readLine();
                    System.out.println("STATUS: Enviando " + mensaje);
                    // Envía el mensaje de vuelta al cliente como eco
                    salida.println(mensaje);
                    System.out.println("echo: " + mensaje);
                }

                System.out.println("Cliente desconectado");
                entrada.close();
                salida.close();
                socketCliente.close();
                servidorSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


