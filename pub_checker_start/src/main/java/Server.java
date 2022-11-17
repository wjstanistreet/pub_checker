public class Server {
    public boolean canServeGuest(Guest guest){
        if (guest.getAge() >= 18){
            return true;
        }
        return false;
    }
}
