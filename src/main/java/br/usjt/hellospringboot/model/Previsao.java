package br.usjt.hellospringboot.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NamedQuery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="previsoes")
@NamedQuery (name = "Cidade.buscarPelaLatitudeEPelaLongitude",
query = "SELECT * FROM Cidade c WHERE latitude = :latitude AND longitude = :longitude")
public class Previsao implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Double Min;
	private Double Max;
	private Double hum;
	private String des;
	private String data;
	private Double hora;

	@OneToOne(optional=true, cascade = {CascadeType.ALL})
	@JoinColumn (name = "dia")
	private Dia dia;

	@ManyToOne (cascade = {CascadeType.ALL})
	@JoinColumn (name="cidade_id")
	private Cidade cidade;
}
