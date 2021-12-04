package Reto2_Web.interfaces;

import Reto2_Web.model.Clothe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterfaceClothe extends MongoRepository<Clothe, String> {

}
