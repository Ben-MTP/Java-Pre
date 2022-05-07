package com.core.optional;

import java.util.Optional;

/**
 * @author ManhKM on 4/23/2022
 * @project java-annotation
 */
public class Girl {
    private Outfit outfit;
    public Outfit getOutfit(){
        return outfit;
    }

    public String getOutfitType(Girl girl){
        return Optional.ofNullable(girl)
                .map(Girl::getOutfit)
                .map(Outfit::getType)
                .filter(s -> s.contains("bikini"))
                .orElse("Nothing");
    }
}
