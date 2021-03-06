package project.Repositories;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import project.Database.Vehicle;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Long> {

	public Iterable<Vehicle> findByColor(String key);
	public Iterable<Vehicle> findByVin(String key);
	public Iterable<Vehicle> findByMake(String key);
	public Iterable<Vehicle> findByModel(String key);
	public Iterable<Vehicle> findByMpg(String key);
	public Iterable<Vehicle> findByYear(String key);
	public Iterable<Vehicle> findByPrice(String key);
	public Iterable<Vehicle> findByMakeAndModelAndYear(String make, String model, String year);

	public Iterable<Vehicle> findByMakeAndModelAndYearAndPriceAndColorAndMpgAndVin(String make, String model, String year, String
			price, String color, String mpg, String vin);
}
