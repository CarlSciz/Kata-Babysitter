import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BabysitterTest {
    private BabySitter babySitter;
    private Family family;

    @Test
    public void whenBabysitterWorksFivePmToFivePmForFamilyAZeroDollars() {
        babySitter = new BabySitter(PaidHours.fivePm(), PaidHours.fivePm());
        family = new FamilyA();
        assertEquals(0, babySitter.total(family));
    }

    @Test
    public void whenBabysitterWorksFivePmToElevenPmForFamilyANinetyDollars() {
        babySitter = new BabySitter(PaidHours.fivePm(), PaidHours.elevenPm());
        family = new FamilyA();
        assertEquals(90, babySitter.total(family));
    }

}
