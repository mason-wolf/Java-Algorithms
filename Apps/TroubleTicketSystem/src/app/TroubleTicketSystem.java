package app;

import java.util.Scanner;

public class TroubleTicketSystem {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        Technician[] technicians = null;
        Ticket[] tickets = null;

        System.out.println("Enter number of technicians:");
        int numberOfTechnicians = scanner.nextInt();

        technicians = new Technician[numberOfTechnicians];

        System.out.println("Enter number of tickets:");
        int numberOfTickets = scanner.nextInt();

        tickets = new Ticket[numberOfTickets * numberOfTechnicians];
        
        for (int i = 0; i < numberOfTechnicians; i++) {

            System.out.println("Enter technician name:");
            String input = scanner.next();

            Technician technician = new Technician();
            technician.setName(input);
            technicians[i] = technician;

            for (int j = 0; j < numberOfTickets; j++) {
                System.out.println("Enter survey score: ");
                double surveyScore = scanner.nextDouble();
                Ticket ticket = new Ticket();
                ticket.assignTechnician(technician);
                ticket.setSatisfactionSurveyScore(surveyScore);
                tickets[j] = ticket;
            }
        }

        for (int i = 0; i < technicians.length; i++) {
        	
            System.out.println(technicians[i].getName());
  
            int total = 0;
            int ticketCount = 0;
            
            for (int j = 0; j < tickets.length; j++) {
            	
            	if (tickets[j].getAssignedTechnician().getName() == technicians[i].getName())
            	{
                    System.out.println(tickets[j].getSatisfactionSurveyScore());
                    total += tickets[j].getSatisfactionSurveyScore();
                    ticketCount++;
            	}
            }
            
            System.out.println("Average: " + total / ticketCount + "%");
            System.out.println("");
        }

    }

}
