import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.Candidate;
import model.Status;

public class Main {

    public static void main(String[] args) {
        Locale us = new Locale("US");
        Scanner sc = new Scanner(System.in).useLocale(us);
        char ask; int many;
        String name;
        Double salary;
        Integer state;
        List<Candidate> candidates = new ArrayList<>();
        Candidate candidate;
        Status status;
        
        // input data fase
        System.out.println("Olá RH, deseja cadastrar candidatos? (S/N)");
        ask = sc.next().charAt(0);

        if (ask == 's' || ask == 'S') {
            System.out.println("Quantos candidatos serão? (informar valor inteiro)");
            many = sc.nextInt();

            for (int i = 1; i <= many; i++) {
                System.out.printf("%d° Candidato\nInforme o Nome Completo: ", i);
                sc.nextLine(); // clear buffer
                name = sc.nextLine();
                System.out.print("Informe o salário pretendido: ");
                salary = sc.nextDouble();
                System.out.print(
                        "Verifique o indicativo abaixo:\n1. IMEDIATO    |   2. DENTRO DE 15 DIAS    |   3. DAQUI 1 MES  |   4. INDISPONÍVEL\nDe 1 à 4 qual sua disponibilidade para início?");
                state = sc.nextInt()-1; // index initiate by 0
                while (state > 3 || state < 0) {
                    state = sc.nextInt();
                }
                status = new Status(state);
                candidate = new Candidate(name, salary, status);
                candidates.add(candidate);
                
                if(i == many) {
                    System.out.println("-------------------- // --------------------\n-------------- CANDIDATES LIST -------------");
                }
                for (Candidate c : candidates) {
                    System.out.printf(c.toString());
                }
            }
            System.out.println("ACTUAL SELECTION RESULT");
            // Checking fase
            for(Candidate c: candidates) {
                System.out.printf("NAME: "+c.getName()+" -> "+c.checkCandidate()+"\n");
            }

        }
        sc.close();
    }
}