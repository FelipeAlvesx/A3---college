import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Classe principal
public class Programa {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Carro> listaDeCarros = new ArrayList<>();
    private static ArrayList<Carro> listaDeDiarias = new ArrayList<>();

    public static void main(String[] args) {

        //Persistindo Carros no Arraylist("ListaDeCarros")
        listaDeCarros.add(new Carro("ABC1234", "Gol", "Volks", 2015, 100.0));
        listaDeCarros.add(new Carro("DEF5678", "Onix", "Chevrolet", 2018, 120.0));
        listaDeCarros.add(new Carro("GHI9101", "Fiesta", "Ford", 2016, 110.0));
        listaDeCarros.add(new CarroDeLuxo("JKL1122", "Camaro", "Chevrolet", 2020, 350.0, "Alto", true));
        listaDeCarros.add(new CarroDeLuxo("MNO3344", "BMW X5", "BMW", 2019, 400.0, "Máximo", true));
        listaDeCarros.add(new Carro("PQR5566", "Civic", "Honda", 2017, 130.0));
        listaDeCarros.add(new Carro("STU7788", "Corolla", "Toyota", 2018, 140.0));


        // Criando um loop para a nossa interecao com o usuario;
        while (true) {
            System.out.println("\n===== Sistema de Carros =====");
            System.out.println("1 - Listar carros");
            System.out.println("2 - Cadastrar carro");
            System.out.println("3 - Buscar carro");
            System.out.println("4 - Editar carro");
            System.out.println("5 - Remover carro");
            System.out.println("6 - Gerenciar diarias");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    listarCarros();
                    break;
                case 2:
                    cadastrarCarro();
                    break;
                case 3:
                    buscarCarro();
                    break;
                case 4:
                    editarCarro();
                    break;
                case 5:
                    removerCarro();
                    break;

                case 6:
                    exibirSubmenu();
                    break;

                case 7:
                    System.out.println("Saindo do sistema. Até mais!");
                    System.exit(0);

                default:
                    System.out.println("Opção inválida!");

            }


        }
    }




    public static void exibirSubmenu() {
        while (true) {
            System.out.println("\n--- Submenu ---");
            System.out.println("1. iniciar Diarias");
            System.out.println("2. vizualizar diarias");
            System.out.println("3. finalizar diarias");
            System.out.println("4. voltar");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (escolha) {
                case 1:
                    iniciarDiarias();
                    break;
                case 2:
                    vizualizarDiarias();
                    break;
                case 3:
                    finalizarDiarias();
                    break;

                case 4:
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }


        }
    }

    private static void finalizarDiarias() {
        System.out.println("Digite a placa"); String placa = scanner.nextLine();

        // encerra uma diaria e exibe metodos de pagamento e valor final


    }

    private static void vizualizarDiarias() {
        System.out.println("Lista de Diárias:");
        for (Carro d : listaDeDiarias) {
            System.out.println(d);
        }
    }

    private static void iniciarDiarias() {
        System.out.print("Digite placa: "); String placa = scanner.nextLine();
        System.out.println("Cpf do cliente: "); String cpfCliente = scanner.nextLine();
        System.out.println("QUantidade de dias: "); int quantidadeDias = scanner.nextInt();
        scanner.nextLine();

        if(quantidadeDias > 1){
            boolean carroEncontrado = false; // Flag para verificar se o carro foi encontrado
            for (Carro c : listaDeCarros) {
                if (c.getPlaca().equalsIgnoreCase(placa)) {
                    System.out.println("Diária iniciada para o carro: " + c.getModelo());

                    listaDeDiarias.add(new Diaria(c, quantidadeDias, cpfCliente));
                    System.out.println("Lista de Diárias atualizada: " + listaDeDiarias);
                    System.out.println("Diária iniciada!");
                    carroEncontrado = true; // Define a flag como true
                    break; //
                }
            }

            if (!carroEncontrado) { // Se a flag ainda for false, o carro não foi encontrado
                System.out.println("Carro não encontrado!");
            }
        }else {
            System.out.println("Quantidade de dias inválida! Deve ser maior que 1.");
        }


    }


    // Listar carros ordenados por ano
        private static void listarCarros() {
            // Ordena por ano crescente
            Collections.sort(listaDeCarros, Comparator.comparingInt(Carro::getAno));
            System.out.printf("%-8s %-10s %-10s %-6s %-7s %-10s %-6s\n",
                    "Placa", "Modelo", "Marca", "Ano", "Valor", "Conforto", "Seguro");
            System.out.println("------------------------------------------------------------");
            for (Carro c : listaDeCarros) {
                System.out.println(c);
            }
        }

        // Cadastrar novo carro
        private static void cadastrarCarro() {
            System.out.print("Digite placa: "); String placa = scanner.nextLine();
            System.out.print("Digite modelo: "); String modelo = scanner.nextLine();
            System.out.print("Digite marca: "); String marca = scanner.nextLine();
            System.out.print("Digite ano: "); int ano = scanner.nextInt();
            System.out.print("Digite valor diária: "); double valor = scanner.nextDouble();
            scanner.nextLine();

            // Verifica se o carro cadastrado sera um carro de luxo
            System.out.print("É carro de luxo? (S/N): "); String luxo = scanner.nextLine();
            if (luxo.equalsIgnoreCase("S")) {
                System.out.print("Digite nível de conforto: "); String conforto = scanner.nextLine();
                System.out.print("Seguro incluso? (S/N): "); String seguro = scanner.nextLine();
                listaDeCarros.add(new CarroDeLuxo(placa, modelo, marca, ano, valor, conforto, seguro.equalsIgnoreCase("S")));
            } else{
                listaDeCarros.add(new Carro(placa, modelo, marca, ano, valor));
            }

            System.out.println("Carro cadastrado com sucesso!");
        }

        // Buscar carro por placa
        private static void buscarCarro() {
            System.out.print("Digite a placa do carro: "); String placa = scanner.nextLine();
            for (Carro c : listaDeCarros) {
                if (c.getPlaca().equalsIgnoreCase(placa)) {
                    System.out.println("Carro encontrado:");
                    System.out.println(c);
                    return;
                }
            }
            System.out.println("Carro não encontrado!");
        }

        // Editar carro
        private static void editarCarro() {
            System.out.print("Digite a placa do carro que deseja editar: "); String placa = scanner.nextLine();
            for (Carro c : listaDeCarros) {
                if (c.getPlaca().equalsIgnoreCase(placa)) {
                    System.out.print("Novo modelo (" + c.getModelo() + "): "); String modelo = scanner.nextLine();
                    System.out.print("Nova marca (" + c.getMarca() + "): "); String marca = scanner.nextLine();
                    System.out.print("Novo ano (" + c.getAno() + "): "); int ano = scanner.nextInt();
                    System.out.print("Novo valor diária (" + c.getValorDiaria() + "): "); double valor = scanner.nextDouble();
                    scanner.nextLine();
                    c.setModelo(modelo); c.setMarca(marca); c.setAno(ano); c.setValorDiaria(valor);

                    if (c instanceof CarroDeLuxo) {
                        CarroDeLuxo lux = (CarroDeLuxo) c;
                        System.out.print("Novo nível de conforto (" + lux.getStatusConforto() + "): "); String conforto = scanner.nextLine();
                        System.out.print("Seguro incluso? (" + (lux.isSeguroIncluso() ? "Sim" : "Não") + "): "); String seguro = scanner.nextLine();
                        lux.setStatusConforto(conforto); lux.setSeguroIncluso(seguro.equalsIgnoreCase("S"));
                    }
                    System.out.println("Carro editado com sucesso!");
                    return;
                }
            }
            System.out.println("Carro não encontrado!");
        }

        // Remover carro
        private static void removerCarro() {
            System.out.print("Digite a placa do carro que deseja remover: "); String placa = scanner.nextLine();
            for (Carro c : listaDeCarros) {
                if (c.getPlaca().equalsIgnoreCase(placa)) {
                    System.out.print("Tem certeza que deseja remover este carro? (S/N): ");
                    String confirm = scanner.nextLine();
                    if (confirm.equalsIgnoreCase("S")) {
                        listaDeCarros.remove(c);
                        System.out.println("Carro removido com sucesso!");
                    } else {
                        System.out.println("Remoção cancelada.");
                    }
                    return;
                }
            }
            System.out.println("Carro não encontrado!");


        }




}