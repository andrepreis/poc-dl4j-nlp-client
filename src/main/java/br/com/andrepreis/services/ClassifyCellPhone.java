package br.com.andrepreis.services;

import org.deeplearning4j.models.embeddings.loader.WordVectorSerializer;
import org.deeplearning4j.models.paragraphvectors.ParagraphVectors;
import org.deeplearning4j.text.tokenization.tokenizerfactory.DefaultTokenizerFactory;
import org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import br.com.andrepreis.utils.SystemParams;
import br.com.andrepreis.utils.Timer;



@Service
public class ClassifyCellPhone {

	
	private TokenizerFactory tokenizerFactory = null;
	private ParagraphVectors paragraphVectors = null;
	Logger logger = LoggerFactory.getLogger(ClassifyCellPhone.class);
	 
	 public ClassifyCellPhone () throws Exception{
     Timer  timer = new Timer();	 
		 
		 try{
			
			logger.info("Iniciando carga do modelo a ser verificado....");
			logger.info(SystemParams.MODEL_FILE.getValor());						
			
			paragraphVectors = WordVectorSerializer.readParagraphVectors(SystemParams.MODEL_FILE.getValor());
			
			logger.info("Modelo carregado com sucesso!");
			logger.info(timer.toString());
			
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("Error to load Model!");			
			throw new Exception("Error to load Model!");
		}		 
		 tokenizerFactory = new DefaultTokenizerFactory();	
	 }
	
}
