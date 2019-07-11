package com.ivvysoft.tc;

import java.util.List;

import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NonNull;

@Data
public class Taco {

	@NonNull
	@Size(min = 5, message = "The name must be at least 5 characters long")
	private String name;

	@Size(min = 2, message = "You must choose at least 2 ingredients")
	private List<String> ingredients;

	public Taco() {
	}

}