package dnd.axity.com;

import dnd.axity.com.commons.dto.PlayerDTO;

import java.math.BigInteger;

public class PlayerTypeFactory {

    public static PlayerType transform(PlayerDTO response) {
        long longValue = response.getId();
        BigInteger bigIntegerValue = BigInteger.valueOf(longValue);

        PlayerType playerType = null;
        if (response != null) {
            playerType = new PlayerType();
            playerType.setId(bigIntegerValue);
            playerType.setCharisma(response.getCharisma());
            playerType.setConstitution(response.getConstitution());
            playerType.setDexterity(response.getDexterity());
            playerType.setPlayerClass(response.getPlayerClass());
            playerType.setHitPoints(response.getHitPoints());
            playerType.setIntelligence(response.getIntelligence());
            playerType.setLevel(response.getLevel());
            playerType.setName(response.getName());
            playerType.setRace(response.getRace());
            playerType.setStrength(response.getStrength());
            playerType.setWisdom(response.getWisdom());
        }

        return playerType;
    }
}
