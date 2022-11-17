import java.util.ArrayList;

public class Server {

    private ArrayList<Drink> drinkList;

    public Server(){
        this.drinkList = new ArrayList<>();
    }

    public boolean canServeGuest(Guest guest){
        if (guest.isBanned() ==  false) {

            if (guest.getAge() >= 18) {

                if (guest.getSobriety() >= 50) {

                    if (guest.hasCurrency(Currency.GBP)) {

                        if (guest.getWallet() >= 5) {

                            if (drinkList.contains(guest.getFavouriteDrink())) {

                                return true;
                            }
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

    public boolean canMakeDrink(Drink drink){
        for (Drink drinkIter : drinkList){
            if (drinkIter.equals(drink)){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Drink> getDrinkList(){
        return this.drinkList;
    }

    public void setDrinkList(ArrayList<Drink> drinkList){
        this.drinkList = drinkList;
    }

    public void addDrink(Drink drink){
        this.drinkList.add(drink);
    }

    public void removeDrink(Drink drink){
        this.drinkList.remove(drink);
    }
}
