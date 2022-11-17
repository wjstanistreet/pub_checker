import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ServerTest {

    Server server;
    Guest steve;


    @BeforeEach
    public void setUp(){
        server = new Server();
        steve = new Guest("Steve", 20);
    }

    // TODO: test that guest can only get served if over 18
    @Test
    public void canServeGuestOver18() {
        // Uses method to check if guest can be served
        boolean canServe = server.canServeGuest(steve);
        assertThat(canServe).isEqualTo(true);
    }

    @Test
    public void canNOTServeGuestOver18(){
        // sets guest's age to <18
        steve.setAge(17);
        assertThat(server.canServeGuest(steve)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    public void canServeGuestIfTheyHaveEnoughMoney(){

    }
    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)

    // TODO: test that guest can only get served if guest is not banned from the pub

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}
