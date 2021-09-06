package com.HH.InheritanceMappingProj;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy = InheritanceType.JOINED)
public class Animal {
	@Id
	private long animalId;
	private String species;
	@Override
	public String toString() {
		return "Animal [animalId=" + animalId + ", species=" + species + "]";
	}
	public long getAnimalId() {
		return animalId;
	}
	public void setAnimalId(long animalId) {
		this.animalId = animalId;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	
}
