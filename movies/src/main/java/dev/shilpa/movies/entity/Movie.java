package dev.shilpa.movies.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="movies")
public class Movie {

		@Id
	 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	 	
	 	@Column(name="imdbId")
	    private String imdbId;
	    private String title;
	    
	    @Column(name="releaseDate")
	    private String releaseDate;
	    
	    @Column(name="trailerLink")
	    private String trailerLink;
	    private String poster;
	    
	    @Lob
	    @Column(length=100000)
	    private List<String> backdrops;
	    
	    private List<String> genres;
	    
	    @OneToMany(mappedBy = "movie" ,cascade = CascadeType.ALL)
	    @JsonIgnore
	    private List<Review> reviews;
}
