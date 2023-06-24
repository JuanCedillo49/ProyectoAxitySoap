package dnd.axity.com.service;

import dnd.axity.com.commons.dto.PlayerDTO;

public interface PlayerService {

    PlayerDTO createPlayer(PlayerDTO player);

    PlayerDTO getPlayer(Long id);

    void updatePlayer(PlayerDTO player);

    void deletePlayer(Integer id);
}
