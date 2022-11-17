import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ServerTest {

    Server server;

    @BeforeEach
    public void setUp(){
        server = new Server();
    }

    // TODO: test that guest can only get served if over 18
    @Test
    public void canServeGuestOver18() {
        // Constructs a new guest and sets their age to 20 (>18)
        Guest steve = new Guest("Steve");
        steve.setAge(18);

        // Uses method to check if guest can be served
        boolean canServe = Server.canServeGuest(steve);
        assertThat(canServe).isEqualTo(true);
    }
    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)

    // TODO: test that guest can only get served if guest is not banned from the pub

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}
