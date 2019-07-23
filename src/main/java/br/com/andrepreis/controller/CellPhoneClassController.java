package br.com.andrepreis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.andrepreis.dto.CellBrand;
import br.com.andrepreis.services.ClassifyCellPhone;

@RestController
@RequestMapping("/api/cellphone-brand")
@CrossOrigin
public class CellPhoneClassController {

	Logger logger = LoggerFactory.getLogger(CellPhoneClassController.class);
	
	@Autowired
	ClassifyCellPhone cellPhoneClassService;
	
	/**
	 * Retorna marca associada a uma determinada descrição de celular
	 * 
	 * @param sProducDesc : Descrição do celular a ter sua marca classificada
	 * 
	 * @return
	 */
	@RequestMapping(value = { "/classifycellphone" } , method = RequestMethod.GET)
	public ResponseEntity<CellBrand> classifyCellPhoneBrand(@RequestParam("product") String sProducDesc){
		
		CellBrand result = new CellBrand();
		if(sProducDesc == null)return new ResponseEntity<CellBrand>(result, HttpStatus.BAD_REQUEST);
		try {						
			result = cellPhoneClassService.findBrandByCellDesc(sProducDesc);						
		}catch (Exception e) {
			logger.error(e.getMessage(), e);
            return new ResponseEntity<CellBrand>(result, HttpStatus.INTERNAL_SERVER_ERROR);
		}				
		return new ResponseEntity<CellBrand>(result, HttpStatus.OK);
	}
}
