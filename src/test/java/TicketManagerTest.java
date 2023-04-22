import TicketManager.TicketRepository;
import TicketManager.Ticket_Manager;
import TicketManager.Ticket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class TicketManagerTest {

    @Test
    public void TicketTest() {
        TicketRepository repo = new TicketRepository();
        Ticket_Manager manager = new Ticket_Manager(repo);

        Ticket ticket1 = new Ticket(1, 500, "MSK", "SPB", 111);
        Ticket ticket2 = new Ticket(2, 585, "MSK", "IRK", 122);
        Ticket ticket3 = new Ticket(3, 350, "MSK", "IRK", 133);
        Ticket ticket4 = new Ticket(4, 320, "MSK", "SPB", 144);
        Ticket ticket5 = new Ticket(5, 1050, "BLR", "MSK", 155);
        Ticket ticket6 = new Ticket(6, 400, "MSK", "IRK", 166);
        Ticket ticket7 = new Ticket(7, 700, "JAP", "MSK", 177);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.findAll("BLR", "MSK");
        Ticket[] expected = {ticket5};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TicketSortTest() {
        TicketRepository repo = new TicketRepository();
        Ticket_Manager manager = new Ticket_Manager(repo);
        Ticket ticket1 = new Ticket(1, 500, "MSK", "SPB", 111);
        Ticket ticket2 = new Ticket(2, 585, "MSK", "IRK", 122);
        Ticket ticket3 = new Ticket(3, 350, "MSK", "IRK", 133);
        Ticket ticket4 = new Ticket(4, 320, "MSK", "SPB", 144);
        Ticket ticket5 = new Ticket(5, 1050, "BLR", "MSK", 155);
        Ticket ticket6 = new Ticket(6, 400, "MSK", "IRK", 166);
        Ticket ticket7 = new Ticket(7, 700, "JAP", "MSK", 177);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Ticket[] actual = manager.findAll("IRK", "MSK");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TicketTest3() {
        TicketRepository repo = new TicketRepository();
        Ticket_Manager manager = new Ticket_Manager(repo);
        Ticket ticket1 = new Ticket(1, 500, "MSK", "SPB", 111);
        Ticket ticket2 = new Ticket(2, 585, "MSK", "IRK", 122);
        Ticket ticket3 = new Ticket(3, 350, "MSK", "IRK", 133);
        Ticket ticket4 = new Ticket(4, 320, "MSK", "SPB", 144);
        Ticket ticket5 = new Ticket(5, 1050, "BLR", "MSK", 155);
        Ticket ticket6 = new Ticket(6, 400, "MSK", "IRK", 166);
        Ticket ticket7 = new Ticket(7, 700, "JAP", "MSK", 177);


        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Ticket[] actual = manager.findAll("JAP", "MSK");
        Ticket[] expected = {ticket7};


        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void TicketSort1Test() {
        TicketRepository repo = new TicketRepository();
        Ticket_Manager manager = new Ticket_Manager(repo);
        Ticket ticket1 = new Ticket(1, 500, "MSK", "SPB", 111);
        Ticket ticket2 = new Ticket(2, 585, "MSK", "IRK", 122);
        Ticket ticket3 = new Ticket(3, 350, "MSK", "IRK", 133);
        Ticket ticket4 = new Ticket(4, 320, "MSK", "SPB", 144);
        Ticket ticket5 = new Ticket(5, 1050, "BLR", "MSK", 155);
        Ticket ticket6 = new Ticket(6, 400, "MSK", "IRK", 166);
        Ticket ticket7 = new Ticket(7, 700, "JAP", "MSK", 177);


        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.findAll("IRK", "IRK");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TicketSort2Test() {
        TicketRepository repo = new TicketRepository();
        Ticket_Manager manager = new Ticket_Manager(repo);

        Ticket ticket1 = new Ticket(1, 500, "MSK", "SPB", 111);
        Ticket ticket2 = new Ticket(2, 585, "MSK", "IRK", 122);
        Ticket ticket3 = new Ticket(3, 350, "MSK", "IRK", 133);
        Ticket ticket4 = new Ticket(4, 320, "MSK", "SPB", 144);
        Ticket ticket5 = new Ticket(5, 1050, "BLR", "MSK", 155);
        Ticket ticket6 = new Ticket(6, 400, "MSK", "IRK", 166);
        Ticket ticket7 = new Ticket(7, 700, "JAP", "MSK", 177);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.findAll("MSK", "SPB");
        Ticket[] expected = {ticket4, ticket1};

        Assertions.assertArrayEquals(expected, actual);
    }

   }