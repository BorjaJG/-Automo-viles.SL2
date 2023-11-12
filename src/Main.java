import java.util.*;

public class Main {


    public static void main(String[] args) {


        ArrayList<Client> clientArrayList = new ArrayList<>();
        ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();
        ArrayList<Sale> saleArrayList = new ArrayList<>();

        Client client1 = new Client();
        client1.setDni("71453503R");
        client1.setName("M VICTORIA");
        client1.setSurnames("ALVAREZ SANCHEZ");
        client1.setDirection("CALLE LEONARDO PRIETO CASTRO 8, 28040 MADRID");
        clientArrayList.add(client1);
        client1.getDni();
        client1.getName();
        client1.getSurnames();
        client1.getDirection();


        Client client2 = new Client();
        client2.setDni("71453503R");
        client2.setName("SHEILA");
        client2.setSurnames("BORRAJO GUTIERREZ");
        client2.setDirection("CALLE MONTALBAN 1, 28014 MADRID");
        clientArrayList.add(client2);
        client2.getDni();
        client2.getName();
        client2.getSurnames();
        client2.getDirection();


        Client client3 = new Client();
        client3.setDni("71451203R");
        client3.setName("MARÍA");
        client3.setSurnames("CALOCA DE LA RIVA");
        client3.setDirection("CARRETERA M-607 2100, 28049 MADRID");
        clientArrayList.add(client3);
        client3.getDni();
        client3.getName();
        client3.getSurnames();
        client3.getDirection();


        Client client4 = new Client();
        client4.setDni("024203R");
        client4.setName("PABLO");
        client4.setSurnames("CARO NARANJO");
        client4.setDirection("PASEO FERNAN NUÑEZ 10, 28009 MADRID");
        clientArrayList.add(client4);
        client4.getDni();
        client4.getName();
        client4.getSurnames();
        client4.getDirection();

        Client client5 = new Client();
        client5.setDni("");
        client5.setName("");
        client5.setSurnames("");
        client5.setDirection("");
        clientArrayList.add(client5);
        client5.getDni();
        client5.getName();
        client5.getSurnames();
        client5.getDirection();


        Vehicle vehicle1 = new Vehicle();
        vehicle1.setBrand("Toyota");
        vehicle1.setColor("Blue");
        vehicle1.setEngine("2.0L");
        vehicle1.setFuel("Gasoline");
        vehicle1.setHorser("180");
        vehicle1.setVehicleRegistration("314223FD");
        vehicleArrayList.add(vehicle1);
        vehicle1.getBrand();
        vehicle1.getColor();
        vehicle1.getEngine();
        vehicle1.getFuel();
        vehicle1.getHorser();
        vehicle1.getVehicleRegistration();
        vehicle1.setVendido(true);
        vehicle1.getVendido();


        Vehicle vehicle2 = new Vehicle();
        vehicle2.setBrand("Honda");
        vehicle2.setColor("Red");
        vehicle2.setEngine("1.8L");
        vehicle2.setFuel("Diesel");
        vehicle2.setHorser("150");
        vehicle2.setVehicleRegistration("XYZ789");
        vehicleArrayList.add(vehicle2);
        vehicle2.getBrand();
        vehicle2.getColor();
        vehicle2.getEngine();
        vehicle2.getFuel();
        vehicle2.getHorser();
        vehicle2.getVehicleRegistration();
        vehicle2.setVendido(true);
        vehicle2.getVendido();


        Vehicle vehicle3 = new Vehicle();
        vehicle3.setBrand("Ford");
        vehicle3.setColor("Silver");
        vehicle3.setFuel("Electric");
        vehicle2.setEngine("1.8L");
        vehicle3.setHorser("200");
        vehicle3.setVehicleRegistration("DEF456");
        vehicleArrayList.add(vehicle3);
        vehicle3.getBrand();
        vehicle3.getColor();
        vehicle3.getEngine();
        vehicle3.getFuel();
        vehicle3.getHorser();
        vehicle3.getVehicleRegistration();
        vehicle3.setVendido(true);
        vehicle3.getVendido();


        Vehicle vehicle4 = new Vehicle();
        vehicle4.setBrand("BMW");
        vehicle4.setColor("Black");
        vehicle4.setEngine("3.0L");
        vehicle4.setFuel("Gasoline");
        vehicle4.setHorser("250");
        vehicle4.setVehicleRegistration("GHI789");
        vehicleArrayList.add(vehicle4);
        vehicle4.getBrand();
        vehicle4.getColor();
        vehicle4.getEngine();
        vehicle4.getFuel();
        vehicle4.getHorser();
        vehicle4.getVehicleRegistration();
        vehicle4.setVendido(true);
        vehicle4.getVendido();


        Vehicle vehicle5 = new Vehicle();
        vehicle5.setBrand("Mercedes-Benz");
        vehicle5.setColor("White");
        vehicle5.setEngine("2.5L Hybrid");
        vehicle5.setFuel("Hybrid");
        vehicle5.setHorser("220");
        vehicle5.setVehicleRegistration("JKL012");
        vehicleArrayList.add(vehicle5);
        vehicle5.getBrand();
        vehicle5.getColor();
        vehicle5.getEngine();
        vehicle5.getFuel();
        vehicle5.getHorser();
        vehicle5.getVehicleRegistration();
        vehicle5.setVendido(true);
        vehicle5.getVendido();


        Vehicle vehicle6 = new Vehicle();
        vehicle6.setBrand("Chevrolet");
        vehicle6.setColor("Green");
        vehicle6.setEngine("2.2L");
        vehicle6.setFuel("Ethanol");
        vehicle6.setHorser("170");
        vehicle6.setVehicleRegistration("MNO345");
        vehicleArrayList.add(vehicle6);
        vehicle6.getBrand();
        vehicle6.getColor();
        vehicle6.getEngine();
        vehicle6.getFuel();
        vehicle6.getHorser();
        vehicle6.getVehicleRegistration();
        vehicle6.setVendido(false);
        vehicle6.getVendido();


        Vehicle vehicle7 = new Vehicle();
        vehicle7.setBrand("Nissan");
        vehicle7.setColor("Yellow");
        vehicle7.setEngine("1.6L");
        vehicle7.setFuel("Gasoline");
        vehicle7.setHorser("160");
        vehicle7.setVehicleRegistration("PQR678");
        vehicleArrayList.add(vehicle7);
        vehicle7.getBrand();
        vehicle7.getColor();
        vehicle7.getEngine();
        vehicle7.getFuel();
        vehicle7.getHorser();
        vehicle7.getVehicleRegistration();
        vehicle7.setVendido(false);
        vehicle7.getVendido();


        Vehicle vehicle8 = new Vehicle();
        vehicle8.setBrand("Volkswagen");
        vehicle8.setColor("Orange");
        vehicle8.setEngine("2.5L");
        vehicle8.setFuel("Diesel");
        vehicle8.setHorser("180");
        vehicle8.setVehicleRegistration("STU901");
        vehicleArrayList.add(vehicle8);
        vehicle8.getBrand();
        vehicle8.getColor();
        vehicle8.getEngine();
        vehicle8.getFuel();
        vehicle8.getHorser();
        vehicle8.getVehicleRegistration();
        vehicle8.setVendido(false);
        vehicle8.getVendido();


        Vehicle vehicle9 = new Vehicle();
        vehicle9.setBrand("Audi");
        vehicle9.setColor("Purple");
        vehicle9.setEngine("2.8L");
        vehicle9.setFuel("Gasoline");
        vehicle9.setHorser("200");
        vehicle9.setVehicleRegistration("VWX234");
        vehicleArrayList.add(vehicle9);
        vehicle9.getBrand();
        vehicle9.getColor();
        vehicle9.getEngine();
        vehicle9.getFuel();
        vehicle9.getHorser();
        vehicle9.getVehicleRegistration();
        vehicle9.setVendido(false);
        vehicle9.getVendido();


        Sale sale1 = new Sale();
        sale1.setCostumerData(clientArrayList);
        sale1.setVehiculeData(vehicleArrayList);
        sale1.setId("33244g");
        sale1.setCost(15000.2);
        sale1.setDataSale("tarjeta");
        sale1.getDataSale();
        sale1.getCostumerData();
        sale1.getVehiculeData();
        sale1.getId();
        saleArrayList.add(sale1);

        Sale sale2 = new Sale();
        sale2.setCost(32000.2);
        sale2.setDataSale("dinero");
        sale2.setCostumerData(clientArrayList);
        sale2.setVehiculeData(vehicleArrayList);
        sale2.setId("2432r233");
        sale2.getDataSale();
        sale2.getCostumerData();
        sale2.getVehiculeData();
        sale2.getId();
        saleArrayList.add(sale2);


        Sale sale3 = new Sale();
        sale3.setCost(50000.25);
        sale3.setDataSale("tarjeta");
        sale3.setCostumerData(clientArrayList);
        sale3.setVehiculeData(vehicleArrayList);
        sale3.setId("2344hj");
        sale3.getDataSale();
        sale3.getCostumerData();
        sale3.getVehiculeData();
        sale3.getId();
        saleArrayList.add(sale3);


        Sale sale4 = new Sale();
        sale4.setCost(55000.03);
        sale4.setDataSale(" cheque");
        sale4.setCostumerData(clientArrayList);
        sale4.setVehiculeData(vehicleArrayList);
        sale4.setId("32421t");
        sale4.getDataSale();
        sale4.getCostumerData();
        sale4.getVehiculeData();
        sale4.getId();
        saleArrayList.add(sale4);


        Sale sale5 = new Sale();
        sale5.setCost(130000.2);
        sale5.setDataSale("efectivo");
        sale5.setCostumerData(clientArrayList);
        sale5.setVehiculeData(vehicleArrayList);
        sale5.setId("344gf112");
        sale5.getDataSale();
        sale5.getCostumerData();
        sale5.getVehiculeData();
        sale5.getId();
        saleArrayList.add(sale5);


        Sale sale6 = new Sale();
        sale6.setCost(30000.25);
        sale6.setDataSale("targeta");
        sale6.setCostumerData(clientArrayList);
        sale6.setVehiculeData(vehicleArrayList);
        sale6.setId("242t");
        sale6.getDataSale();
        sale6.getCostumerData();
        sale6.getVehiculeData();
        sale6.getId();
        saleArrayList.add(sale6);


        Sale sale7 = new Sale();
        sale7.setCost(43000.99);
        sale7.setDataSale("cheque");
        sale7.setCostumerData(clientArrayList);
        sale7.setVehiculeData(vehicleArrayList);
        sale7.setId("23423t");
        sale7.getDataSale();
        sale7.getCostumerData();
        sale7.getVehiculeData();
        sale7.getId();
        saleArrayList.add(sale7);


        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("Menú del Concesionario:");
            System.out.println("1. Ver coches no vendidos");
            System.out.println("2. Ver coches vendidos");
            System.out.println("3. Ver lista de clientes");
            System.out.println("4. Ver lista de facturas");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");


            // Leer la opción del usuario
            opcion = scanner.nextInt();

            // Procesar la opción
            switch (opcion) {
                case 1:
                    System.out.println("Coches No Vendidos");
                    for (Vehicle vehicle : vehicleArrayList) {
                        if (!vehicle.getVendido()) {
                            System.out.println(vehicle.toString());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Coches No Vendidos");
                    for (Vehicle vehicle : vehicleArrayList) {
                        if (vehicle.getVendido()) {
                            System.out.println(vehicle.toString());
                        }
                    }

                    break;
                case 3:
                    System.out.println("Clientes");
                    for (Client client : clientArrayList) {

                        System.out.println(client.toString());

                    }
                    break;
                case 4:
                    System.out.println("Facturas");
                    System.out.println("ID: " + sale1.getId() + "\n" + "ID: " + sale2.getId() + "\n" +
                            "ID: " + sale3.getId() + "\n" + "ID: " + sale4.getId() + "\n"
                            + "ID: " + sale5.getId() + "\n" + "ID: " + sale6.getId() + "\n"
                            + "ID: " + sale7.getId() + "\n");
                    System.out.print("Ingrese el ID de la factura que desea ver: ");
                    String facturaId = scanner.next();

                    boolean facturaEncontrada = false;
                    int i = 0;
                    switch (facturaId) {
                        case "33244g":
                            facturaEncontrada = true;
                            i = 1;
                            break;
                        case "2432r233":
                            i = 2;
                            facturaEncontrada = true;
                            break;
                        case "2344hj":
                            i = 3;
                            facturaEncontrada = true;
                            break;
                        case "32421t":
                            i = 4;
                            facturaEncontrada = true;
                            break;
                        case "344gf112":
                            i = 5;
                            facturaEncontrada = true;
                            break;
                        case "242t":
                            i = 6;
                            facturaEncontrada = true;
                            break;
                        case "23423t":
                            i = 7;
                            facturaEncontrada = true;
                            break;
                    }
                    
                    for (Sale sale : saleArrayList) {

                        if (sale.getId().equals(facturaId)) {
                            facturaEncontrada = true;
                            System.out.println("Detalles de la Factura:");
                            System.out.println(sale.toString());

                            // Mostrar el primer coche asociado a la factura
                            if (!sale.getVehiculeData().isEmpty()) {
                                System.out.println("Detalles del Coche:");
                                System.out.println(sale.getVehiculeData().get(i).toString());
                            }

                            // Mostrar el primer cliente asociado a la factura
                            if (!sale.getCostumerData().isEmpty()) {
                                System.out.println("Detalles del Cliente:");
                                System.out.println(sale.getCostumerData().get(i).toString());
                            }
                            break;
                        }
                    }

                    if (!facturaEncontrada) {
                        System.out.println("Factura no encontrada. Verifique el ID de la factura e intente de nuevo.");
                    }

                    if (!facturaEncontrada) {
                        System.out.println("Factura no encontrada. Verifique el ID de la factura e intente de nuevo.");
                    }

                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");

            }


        } while (opcion != 0);


    }
}