package org.paradifference.makeadifference.entity;

import javax.persistence.*;


@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long project_id;

    @Column
    private String project_name;

    @Column
    private String project_description;

    @Column
    private String project_categories;

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getProject_description() {
        return project_description;
    }

    public void setProject_description(String project_description) {
        this.project_description = project_description;
    }

    public String getProject_categories() {
        return project_categories;
    }

    public void setProject_categories(String project_categories) {
        this.project_categories = project_categories;
    }


}
