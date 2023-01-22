package com.techreturners.exercise003;

import java.util.HashMap;
import java.util.Map;

public class Exercise003 {
    
    // Approach 1 using ENUM
    // time complexity for this approach is O(n)
    /* 
    public enum IceCreamFlavour {
        PISTACHIO (0, "Pistachio"),
        RASPBERRY_RIPPLE (1, "Raspberry Ripple"),
        Vanilla (2, "Vanilla"),
        MINT_CHOCOLATE_CHIP(3, "Mint Chocolate Chip"), 
        CHOCOLATE (4, "Chocolate"),
        MANGO_SORBET (5, "Mango Sorbet");

        private final int itemCode;
        private final String displayName;

        IceCreamFlavour(int itemCode, String displayName) {
            this.itemCode = itemCode;
            this.displayName = displayName;
        }


    }

    int getIceCreamCode(String iceCreamFlavour) {
        for(IceCreamFlavour iceCream: IceCreamFlavour.values()) {
            if(iceCream.displayName.equalsIgnoreCase(iceCreamFlavour)) {
                return iceCream.itemCode;
            }

        }
        return -1;
    }

    String[] iceCreamFlavours() { 

        IceCreamFlavour [] states = IceCreamFlavour.values();
        String[] names = new String[states.length];

        for (int i = 0; i < states.length; i++) {
            names[i] = states[i].displayName;
        }

        return names;
       
    }
    */

    // Approach 2 using Map
    // time complexity for this approach is O(1)
    private static Map<String, Integer> iceCreamFlavours = new HashMap<>();
    
    static {

        String[] flavours = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" }; 
        Integer itemCode = 0;

        for(String flavour: flavours) {
            iceCreamFlavours.put(flavour, itemCode);
            itemCode++;
        }
    }

    int getIceCreamCode(String iceCreamFlavour) {
        return iceCreamFlavours.get(iceCreamFlavour);
    }

    String[] iceCreamFlavours() { 
        return iceCreamFlavours.keySet().stream().toArray(String[]::new);
    }

}
