public class Server {
    public boolean canServeGuest(Guest guest){
        if (guest.getBanned() ==  false) {

            if (guest.getAge() >= 18) {

                if (guest.getSobriety() >= 50) {

                    if (guest.hasCurrency(Currency.GBP)) {

                        if (guest.getWallet() >= 5) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void banGuest(Guest guest){
        guest.setBanned(true);
    }

    public void unbanGuest(Guest guest){
        guest.setBanned(false);
    }
}
