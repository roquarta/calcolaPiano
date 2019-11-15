package it.eng.elise.micser.calcola.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.eng.elise.micser.calcola.dto.CalcolaPianoRequest;
import it.eng.elise.micser.calcola.dto.CalcolaPianoResponse;

@RestController
public class CalcolaPianoRS {
	@RequestMapping(method=RequestMethod.GET, value="/calcolaPiano")
	@ResponseBody
	public CalcolaPianoResponse calcolaPiano(CalcolaPianoRequest req) {
		
		CalcolaPianoResponse response = new CalcolaPianoResponse();
		response.setImportoRata(req.getImporto());
		
		return response;
	}
}
