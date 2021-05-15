package com.example.springrelations.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Post extends AuditModel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String title;
	
	@Lob
	private String Description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	
	@ManyToMany(
		fetch = FetchType.LAZY,
		cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE
			}
	)
	@JoinTable(
		name = "post_tags",
		joinColumns = {@JoinColumn(name = "post_id")},
		inverseJoinColumns = {@JoinColumn(name = "tag_id")}
	)
	private Set<Tag> tags = new HashSet<>();

	@Override
	public String toString() {
		return "Post [title=" + title + ", Description=" + Description + "]";
	}
}
