package com.shop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Generated;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Stoc {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private Integer stoc;

	@OneToOne(mappedBy = "stoc")
	@JsonIgnore
	private Product product;
}
