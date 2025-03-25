package com.projectest.sigcon.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class Containeryard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String equipment;//this is the number container


	// this methods will utilize for modify or update number container.
	public void setEquipment(String equipment) {this.equipment = equipment;}


	public String getEquipment() {
		return equipment;
	}


	public enum Size_equipment{
		TWENTY_FOOT,
		FOURTY_FOOT;

	}

	public enum Type_equipment{
		DRY_VAN,
		HIGH_CUBE,
		HIGH_CUBE_REFORCE,
		REEFER,
		OPEN_TOP,
		FLAT_RACK;

	}

	public enum State_equipment{
		DAMAGED,
		DIRTY,
		GOOD;

	}


	public static class Containerdefine{ //Define a Container with its properties


		private Containeryard containeryard;
		private Size_equipment size;
		private Type_equipment type;
		private State_equipment state;


		public Size_equipment getSize() {
			return size;
		}




		public void setSize(Size_equipment size) {
			this.size = size;
		}




		public Type_equipment getType() {
			return type;
		}




		public void setType(Type_equipment type) {
			this.type = type;
		}




		public State_equipment getState() {
			return state;
		}




		public void setState(State_equipment state) {
			this.state = state;
		}


		@Override
		public String toString() {
		    return "Container{" +
                    "Equipment='" + containeryard.getEquipment() + '\'' +
                    ", Size=" + getSize()+
                    ", type=" + getType()+
                    ", Status='" + getState()+ '\'' +
                    '}';
		}


	}


}









