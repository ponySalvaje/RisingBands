package pe.edu.upc.marcelo.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="bookings")
public class Booking implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private Date bookdate;
	
	@NotNull
	private Integer starthour;
	
	@NotNull
	private Integer amounthour;
	
	@NotNull
	private Integer endhour;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="studioroom_id")
	private Studioroom studioroom;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="band_id")
	private Band band;

	//Access methods
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getBookdate() {
		return bookdate;
	}

	public void setBookdate(Date bookdate) {
		this.bookdate = bookdate;
	}

	public Integer getStarthour() {
		return starthour;
	}

	public void setStarthour(Integer starthour) {
		this.starthour = starthour;
	}

	public Integer getAmounthour() {
		return amounthour;
	}

	public void setAmounthour(Integer amounthour) {
		this.amounthour = amounthour;
	}

	public Integer getEndhour() {
		return endhour;
	}

	public void setEndhour(Integer endhour) {
		this.endhour = endhour;
	}

	public Studioroom getStudioroom() {
		return studioroom;
	}

	public void setStudioroom(Studioroom studioroom) {
		this.studioroom = studioroom;
	}

	public Band getBand() {
		return band;
	}

	public void setBand(Band band) {
		this.band = band;
	}
}
