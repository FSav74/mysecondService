package mysecondService.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import mysecondService.bean.Door;
import mysecondService.bean.Game;

@RestController
@RequestMapping(value="/games")
public class GameController {
	
	//POST to create a new game
	@RequestMapping(method=RequestMethod.POST, value="")
	HttpHeaders create() {
		
		//TODO:
		//metodo back end per create oggetto Game
		System.out.println("CREATE>>>>>>>>>>>>>>>>");
		//ritorno una response http 200
		HttpHeaders headers = new HttpHeaders();
		//nel campo location del header posso mettere url dell'oggetto creato  
//		try {
//			headers.setLocation(new URI(""));
//		} catch (URISyntaxException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return headers;
	}
	
	//prendo l'oggetto GAme 
	@RequestMapping(method=RequestMethod.GET, value="/{gameId}", produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public Game getGame(@PathVariable String gameId) {
		System.out.println("getGame>>>>>>>>>>>>>>>>");
		//TODO: l'oggetto dovrebbe essere recuperato dal sistema
		Game game = new Game();
		game.setIdGame(gameId);
		game.setNameGame("Game of the games!!");
		
		return game;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{gameId}/doors", produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public Collection<Door> getDoors(@PathVariable String gameId) {
		System.out.println("getDoors>>>>>>>>>>>>>>>>");
		//TODO: l'oggetto dovrebbe essere recuperato dal sistema
		
		List<Door> lista = new ArrayList<>();
		Door door1 = new Door("1","CLOSED");
		Door door2 = new Door("2","CLOSED");
		Door door3 = new Door("3","CLOSED");
		lista.add(door1);
		lista.add(door2);
		lista.add(door3);
		return lista;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{gameId}/doors/{doorId}", produces=MediaType.APPLICATION_JSON_VALUE
			,consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	void transitionState(@PathVariable String gameId, @PathVariable String doorId, 
			@RequestBody Map<String, String> payload) {
		System.out.println(">>>>>>>transitionState<<<<<<"+gameId+":"+doorId);
		System.out.println(">>>>>>>PAYLOAD del PUT <<<<<<");
		Iterator<Entry<String, String>> it = payload.entrySet().iterator();   //line 1
		while (it.hasNext()) {
		    Map.Entry pair = (Map.Entry)it.next();
		    System.out.println(pair.getKey() + " = " + pair.getValue());
		   
		 }
		//TODO: payload è ciò che invio per il cambio di stato
		
	
		return;
	}
	

}
