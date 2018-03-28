
package us.kbase.chandrikasmktest;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: TestResult</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "gene",
    "abundance"
})
public class TestResult {

    @JsonProperty("gene")
    private String gene;
    @JsonProperty("abundance")
    private Double abundance;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("gene")
    public String getGene() {
        return gene;
    }

    @JsonProperty("gene")
    public void setGene(String gene) {
        this.gene = gene;
    }

    public TestResult withGene(String gene) {
        this.gene = gene;
        return this;
    }

    @JsonProperty("abundance")
    public Double getAbundance() {
        return abundance;
    }

    @JsonProperty("abundance")
    public void setAbundance(Double abundance) {
        this.abundance = abundance;
    }

    public TestResult withAbundance(Double abundance) {
        this.abundance = abundance;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((("TestResult"+" [gene=")+ gene)+", abundance=")+ abundance)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
