package com.revalu.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "epd_data")
public class Product {

    @Id
    private String id;
    private String uuid;
    private String name;
    private List<Category> categories;
    private List<String> tags;

    public Product() {}

    public Product(String uuid, String name, List<Category> categories, List<String> tags) {
        this.uuid = uuid;
        this.name = name;
        this.categories = categories;
        this.tags = tags;
    }


    // Getters and Setters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

}
