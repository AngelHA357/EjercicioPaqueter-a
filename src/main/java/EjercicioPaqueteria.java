/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import com.mycompany.CambioMoneda.AdaptadorDolar;
import com.mycompany.CambioMoneda.SistemaDolares;
import com.mycompany.CambioMoneda.SistemaPesos;
import com.mycompany.Paquete.CajaGrande;
import com.mycompany.Paquete.CajaMediana;
import com.mycompany.Paquete.CajaPequenia;
import com.mycompany.Paquete.Paquete;
import com.mycompany.Paquete.Sobre;
import com.mycompany.Pedido.Pedido;
import com.mycompany.builder.PedidoBuilder;
import com.mycompany.Servicio.TipoServicio;
import com.mycompany.Transporte.TransportFactory;
import com.mycompany.Transporte.Transporte;
import com.mycompany.builder.IPedidoBuilder;
import com.mycompany.builder.PedidoDirector;
import java.util.Scanner;

/**
 * Clase principal que implementa la lógica para crear un pedido de paquetería
 * utilizando el patrón Builder y seleccionando el medio de transporte apropiado
 * para la entrega, además de calcular costos en pesos o dólares.
 *
 * @author José Ángel Huerta Amparán
 */
public class EjercicioPaqueteria {

    public static void main(String[] args) {

        // Instancia de Scanner para recibir la entrada del usuario
        Scanner tec = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Se crea un pedido utilizando el builder
            IPedidoBuilder pedidoBuilder = new PedidoBuilder();
            PedidoDirector directorPedido = new PedidoDirector(pedidoBuilder);

            // Selección del tipo de paquete a enviar
            System.out.println("Seleccione el tipo de paquete a enviar");
            System.out.println("1. Sobre");
            System.out.println("2. Caja pequeña");
            System.out.println("3. Caja mediana");
            System.out.println("4. Caja grande");
            int tipoPaquete = tec.nextInt();
            System.out.println();
            System.out.println("-----------------------------------------");

            Paquete paquete = null;
            // Asigna el tipo de paquete basado en la selección del usuario
            switch (tipoPaquete) {
                case 1:
                    paquete = new Sobre();
                    break;
                case 2:
                    paquete = new CajaPequenia();
                    break;
                case 3:
                    paquete = new CajaMediana();
                    break;
                case 4:
                    paquete = new CajaGrande();
                    break;
            }

            // Selección del tipo de servicio (Estandar o Express)
            System.out.println("Seleccione el tipo de servicio");
            System.out.println("1. Estandar");
            System.out.println("2. Express");
            int tipoServicio = tec.nextInt();
            System.out.println();

            TipoServicio servicio = null;
            // Asigna el tipo de servicio basado en la selección del usuario
            switch (tipoServicio) {
                case 1:
                    servicio = TipoServicio.ESTANDAR;
                    break;
                case 2:
                    servicio = TipoServicio.EXPRESS;
                    break;
            }

            // Ingreso de la distancia (en kilómetros) para el envío
            System.out.println("Ingrese la distancia (km) del recorrido");
            double distancia = tec.nextDouble();

            // Se construye el pedido utilizando el director
            Pedido pedido = directorPedido.construirPedido(paquete, distancia, servicio);

            // Se selecciona el transporte adecuado basado en el paquete, servicio y distancia
            TransportFactory transportFactory = new TransportFactory();
            Transporte transporte = transportFactory.getStrategy(pedido.getPaquete(), pedido.getTipoServicio(), pedido.getDistancia());
            pedido.setTransporte(transporte);

            // Se calculan el costo total y el tiempo estimado de entrega
            double costoTotal = pedido.calcularCostoTotal();
            String costoString = "";
            double tiempoEntrega = pedido.calcularTiempoEntrega();
            String medioTransporte = pedido.getTransporte().getNombre();

            // Selección de la moneda (pesos o dólares) para mostrar el costo
            System.out.println("Seleccione el tipo de moneda en el que desea ver el costo total del pedido (1.MXN o 2.USD)");
            SistemaPesos peso = new SistemaPesos();

            int tipoMoneda = tec.nextInt();
            // Conversión del costo a la moneda seleccionada
            if (tipoMoneda == 1) {
                costoTotal = peso.getValor(costoTotal);
                costoString = String.valueOf(costoTotal) + " pesos";
            } else if (tipoMoneda == 2) {
                SistemaDolares sistemaDolares = new AdaptadorDolar(peso);
                costoTotal = sistemaDolares.calcularValorEnDolares(costoTotal);
                costoString = String.valueOf(costoTotal) + " dólares";
            }

            // Mostrar el resultado final al usuario
            System.out.println();
            System.out.println("-----------------------------------------");
            System.out.println("El costo del servicio es de " + costoString + ", se entregará en "
                    + medioTransporte + " en un tiempo aproximado de " + tiempoEntrega + " minutos.");

            // Opción para volver a correr el menú
            System.out.print("¿Desea volver al menú? (s/n): ");
            char respuesta = tec.next().charAt(0);
            continuar = (respuesta == 's' || respuesta == 'S');

        }
    }
}
