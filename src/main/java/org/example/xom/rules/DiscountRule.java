package org.example.xom.rules;


import org.example.xom.bom.ClientBom;

// THIS CLASS WILL DEFINE A RULE THAT GIVE A DISCOUNT TO ANY CLIENT THAT HAVE MADE MORE THAN 1200 DOLLARS AS SALES AND AT LEAST 1 YEAR OF SUBSCRIPTION
// IF THE CLIENT IS ELIGIBLE, THEN HE WILL GET 20 PER CENT DISCOUNT
public class DiscountRule{
    public static void applyDiscountRule(ClientBom clientBom){
        if (clientBom.getAmountOfSales() > 1200 && (clientBom.getDateOfLastSale().getYear() - clientBom.getDateOfFirstSale().getYear() == 1)){
            clientBom.setDiscount(20);
        }
    }
}
