package fr.isika.ProcessusContrat.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fr.isika.ProcessusContrat.dto.AssureDto;



@FeignClient(name = "mivroservice-assure", url="localhost:9998")
public interface AssureProxy {

	@GetMapping(path = "/previt/rechercherAssureNomPrenom/{nom}/{prenom}")
	public List<AssureDto> rechercherAssureNP(@PathVariable String nom, @PathVariable String prenom);
	
	@GetMapping(path = "/previt/Assure/numeroAssure/{numeroAssure}")
	public List<AssureDto> rechercherAssureNum(@PathVariable Long numeroAssure);
	
	@GetMapping(path = "/previt/listerLesAssures")
	public List<AssureDto> rechercherAssures();
	
}
