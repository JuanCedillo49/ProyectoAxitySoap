package dnd.axity.com.service.impl;

import dnd.axity.com.commons.dto.PlayerDTO;
import dnd.axity.com.model.enity.PlayerDO;
import dnd.axity.com.persistence.PlayerDAO;
import dnd.axity.com.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerDAO playerDAO;

    @Override
    public PlayerDTO createPlayer(PlayerDTO player) {

        return null;
    }

    @Override
    public PlayerDTO getPlayer(Long id) {

        PlayerDTO responseDTO = null;
        PlayerDO responseDO = playerDAO.findById(id).get();

        responseDTO = playerDOtoTO(responseDO);

        return responseDTO;
    }

    @Override
    public void updatePlayer(PlayerDTO player) {

    }

    @Override
    public void deletePlayer(Integer id) {

    }

    public PlayerDTO playerDOtoTO(PlayerDO playerDO){

        return new PlayerDTO(playerDO.getId(), playerDO.getName(), playerDO.getRace(), playerDO.getPlayerClass(), playerDO.getLevel(), playerDO.getHitPoints(), playerDO.getStrength(), playerDO.getDexterity(), playerDO.getConstitution(), playerDO.getConstitution(), playerDO.getWisdom(), playerDO.getCharisma());
    }
}
