package com.app.pojos;

import java.util.List;

public class Intern {

	
	
	private int id;
    private String name;
    private String batch;
    private List<String>technologies;
    public Intern(int id, String name, String batch, List<String> technologies) {
            super();
            this.id = id;
            this.name = name;
            this.batch = batch;
            this.technologies = technologies;
    }
    public Intern() {
            super();
            // TODO Auto-generated constructor stub
    }
    public int getId() {
            return id;
    }
    public void setId(int id) {
            this.id = id;
    }
    public String getName() {
            return name;
    }
    public void setName(String name) {
            this.name = name;
    }
    public String getBatch() {
            return batch;
    }
    public void setBatch(String batch) {
            this.batch = batch;
    }
    public List<String> getTechnologies() {
            return technologies;
    }
    public void setTechnologies(List<String> technologies) {
            this.technologies = technologies;
    }
    
    

}

