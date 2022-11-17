import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ServerTest {

    Server server;
    Guest steve;


    @BeforeEach
    public void setUp(){
        server = new Server();
        steve = new Guest("Steve", 20, 20.0, 75);
        steve.addCurrency(Currency.GBP);
    }

    // TODO: test that guest can only get served if over 18
    @Test
    public void canServeGuestOver18() {
        // Uses method to check if guest can be served
        boolean canServe = server.canServeGuest(steve);
        assertThat(canServe).isEqualTo(true);
    }

    @Test
    public void canNOTServeGuestUnder18(){
        // sets guest's age to <18
        steve.setAge(17);
        assertThat(server.canServeGuest(steve)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    public void canServeGuestIfTheyHaveEnoughMoney(){
        assertThat(server.canServeGuest(steve)).isEqualTo(true);
    }

    @Test
    public void willRejectGuestIfTheyCannotAfford(){
        steve.setWallet(3.50);
        assertThat(server.canServeGuest(steve)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)
    @Test
    public void canServeGuestIfSober(){
        assertThat(server.canServeGuest(steve)).isEqualTo(true);
    }

    @Test
    public void willRejectGuestIfDrunk(){
        steve.setSobriety(25);
        assertThat(server.canServeGuest(steve)).isEqualTo(false);
    }


    // TODO: test that guest can only get served if guest is not banned from the pub
    @Test
    public void willRejectBannedGuest(){
        server.banGuest(steve);
        assertThat(server.canServeGuest(steve)).isEqualTo(false);
    }

    @Test
    public void canUnbanBannedGuest(){
        server.banGuest(steve);
        server.unbanGuest(steve);
        assertThat(server.canServeGuest(steve)).isEqualTo(true);
    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)
    @Test
    public void canPayInLocalCurrency(){
        assertThat(server.canServeGuest(steve)).isEqualTo(true);
    }

    @Test
    public void willRejectForeignCurrency(){
        steve.removeCurrency(Currency.GBP);
        steve.addCurrency(Currency.USD);
        steve.addCurrency(Currency.EUR);
        assertThat(server.canServeGuest(steve)).isEqualTo(false);
    }

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}
