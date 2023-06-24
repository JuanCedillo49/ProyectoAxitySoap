package mx.axity.com.webapi.rest.client.endpoint;

import dnd.axity.com.*;
import dnd.axity.com.commons.dto.PlayerDTO;
import dnd.axity.com.service.PlayerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PlayerEndpoint {

  @Autowired
  private PlayerService playerService;

  private static final Logger logger = LoggerFactory.getLogger(PlayerEndpoint.class);
  private static final String NAMESPACE_URI = "com.axity.dnd";

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CreatePlayerRequest")
  @ResponsePayload
  public CreatePlayerResponse createPlayer(@RequestPayload CreatePlayerRequest request) {
    
    logger.info("Ingresó a createPlayer");
    
    CreatePlayerResponse response = new CreatePlayerResponse();
    response.setPlayerId(1);
    
    return response;
  }

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ReadPlayerRequest")
  @ResponsePayload
  public ReadPlayerResponse getPerson(@RequestPayload ReadPlayerRequest request) {

    ReadPlayerResponse response = new ReadPlayerResponse();
    PlayerDTO playerDTO = playerService.getPlayer(request.getPlayerId());
    PlayerType playerType = PlayerTypeFactory.transform(playerDTO);
    response.setPlayer(playerType);

    return response;
  }

}
