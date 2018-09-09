package pe.edu.upc.marcelo.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="studiorooms")
public class StudioRoom implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String name;
	
	@NotNull
	@Range(min=0, max=200)
	private Float pricehour;

	@ManyToOne(fetch=FetchType.LAZY)
	@JsonManagedReference
	private Musicstudio musicstudio;
	
	@NotNull
	private String daysavailable;
	
	//Access methods

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPricehour() {
		return pricehour;
	}

	public void setPricehour(Float pricehour) {
		this.pricehour = pricehour;
	}

	public Musicstudio getMusicstudio() {
		return musicstudio;
	}

	public void setMusicstudio(Musicstudio musicstudio) {
		this.musicstudio = musicstudio;
	}

	public String getDaysavailable() {
		return daysavailable;
	}

	public void setDaysavailable(String daysavailable) {
		this.daysavailable = daysavailable;
	}
}
