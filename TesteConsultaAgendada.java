// Cesar Beda Candido da Silva CB302704X

public class TesteConsultaAgendada {
    public static void main(String[] args) {
        // 1. Instancie o objeto p1 usando o construtor que solicita a entrada de dados via Scanner
        System.out.println("Por favor, insira os dados para p1:");
        ConsultaAgendada p1 = new ConsultaAgendada();

        // 2. Exiba todas as propriedades de p1
        System.out.println("Propriedades de p1:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Medico: " + p1.getNomeMedico());
        System.out.println();

        // 3. Instancie o objeto p2 usando o construtor padrão que solicita a entrada de dados via Scanner
        System.out.println("Por favor, insira os dados para p2:");
        ConsultaAgendada p2 = new ConsultaAgendada();

        // 4. Exiba todas as propriedades de p2
        System.out.println("Propriedades de p2:");
        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        System.out.println("Nome do Paciente: " + p2.getNomePaciente());
        System.out.println("Nome do Medico: " + p2.getNomeMedico());
        System.out.println();

        // 5. Usando os métodos set, altere as propriedades de p1
        System.out.println("Alterando as propriedades de p1:");
        p1.setData();  // Solicita nova data
        p1.setHora();  // Solicita nova hora
        p1.setNomePaciente();  // Solicita novo nome de paciente
        p1.setNomeMedico();  // Solicita novo nome de médico

        // 6. Exiba todas as propriedades de p1 novamente
        System.out.println("Propriedades de p1 apos alterações:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Medico: " + p1.getNomeMedico());
        System.out.println();

        // 7. Exiba a quantidade final de consultas
        System.out.println("Quantidade final de consultas agendadas: " + ConsultaAgendada.getAmostra());
    }
}
