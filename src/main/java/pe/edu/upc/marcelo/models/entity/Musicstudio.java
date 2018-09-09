package pe.edu.upc.marcelo.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="musicstudios")
public class Musicstudio implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String name;
	
	@NotNull
	private String address;
	
	@NotNull
	private String phonenumber;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="musicstudioowner_id")
	private Musicstudioowner musicstudioowner;
	
	@OneToMany(mappedBy="musicstudio", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<StudioRoom> studiorooms;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Musicstudioowner getMusicstudioowner() {
		return musicstudioowner;
	}

	public void setMusicstudioowner(Musicstudioowner musicstudioowner) {
		this.musicstudioowner = musicstudioowner;
	}

	public List<StudioRoom> getStudiorooms() {
		return studiorooms;
	}

	public void setStudiorooms(List<StudioRoom> studiorooms) {
		this.studiorooms = studiorooms;
	}
	
	public void addStudioroom(StudioRoom studioroom) {
		this.studiorooms.add(studioroom);
	}
}
