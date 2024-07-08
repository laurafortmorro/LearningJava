package protocoloTCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        String servidorIP = "localhost";
        int puerto = 5000;
        boolean continuarConectado= true;
        Socket socket;
        BufferedReader entrada;
        PrintWriter salida;


        try {
            // Configura la entrada y salida para comunicarse con el servidor
            socket = new Socket(servidorIP, puerto);
            entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            salida = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);

            System.out.println("STATUS: Conectado al servidor");

            while (continuarConectado) {
                // Solicita al usuario ingresar un texto para enviar al servidor
                System.out.print("Introduzca un texto a enviar (FIN para acabar): ");
                String mensaje = scanner.nextLine();

                // Envía el mensaje al servidor
                salida.println(mensaje);

                System.out.println("STATUS: Enviando " + mensaje);
                // Muestra el eco del mensaje recibido del servidor
                System.out.println("echo: " + entrada.readLine());

                continuarConectado= !mensaje.equals("FIN");
            }
            entrada.close();
            salida.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

