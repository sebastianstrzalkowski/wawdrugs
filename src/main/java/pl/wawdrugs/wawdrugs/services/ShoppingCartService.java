package pl.wawdrugs.wawdrugs.services;

import org.springframework.stereotype.Component;
import pl.wawdrugs.wawdrugs.models.dao.Medicine;
import pl.wawdrugs.wawdrugs.models.ShoppingCart;

@Component
public class ShoppingCartService {

    ShoppingCart shoppingCart = ShoppingCart.getInstance();

    public void clearList() {
        shoppingCart.getMedicineList().clear();
    }

    public void addMedicineToList(Medicine medicine){
        shoppingCart.getMedicineList().add(medicine);
    }
    public void removeMedicineFromMedicineList(Medicine medicine){
        shoppingCart.getMedicineList().remove(medicine);
    }

    public void addToTotalCost(Medicine medicine){
        shoppingCart.getTotalCost().add(medicine.getPrice());
    }

    public void subtractFromTotalCost(Medicine medicine){
        shoppingCart.getTotalCost().subtract(medicine.getPrice());
    }


}
