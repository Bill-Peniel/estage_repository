package com.mef.estage;

import com.mef.estage.entities.Stages.Stage;
import com.mef.estage.entities.Stages.Stagiaire;
import com.mef.estage.entities.Stages.StatutStage;
import com.mef.estage.entities.Stages.TypeStage;
import com.mef.estage.repositories.StageRepository;
import com.mef.estage.repositories.StagiaireRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

@SpringBootApplication
public class EstageApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstageApplication.class, args);
	}
// Test d'neregistrement des données en base pour test
//	@Bean
//	CommandLineRunner commandLineRunner(StagiaireRepository stagiaireRepository,
//										StageRepository stageRepository){
//
//		return args -> {
//			stagiaireRepository.save(Stagiaire.builder().firstName("CHABI YAROU").code("123").
//					lastName("Nourou-Dine").filière("IG").build());
//			stagiaireRepository.save(Stagiaire.builder().firstName("CHABI YAROU").code("124").
//					lastName("Tamba Ridwan").filière("FM").build());
//			stagiaireRepository.save(Stagiaire.builder().firstName("CHABI YAROU").code("125").
//					lastName("Hanane").filière("FM").build());
//			stagiaireRepository.save(Stagiaire.builder().firstName("CHABI YAROU").code("126").
//					lastName("Maissarath").filière("FA").build());
//
//			TypeStage[] typeStages = TypeStage.values();
//			Random random = new Random();
//			stagiaireRepository.findAll().forEach(st->{
//				for (int i = 0; i <5 ; i++) {
//					int index = random.nextInt(typeStages.length);
//					Stage stage = Stage.builder()
//							.typeStage(typeStages[index])
//							.statutStage(StatutStage.PROGRESS)
//							.dateDebut(new Date())
//							.stagiaire(st)
//							.build();
//				}
//			});
	//	};
	//}

}
