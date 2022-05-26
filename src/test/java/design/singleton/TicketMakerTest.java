package design.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import design.singleton.model.TicketMaker;

public class TicketMakerTest {
    
    @Test
    public void testTicketMaker() {
        TicketMaker maker = TicketMaker.getInstance();
        int ticketFirst = maker.getTicketNum();
        int ticketSecond = maker.getTicketNum();
        assertEquals(ticketFirst, ticketSecond-1);
    }
}
