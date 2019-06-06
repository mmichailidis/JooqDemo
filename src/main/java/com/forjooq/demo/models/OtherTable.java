package com.forjooq.demo.models;

import com.fasterxml.jackson.databind.JsonNode;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@TypeDefs({
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
@Table(name = "othertable")
public class OtherTable {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "whatever")
    private String whatever;

    @Type(type = "jsonb")
    @Column(name = "simplename", columnDefinition = "jsonb")
    private JsonNode simplename;

    public OtherTable() {
    }

    public OtherTable(Integer id, String whatever) {
        this.id = id;
        this.whatever = whatever;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWhatever() {
        return whatever;
    }

    public void setWhatever(String whatever) {
        this.whatever = whatever;
    }

    public JsonNode getSimplename() {
        return simplename;
    }

    public void setSimplename(JsonNode simplename) {
        this.simplename = simplename;
    }
}
