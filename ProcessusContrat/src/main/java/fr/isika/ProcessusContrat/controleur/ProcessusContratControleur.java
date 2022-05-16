package fr.isika.ProcessusContrat.controleur;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.isika.ProcessusContrat.dto.AssureDto;
import fr.isika.ProcessusContrat.proxy.AssureProxy;

@Controller
public class ProcessusContratControleur {
	// Logger fait la mm chose que Sysout. 
	private Logger log = LoggerFactory.getLogger(ProcessusContratControleur.class);
	@Autowired
	private AssureProxy assureProxy;
	
	/** 
	 * 
	 * @param m: Spring MVC
	 * @return le nom de la page
	 * */
	
	@GetMapping("/")
	public String accueil(Model m) {
		log.info("************Accueil");
		
		// exemple pour afficher tous les assures marche avec la partie commenter de html
//		List<AssureDto> listeAssure = assureProxy.rechercherAssures();
//		m.addAttribute("listeassu", listeAssure); 
		// On instancie un objet receptacle pour les champs nom et prenom
		AssureDto assureDto = new AssureDto();
		m.addAttribute("assureBean", assureDto);
		return "accueil";
	}

	
	
	@PostMapping("/saisir-assure")
	public String saisieAssure(Model m, AssureDto assureBean) {
		log.info("************saisieAssure");
		
		// 2eme afficher le resultat de la recherche
	List<AssureDto> resrech = assureProxy.rechercherAssureNP(assureBean.getNom(), assureBean.getPrenom());
//		m.addAttribute("listeassu", listeAssure); 
		// On instancie un objet receptacle pour les champs nom et prenom
		
		return "listeAssure";
	}

}
