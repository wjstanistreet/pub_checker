public class Server {
    public boolean canServeGuest(Guest guest){
        if (guest.getAge() >= 18){
            return true;
        }
        if (guest.getWallet() >= 5){
            return true;
        }
        return false;
    }
}
