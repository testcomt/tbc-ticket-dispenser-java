package kata.td;

/**
 * Created by benwu on 14-6-10.
 */
public class TicketDispenser {
    private TurnNumberSequence turnNumberSequence;

    public TicketDispenser(TurnNumberSequence turnNumberSequence) { // Enabling Point

    }

    public TicketDispenser() {

    }

    public TurnTicket getTurnTicket()
    {
        // TODO-code-smell-working-on: Depending on a static method violates the Dependency Inversion Principle and Open-Closed Principle
        int newTurnNumber = turnNumberSequence.getNextTurnNumber(); // Seam
        TurnTicket newTurnTicket = new TurnTicket(newTurnNumber);

        return newTurnTicket;
    }
}
