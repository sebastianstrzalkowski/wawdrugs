package pl.wawdrugs.wawdrugs.models;

import lombok.Data;
import lombok.Getter;
import pl.wawdrugs.wawdrugs.models.dao.Medicine;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class ShoppingCart {

    private static ShoppingCart instance;

    private List<Medicine> medicineList = new ArrayList<>();

    private Integer numberOfProducts = new Integer(0);

    @Getter
    private BigDecimal totalCost = new BigDecimal("0");

    public static synchronized ShoppingCart getInstance(){
        if(instance == null){
            instance = new ShoppingCart();
        }
        return instance;
    }

    public Integer getNumberOfMedicine(){
        return medicineList.size() +1;
    }

}
