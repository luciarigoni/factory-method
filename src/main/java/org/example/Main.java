package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Transport transport;
    public static void main(String[] args) {

        configure(args[0]);
        if (transport != null){
            runTransport();
        }
    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String type) {
        switch (type) {
            //quando for rodar o projeto, colocar no config program arguments
            case "uber":
                transport = new CarTransport();
                break;
            case "log":
                transport = new MotorcycleTransport();
                break;
            case "eats":
                transport = new BicycleTransport();
                break;
            default:
                System.out.println("Selecione o tipe de entrega.");
        }
    }
}