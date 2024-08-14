// Cesar Beda Candido da Silva CB302704X

import java.util.Scanner;

public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade = 0;
    private String nomeMedico;

    // Construtor padrão que solicita a entrada de dados via Scanner
    public ConsultaAgendada() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mes: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        this.data = new Data(dia, mes, ano);

        System.out.print("Digite a hora: ");
        int hora = scanner.nextInt();

        System.out.print("Digite os minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Digite os segundos: ");
        int segundos = scanner.nextInt();

        this.hora = new Hora(hora, minutos, segundos);

        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Digite o nome do paciente: ");
        this.nomePaciente = scanner.nextLine();

        System.out.print("Digite o nome do medico: ");
        this.nomeMedico = scanner.nextLine();

        quantidade++;
    }

    // Construtor que recebe os parâmetros diretamente
    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String med) {
        this.data = new Data(d, m, a);
        this.hora = new Hora(h, mi, s);
        this.nomePaciente = p;
        this.nomeMedico = med;
        quantidade++;
    }

    // Construtor que recebe objetos Data e Hora
    public ConsultaAgendada(Data d, Hora h, String p, String med) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = med;
        quantidade++;
    }

    // Métodos de configuração sem fechar o Scanner
    public void setData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mes: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        this.data = new Data(dia, mes, ano);
    }

    public void setHora() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora: ");
        int hora = scanner.nextInt();

        System.out.print("Digite os minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Digite os segundos: ");
        int segundos = scanner.nextInt();

        this.hora = new Hora(hora, minutos, segundos);
    }

    public void setNomePaciente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do paciente: ");
        this.nomePaciente = scanner.nextLine();
    }

    public void setNomeMedico() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do medico: ");
        this.nomeMedico = scanner.nextLine();
    }

    public String getData() {
        return data.toString();  // Assume que Data tem um método toString() formatado
    }

    public String getHora() {
        return hora.toString();  // Assume que Hora tem um método toString() formatado
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public static int getAmostra() {
        return quantidade;
    }
}
